package com.yilaguan.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author w.yi
 * @date 2021/4/14
 */
@Controller
public class demoController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
