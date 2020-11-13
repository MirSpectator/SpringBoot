package com.eat.service;

import com.eat.comom.RspMsg;
import com.eat.entity.User;

/**
 * @version V1.0
 * @Package com.eat.service
 * @ClassName UserService
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/10/14 23:48
 **/
public interface UserService {
    // TODO 注册的用户
    RspMsg add();
    // TODO 查询用户，验证密码 ，用过实体类
    RspMsg SelectUser(User user);
    // TODO 查询用户，通过用户的名称查询用户
    User SelectUserByUserName(String UserName);

}
