package com.demo04;

import org.springframework.stereotype.Component;

@Component("apiB")
public class ApiImpl02 implements Api {
    @Override
    public void dosomething() {
        System.out.println("b do");
    }
}
