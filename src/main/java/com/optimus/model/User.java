package com.optimus.model;


/**
 * Created by Dongchuang on 2017/11/13.
 */

public class User {
    /**
     * 用户id
     */
    private String id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户密码
     */
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
