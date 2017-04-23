package com.codingera.Observer;

/**
 * Created by Yan on 2017/4/23.
 */
public class TestObserver {

    public static void main(String[] args){
        Radio observable = new Radio();

        InterfaceObserver gzRadio = new GzRadio(observable);
        InterfaceObserver szRadio = new SzRadio(observable);

        observable.notifyObserver("我发消息啦!!!");

        observable.removeObserver(szRadio);//删除深圳订阅
        System.out.println("----移除深圳订阅");
        observable.notifyObserver("我又发消息啦!!!");
    }
}
