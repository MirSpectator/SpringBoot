package com.eat.vo;

import java.io.Serializable;

/**
 * @version V1.0
 * @Package com.eat.vo
 * @ClassName LoginVo
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/11/19 0:17
 **/
public class LoginVo implements Serializable {
    private static final long serialVersionUID = 3895411243111261715L;

    private String TOKEN;
    private String PublicKeyStr;

    public LoginVo(String TOKEN, String publicKeyStr) {
        this.TOKEN = TOKEN;
        PublicKeyStr = publicKeyStr;
    }

    public String getTOKEN() {
        return TOKEN;
    }

    public void setTOKEN(String TOKEN) {
        this.TOKEN = TOKEN;
    }

    public String getPublicKeyStr() {
        return PublicKeyStr;
    }

    public void setPublicKeyStr(String publicKeyStr) {
        PublicKeyStr = publicKeyStr;
    }
}
