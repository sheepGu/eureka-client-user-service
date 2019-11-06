package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/9/1 19:58
 * @Created by gumei
 * @Author: lepua
 */
@RestController
public class UserController {
    @GetMapping("/user/hello")
    public String hello(){
        return "hello";
    }
}
