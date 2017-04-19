package com.codingera.Strategy;

public class GreenHeadDuck extends AbstractDuck {

	public GreenHeadDuck() {
		this.flyBehavior = new FLyWithWings();
	}

}