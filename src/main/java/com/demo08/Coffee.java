package com.demo08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Coffee implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, DisposableBean {

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext applicationContext;

    private String name;

    public void init(){
        System.out.println("init");
    }

    public void close(){
        System.out.println("close");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("distroying");
    }
}
