package strategy.impl;

import strategy.interfaces.FlyBehavior;

public class FlyNoway implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
