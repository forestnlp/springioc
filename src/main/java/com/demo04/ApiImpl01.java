package com.demo04;

import org.springframework.stereotype.Component;

@Component("apiA")
public class ApiImpl01 implements Api {
    @Override
    public void dosomething() {
        System.out.println("a do ");
    }
}
