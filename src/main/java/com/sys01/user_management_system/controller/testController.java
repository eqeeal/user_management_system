package com.sys01.user_management_system.controller;


import com.sys01.user_management_system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
//    @GetMapping("/test")
    public  String testController() {


        System.out.println("testController");


//        return "testController--请求test接口";
        return testService.greet();
    }
}
