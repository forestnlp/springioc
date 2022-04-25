package com.demo08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring08.xml");
        Coffee coffee = (Coffee)ctx.getBean("coffee");
        ctx.close();
    }
}
