package com.outman.po;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: outman
 * Date: 2017/7/7
 * Time: 下午9:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class User implements Serializable{

    private Integer uid;//用户id

    private String username;//用户名称
    private String time_add;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTime_add() {
        return time_add;
    }

    public void setTime_add(String time_add) {
        this.time_add = time_add;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}
