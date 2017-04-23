package com.codingera.Observer;

public class SzRadio implements InterfaceObserver, InterfaceBroadcast {


	private String message;

	/**
	 *
	 * @param radio
	 */
	public SzRadio(Radio radio) {
		radio.registerObserver(this);
	}

	/**
	 *
	 * @param parameter
	 */
	public void update(String parameter) {
		this.message = parameter;
		this.broadcast();
	}

	public void broadcast() {
		System.out.println("深圳收到广播内容:"+this.message);
	}

}