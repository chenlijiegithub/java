package com.qfedu.spring.proxy2;

import com.qfedu.spring.proxy2.MeiNv;

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
