package com.eat.controller;

import com.eat.comom.RspMsg;

import com.eat.util.integer.JWT;
import com.eat.entity.MyToken;
import com.eat.entity.User;
import com.eat.service.UserService;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
    UserService userService;

    @Autowired
    JWT jwt;


    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public  RspMsg Login(User user){
        Subject subject = SecurityUtils.getSubject();
        //UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        //生成自己的Token
        user.setUser_phone("17637945521");
        user.setUser_name("123");
        user.setOpenid("123456openid");
        String token = jwt.createToken(user);
        MyToken myToken = new MyToken(token);
        subject.login(myToken);
        System.out.println("登录成功");
        System.out.println(subject.getPrincipal());
        return RspMsg.Success(myToken);
    }
    @RequestMapping(value = "/logins",method = {RequestMethod.GET})
    public  RspMsg Logins(User user){
        Subject subject = SecurityUtils.getSubject();
        //UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken();
        //生成自己的Token
        user.setUser_phone("17637945521");
        user.setUser_name("123");
        user.setOpenid("123456openid");
        String token = jwt.createToken(user);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("123","123");
        subject.login(usernamePasswordToken);
        return RspMsg.Success();
    }



    @RequestMapping(value = "/CreateUser",method = {RequestMethod.GET})
    public  RspMsg CreateUser(User user){
        RspMsg rspMsg = this.userService.add();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
               "123",
                "111"
        );
        subject.login(usernamePasswordToken);
        System.out.println("插入数据结果:"+rspMsg.toString());
        System.out.println("111111进来了");

      /*  //生成密匙
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        String jwt = JWTUtils.createJWT("1","test",10000,key);
        System.out.println(jwt);
        System.out.println(JWTUtils.parseJWT(jwt,key));*/
        return  rspMsg;
    }
    @RequestMapping(value = "/two",method = {RequestMethod.GET})
    public  String two(){
       /* RspMsg rspMsg = this.userService.add();
        System.out.println("插入数据结果:"+rspMsg.toString());
        System.out.println("111111进来了");*/

      /*  //生成密匙
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        String jwt = JWTUtils.createJWT("1","test",10000,key);
        System.out.println(jwt);
        System.out.println(JWTUtils.parseJWT(jwt,key));*/
        /*RedisCache r = new RedisCache("1936328948");
        User user = new User();
        user.setUser_name("测试数据");
        user.setUser_phone("17637945521");
        r.putObject("wang", user);
        r.putObject("wzps", "123456");
        Object name = r.getObject("wang");
        User user1 = (User) r.getObject("wang");
        Object names = r.getObject("wzps");
        System.out.println("--------------------->"+name);
        System.out.println("user.name--------------------->"+user1.getUser_name());
        System.out.println("--------------------->"+names);*/
      /*  Subject subject = SecurityUtils.getSubject();
        System.out.println(subject.getSession());
        System.out.println(subject.getPrincipals());
        User user = (User) subject.getSession();
        System.out.println(subject.getPrincipal());*/
        return  "验证成功";
    }
}
