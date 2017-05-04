package com.codingera.TemaplteMethod;

public abstract class AbstractCookInstantinNoodles {

	public void boilWater() {
		System.out.println("煮沸热水...");
	}

	public abstract void sauce();

	public void pourIncup() {
		System.out.println("热水倒进杯子...");
	}

	public abstract void waitMoment();

	public void cook() {
		System.out.println(String.format("下个%s泡面",this.name()));
		this.boilWater();
		this.sauce();
		this.pourIncup();
		this.waitMoment();
	}

	public abstract String name();

}