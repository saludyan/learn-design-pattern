package com.codingera.Singleton;

public class Singleton {

	private volatile static Singleton singleton;

	private Integer number = 100;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null){
			synchronized (Singleton.class){
				singleton = new Singleton();
			}
		}
		return singleton;
	}

	public void subtraction(){
		number --;
	}

	public void showNumber(){
		System.out.println("当前数字:"+number);
	}

}