package com.demo01.entity;

import org.springframework.beans.factory.FactoryBean;

public class UserFactory2 implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User(86,"ak");
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
