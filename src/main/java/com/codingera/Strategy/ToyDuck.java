package com.codingera.Strategy;

public class ToyDuck extends AbstractDuck {

	public ToyDuck() {
		this.flyBehavior = new FlyNoWay();
	}

}