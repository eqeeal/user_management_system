package com.sys01.user_management_system.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {


    @RequestMapping("/test")
//    @GetMapping("/test")
    public  String testController() {
        System.out.println("testController");
        return "testController";
    }
}
