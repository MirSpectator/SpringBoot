package com.eat.controller;

import com.eat.ao.loginAo;
import com.eat.comom.RspMsg;

import com.eat.util.interfaces.JWT;
import com.eat.entity.User;
import com.eat.service.UserService;


import com.eat.util.interfaces.Redis;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.jose4j.lang.JoseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version V1.0
 * @Package com.eat.controller
 * @ClassName test
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/10/13 23:57
 **/
@Controller
@ResponseBody
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private  JWT jwt;

    @Autowired
    private Redis redis;

    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public  RspMsg Login(@RequestBody loginAo loginAo)  {

        //System.out.println(subject.getPrincipal());
        return userService.Login(loginAo);
    }


    @RequestMapping(value = "/CreateUser",method = {RequestMethod.POST})
    public  RspMsg CreateUser(@RequestBody User user){

        return  this.userService.CreateUser(user);
    }
    @RequestMapping(value = "/two",method = {RequestMethod.GET})
    public  String two(){

       /* redis.set("1", 123);
        System.out.println(redis.get("1"));
        User user = new User();
        user.setUser_name("测试数据");
        user.setUser_phone("17637945521");
        redis.hset("123", "123", user);
        System.out.println(redis.hget("123", "123").getClass());
        System.out.println(((User)redis.hget("123", "123")).getUser_name());
        redis.set("456", user);
        System.out.println(redis.get("456"));*/
       /*String token =  jwt.createToken("123");
        System.out.println(token);
       String accout = (String) jwt.verifyTokenObject(token);*/
        return  "验证成功";
    }
}
