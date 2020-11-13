package com.eat.service.impl;

import com.eat.comom.MsgConst;
import com.eat.comom.RspMsg;
import com.eat.dao.UserMapper;
import com.eat.entity.User;
import com.eat.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version V1.0
 * @Package com.eat.service.impl
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/10/14 23:49
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public RspMsg add() {
        User user = new User("a", "123", "123", "123","123","123","123");
        int s = this.userMapper.addUser(user);
        return RspMsg.Success();
    }

    @Override
    public RspMsg SelectUser(User user) {
        if(user==null){
            return  RspMsg.createRspMsg(MsgConst.CODE_VAR_NOT_NULL, MsgConst.MSG_CODE_VAR_NOT_NULL);
        }
        List<User> list = this.userMapper.SelectUserByUser(user);
        return RspMsg.Success(list);
    }

    @Override
    public User SelectUserByUserName(String UserName) {
        if(StringUtils.isEmpty(UserName)){
            return  null;
        }
        User  user = new User();
        user.setUser_name(UserName);
        List<User> list = this.userMapper.SelectUserByUser(user);
        if(list.size()!=1){
            return null;
        }
        return list.get(0);
    }


}
