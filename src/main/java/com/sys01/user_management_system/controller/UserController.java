package com.sys01.user_management_system.controller;


import com.sys01.user_management_system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserMapper userMapper;
    /**
     * 注册账户
     */
    @RequestMapping("/register")
    public String registerUser(String username,String password){
    userMapper.registerUser(username,password);
    return "success";
    }


    //删除用户
    @RequestMapping("/delete")
    public String deleteUser(String username){
        userMapper.deleteUser(username);
        return "success delete user:" + username;
    }

    //查询所有用户
    @RequestMapping("/selectAllUsers")
    public List<String> selectAllUsers(){
        return userMapper.selectAllUsers();
    }

    //更新用户密码
    @RequestMapping("/updatePwd")
    public String updatePwd(String username,String password){
        //1.传入要更新的账号，传入要更新的密码
        userMapper.updatePwdByName(username,password);
        return username+"success change password";
    }
}
