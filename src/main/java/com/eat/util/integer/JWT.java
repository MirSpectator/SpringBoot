package com.eat.util.integer;

/**
 * @version V1.0
 * @Package com.eat.comom.util
 * @ClassName JWT
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/11/9 19:22
 **/
public interface JWT {
    //
    String createToken(Object account);
    //
    String createToken(String account,String SUBJECT);
    //
    String createToken(String account,String SUBJECT,String AUDIENCE);
    //
    boolean verifyTokenBoolean(String token);
    Object verifyTokenObject(String token);
}
