package com.hwz.staff.controller;

import com.github.pagehelper.PageHelper;
import com.hwz.conf.bean.ManBean;
import com.hwz.staff.model.StaffAgent;
import com.hwz.staff.mapper.StaffAgentMapper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhangZaipeng on 2017/7/4 0004.
 * -------------------- spring 注解 ----------------------
 * @Controller 必须配合模板使用
 * @RestController 等同于 @Controller + @ResponseBoy
 *
 * 获取请求中的参数
 * @PathVariable : /hwz/hello/{id}
 * @RequestParam(value = "id",required = false, defaultValue = "0") : /hwz/hello?id=2
 * @GetMapping = GET请求的@RequestMapping
 *
 * -------------------- swagger 注解 ----------------------
 * @ApiOperation 注解来给API增加说明
 * @ApiImplicitParam 注解来给参数增加说明
 * @ApiImplicitParams 是 @ApiImplicitParam集合
 *
 */
@Controller
@RequestMapping(value = "/staff")
public class StaffAgentController {

    private Logger logger = LoggerFactory.getLogger(StaffAgentController.class);

    @Autowired
    private StaffAgentMapper staffAgentMapper;

    @Autowired
    private ManBean manProperties;

    @ApiOperation(value="获取用户详细信息", notes="根据url的staff_agent_id来获取用户详细信息")
    @ApiImplicitParam(name = "staff_agent_id", value = "用户ID", required = true, dataType = "Long")
    @GetMapping(value = "/get_staff/{staff_agent_id}")
    @ResponseBody
    public StaffAgent getStaffAgentById(@PathVariable("staff_agent_id") Long staffAgentId) {
        logger.info("staff_agent_id --> " + staffAgentId);
        return  staffAgentMapper.selectStaffAgentById(staffAgentId);
    }

    //
    @GetMapping(value = "/staff_list")
    @ApiOperation(value="获取用户列表", notes="notes")
    @ResponseBody
    public List<StaffAgent> StaffPage1() {

        List<StaffAgent> staffAgents = staffAgentMapper.selectStaffAgents();

        return staffAgents;
    }

    // 最好用
    @GetMapping(value = "/staff_page/{staff_agent_id}")
    public ModelAndView StaffPage2(@PathVariable("staff_agent_id") Long staffAgentId) {

        StaffAgent staffAgent = staffAgentMapper.selectStaffAgentById(staffAgentId);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("staffAgentId", staffAgent.getStaffAgentId());
        map.put("realName", staffAgent.getRealName());
        map.put("loginPwd", staffAgent.getLoginPwd());
        return new ModelAndView("staff.ftl", map);
    }

    // 获取用户界面
    @GetMapping(value = "/staff_pages")
    public ModelAndView StaffPage2() {

        List<StaffAgent> staffAgents = staffAgentMapper.selectStaffAgents();

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("staffAgents", staffAgents);
        PageHelper.startPage(1,3);
        return new ModelAndView("staffs.ftl", map);
    }

}
