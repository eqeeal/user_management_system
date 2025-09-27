package com.sys01.user_management_system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

//    default int count(){
//        return 66;
//    }
    @Select("select count(*) from user")
    int count();

}
