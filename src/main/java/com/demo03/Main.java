package com.demo03;

import com.demo03.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring03.xml");
        User user1 = ctx.getBean("user1", User.class);
        System.out.println(user1);
    }
}
