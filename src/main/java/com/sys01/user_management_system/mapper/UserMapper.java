package com.sys01.user_management_system.mapper;


import com.sys01.user_management_system.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("Insert into user(username,password) values(#{username},#{password}) ")
    void registerUser(String username,String password);

    @Delete("DELETE from user where username like #{username}")
    void deleteUser(String username);

    @Select("select username from user")
    List<String> selectAllUsers();

    @Select("select id,username,password,email,create_time from user where username like #{username}")
    User selectUserByName(String username);

    @Update("update user set password=#{password} where username like #{username}")
    void updatePwdByName(String username, String password);
}
