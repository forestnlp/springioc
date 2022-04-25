package com.demo06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        Walkable walk = new WalkableImpl();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before doing prepare");
                Object res = method.invoke(walk,args);
                System.out.println("after done clean");
                return res;
            }
        };

        Walkable o = (Walkable)Proxy.newProxyInstance(walk.getClass().getClassLoader(), walk.getClass().getInterfaces(), handler);
        o.walk();
    }
}
