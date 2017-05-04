package com.codingera.TemaplteMethod;

/**
 * Created by Yan on 2017/5/4.
 */
public class TestTemplateMethod {

    public static void main(String[] args){
        AbstractCookInstantinNoodles kangshifu = new KangShifu();
        kangshifu.cook();

        System.out.println("----------------------");

        AbstractCookInstantinNoodles tongyi = new TongYi();
        tongyi.cook();
    }
}
