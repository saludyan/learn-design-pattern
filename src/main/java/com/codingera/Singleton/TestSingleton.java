package com.codingera.Singleton;

/**
 * Created by Yan on 2017/4/26.
 */
public class TestSingleton {

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100;i++){

            Runnable t = new Runnable() {
                public void run() {
                    Singleton.getInstance().subtraction();
                    Singleton.getInstance().showNumber();
                }
            };
            Runnable t2 = new Runnable() {
                public void run() {
                    Singleton.getInstance().subtraction();
                    Singleton.getInstance().showNumber();
                }
            };
            Runnable t3 = new Runnable() {
                public void run() {
                    Singleton.getInstance().subtraction();
                    Singleton.getInstance().showNumber();
                }
            };
            new Thread(t).start();
            new Thread(t2).start();
            new Thread(t3).start();
        }

        Thread.currentThread().sleep(10000);
    }
}
