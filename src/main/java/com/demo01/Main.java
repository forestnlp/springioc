package com.demo01;

import com.demo01.dao.UserDao;
import com.demo01.entity.Emp;
import com.demo01.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ioc1
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring01.xml");
        User user = (User)ctx.getBean("user");
        System.out.println(user);

        User user2 = (User)ctx.getBean("user2");
        System.out.println(user2);

        User user3 = (User)ctx.getBean("user3");
        System.out.println(user3);

        User user4 = (User)ctx.getBean("user4");
        System.out.println(user4);

        User user5 = (User)ctx.getBean("user5");
        System.out.println(user5);

        User user6 = (User)ctx.getBean("user6");
        System.out.println(user6);

        //ioc2
        UserDao userDao = (UserDao) ctx.getBean("userDao");
        userDao.save(user);

        //ioc3
        Emp emp = ctx.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}