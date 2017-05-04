package com.codingera.TemaplteMethod;

public class KangShifu extends AbstractCookInstantinNoodles {

	public void sauce() {
		System.out.println("放调味料...");
		System.out.println("放香肠...");
	}

	public void waitMoment() {
		System.out.println("等待5分钟...");
	}

	public String name() {
		return "康师傅";
	}

}