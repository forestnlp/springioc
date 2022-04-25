package com.demo01.dao;

import com.demo01.entity.User;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("db save ："+user);
    }
}
