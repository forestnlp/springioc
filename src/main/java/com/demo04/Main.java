package com.demo04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring04.xml");
        App app = ctx.getBean("app",App.class);
        app.work();
    }
}
