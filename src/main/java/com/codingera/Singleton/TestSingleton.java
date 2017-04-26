package com.codingera.Singleton;

/**
 * Created by Yan on 2017/4/26.
 */
public class TestSingleton {

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100;i++){

            Runnable t = new Runnable() {
                public void run() {
                    // 如果打印都是同一hashCode,证明是同一个例子
                    System.out.println(Singleton.getInstance().hashCode());
                }
            };

            new Thread(t).start();
        }

        Thread.currentThread().sleep(10000);
    }
}
