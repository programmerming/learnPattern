package decorator.coffee;

import decorator.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	@Override
	public double cost() {
		return 0.99;
	}

}
