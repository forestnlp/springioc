package com.demo01.entity;

import java.util.List;

public class User {
    private int id;
    private String userName;
    private String roleid;

    private List<String> ls_alies;

    public List<String> getLs_alies() {
        return ls_alies;
    }

    public void setLs_alies(List<String> ls_alies) {
        this.ls_alies = ls_alies;
    }

    public User() {
    }

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", roleid='" + roleid + '\'' +
                ", ls_alies='" + ls_alies + '\'' +
                '}';
    }
}
