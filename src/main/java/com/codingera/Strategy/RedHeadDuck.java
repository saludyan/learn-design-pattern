package com.codingera.Strategy;

public class RedHeadDuck extends AbstractDuck {

	public RedHeadDuck() {
		this.flyBehavior = new FLyWithWings();
	}

}