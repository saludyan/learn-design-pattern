package com.codingera.Adapter;

/**
 * Created by Yan on 2017/5/3.
 */
public class TestAdapter {

    public static void main(String[] args) {
        Person person = new Person();
        Animal animal = new PersonAdapter(person);

        System.out.println("动物吃:" + animal.eat());
    }
}
