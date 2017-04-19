package com.codingera.Strategy;

public abstract class AbstractDuck {

	protected FlyBehavior flyBehavior;

	public void perFormFly() {
		// TODO - implement AbstractDuck.perFormFly
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}

}