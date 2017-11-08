package com.hwz.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZhangZaipeng on 2017/11/8 0008.
 */
@Controller
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/set")
    @ResponseBody
    public String setData(@RequestParam String data){
        redisService.set(data,data);

        return redisService.get(data).toString();
    }
}
