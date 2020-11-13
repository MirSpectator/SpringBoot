package com.eat.dao;

import com.eat.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version V1.0
 * @Package com.eat.dao
 * @ClassName userMapper
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/10/14 23:08
 **/
public interface UserMapper {



    /**
     * @Summary
     * @Param: [user]
     * @Return: java.util.List<com.eat.entity.User>
     * @Author: TheRaging
     * @Date: 2020/10/26 22:25
     * @Description 通过用户实体类查询用户信息
     */
    List<User> SelectUserByUser(User user);


    /**
     * @Summary
     * @Param: [user]
     * @Return: int
     * @Author: TheRaging
     * @Date: 2020/10/26 22:24
     * @Description 添加用户，注册功能
     */
    int addUser(User user);
}
