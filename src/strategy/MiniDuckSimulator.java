package strategy;

import strategy.impl.FlyRocketPowered;
import strategy.model.Duck;
import strategy.model.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.display();
		duck.performQuack();
		duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
