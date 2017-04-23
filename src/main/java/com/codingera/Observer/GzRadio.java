package com.codingera.Observer;

public class GzRadio implements InterfaceObserver, InterfaceBroadcast {

	private String message;

	/**
	 * 
	 * @param radio
	 */
	public GzRadio(Radio radio) {
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
		System.out.println("广州收到广播内容:"+this.message);
	}

}