package com.qfedu.spring.proxy;

public class Demo {
    public static void main(String[] args) {
        MeiNv lmm=new LMM();

        //静态代理
        MeiNv mp=new MP(lmm);
        mp.shopping();
        mp.eat();

    }
}
