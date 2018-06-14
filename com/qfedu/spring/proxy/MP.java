
package com.qfedu.spring.proxy;

//代理者
public class MP implements MeiNv{

    //被代理者
    private MeiNv meinv;
    public MP(MeiNv meinv){
        this.meinv=meinv;
    }
    @Override
    public void shopping() {
        zhuanqian();
        meinv.shopping();
        System.out.println("美女购物后资产确认");//切面
    }

    private void zhuanqian(){
        System.out.println("美女购物前准备资产");
    }

    @Override
    public void eat() {

        meinv.eat();

    }



}
