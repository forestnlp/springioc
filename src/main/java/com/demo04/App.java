package com.demo04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("app")
public class App {
    @Autowired
    private Api api;

    public void work(){
        api.dosomething();
    }
}
