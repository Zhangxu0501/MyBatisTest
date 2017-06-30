package com.zx.mapper;

/**
 * Created by zhangxu on 2017/6/29.
 */
public class User {
private int id;
private String uname;
private String passwd;
    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


}
