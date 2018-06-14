package com.qfedu.spring.factory;

import com.qfedu.spring.pojo.Person;

public class PersonFactory {
    public static Person createPersonStatic(){
        System.out.println("静态工厂创建Person");
        return new Person();
    }
    public Person createPerson(){
        System.out.println("非静态工厂创建Person");
        return new Person();
    }

}
