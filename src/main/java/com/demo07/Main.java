package com.demo07;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Crawler crawler = new Crawler();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(crawler.getClass());
        MethodInterceptor methodInterceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object res = null;
                System.out.println("prepare");
                res = methodProxy.invokeSuper(o,objects);
                System.out.println("clean");
                return res;
            }
        };
        enhancer.setCallback(methodInterceptor);
        Crawler newCrawler = (Crawler) enhancer.create();
        newCrawler.getPageContent("");
    }

}
