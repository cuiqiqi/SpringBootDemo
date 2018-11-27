package com.example.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLife implements InitializingBean,DisposableBean {

    private void start() {
        System.out.println("start..BeanLife");
    }

    private void stop() {
        System.out.println("end..BeanLife");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy..BeanLife");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init..BeanLife");
    }
}
