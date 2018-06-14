package com.qfedu.spring.proxy;

public class LMM implements MeiNv{
    @Override
    public void shopping() {
        System.out.println("刘美女购物");
    }

    @Override
    public void eat() {
        System.out.println("刘美女吃饭");
    }
}
