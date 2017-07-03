package com.hwz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Zhangzaipeng on 2017/7/2.
 *
 * @Controller 必须配合模板使用
 * @RestController 等同于 @Controller + @ResponseBoy
 *
 * 获取请求中的参数
 * @PathVariable : /hwz/hello/{id}
 * @RequestParam(value = "id",required = false, defaultValue = "0") : /hwz/hello?id=2
 * @GetMapping = GET请求的@RequestMapping
 *
 */
@RestController
@EnableAutoConfiguration
class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Autowired
    private ManProperties manProperties;

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String home(@PathVariable("id") Integer id){
        return "hello Spring Boot!" + "-->" + id;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String home1(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id){
        return "hello Spring Boot!" + "-->" + id;
    }

    @RequestMapping(value = "/man",method = RequestMethod.GET)
    public ManProperties getMan(){ return manProperties; }

    @RequestMapping(value = "/param", method = RequestMethod.GET)
    public String param(){
        return "hello Spring Boot!" + "-->" + cupSize;
    }
}
