package com.qfedu.spring.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    static Object object1=null;
    public static void main(String[] args) {


        //创建被代理对象
        MeiNv lmm=new LMM();
        MeiNv mp=(MeiNv)Proxy.newProxyInstance(lmm.getClass().getClassLoader(), lmm.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                object1=proxy;
                //method被代理者要运行的方法。
                //args被代理者要运行的方法的参数。
                String methodName=method.getName();
                if(methodName.equals("eat")){
                    System.out.println("提醒减肥计划尚未完成。");//吃饭的前置切面
                }
                Object obj=method.invoke(lmm,args);
                if(methodName.equals("eat")){
                    System.out.println("罪过罪过。");//吃饭的后置切面
                }

                System.out.println(proxy.getClass().getName());
                return obj;
            }
        });
        mp.shopping();
        mp.eat();
        System.out.println(mp.getClass().getName());

        System.out.println(mp==object1);
    }
}
