package com.hwz.staff.model;

import java.util.Date;

/**
 * Created by ZhangZaipeng on 2017/7/1.
 *
 * import javax.validation.constraints.Min;
 * @Min(value = 19 , message= "。。。。验证提示")
 * @Valid
 * BindingResult bindingResult
 */
public class StaffAgent {
    private Long staffAgentId;    // '自增长主键',

    private String realName;       // '员工真实姓名',
    private String loginPwd;       // '登录密码',
    private Integer roleId;        // '员工隶属角色',

    public Long getStaffAgentId() {
        return staffAgentId;
    }

    public void setStaffAgentId(Long staffAgentId) {
        this.staffAgentId = staffAgentId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
