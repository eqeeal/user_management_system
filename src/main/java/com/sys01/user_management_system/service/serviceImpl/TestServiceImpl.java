package com.sys01.user_management_system.service.serviceImpl;

import com.sys01.user_management_system.mapper.TestMapper;
import com.sys01.user_management_system.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper  testMapper;

    @Override
    public String greet(){
        return "hello from TestServiceImpl"+testMapper.count();
    }

}
