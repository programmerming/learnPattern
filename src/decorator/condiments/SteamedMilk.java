package decorator.condiments;

import decorator.Beverage;

public class SteamedMilk extends CondimentDecorator{

	Beverage beverage;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", SteamedMilk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

}
