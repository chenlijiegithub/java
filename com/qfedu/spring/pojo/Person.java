package com.qfedu.spring.pojo;

import java.util.*;

public class Person {

    private String name;
    private Integer age;
    private Car car;

    private Object [] alias;//数组类型的注入
    private List friends;//list类型注入
    private Set set;//set类型注入
    private Map map;//map类型注入

    private Properties properties;//properties类型注入

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List getFriends() {
        return friends;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Object[] getAlias() {
        return alias;
    }

    public void setAlias(Object[] alias) {
        this.alias = alias;
    }

    public Person(Car car, String name) {
        this.name = name;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person() {
        System.out.println("Person对象创建了");
    }

    public void init(){
        System.out.println("Person对象初始化了");
    }

    public void destroy(){
        System.out.println("Person对象销毁了");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", alias=" + Arrays.toString(alias) +
                ", friends=" + friends +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
