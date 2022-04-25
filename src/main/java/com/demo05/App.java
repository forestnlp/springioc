package com.demo05;


import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("app")
public class App implements Api{
    @Resource(name = "ApiImplB")
    private Api api;

    public Api getApi() {
        return api;
    }

    public void setApi(Api api) {
        this.api = api;
    }
}
