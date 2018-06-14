package com.qfedu.spring.proxy;

public class WMM  implements  MeiNv{
    @Override
    public void shopping() {
        System.out.println("王美女购物");
    }

    @Override
    public void eat() {
        System.out.println("王美女吃饭");
    }
}
