package com.eat.entity;

import java.io.Serializable;

/**
 * @version V1.0
 * @Package com.eat.entity
 * @ClassName shopping_trolley
 * @Description TODO
 * @Author 王振鹏
 * @date 2020/10/16 22:24
 * TODO 购物车
 **/
public class ShoppingTrolley implements Serializable {
    private static final long serialVersionUID = 1787675672646625443L;
    private Integer shopping_Trolley_id;
    private String openid;
    private String commodity;

    @Override
    public String toString() {
        return "shopping_trolley{" +
                "shopping_Trolley_id=" + shopping_Trolley_id +
                ", openid='" + openid + '\'' +
                ", commodity='" + commodity + '\'' +
                '}';
    }

    public ShoppingTrolley(Integer shopping_Trolley_id, String openid, String commodity) {
        this.shopping_Trolley_id = shopping_Trolley_id;
        this.openid = openid;
        this.commodity = commodity;
    }

    public Integer getShopping_Trolley_id() {
        return shopping_Trolley_id;
    }

    public void setShopping_Trolley_id(Integer shopping_Trolley_id) {
        this.shopping_Trolley_id = shopping_Trolley_id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }
}
