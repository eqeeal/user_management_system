package com.sys01.user_management_system.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    default int count(){
        return 66;
    }
}
