package factory;

import simpleFactory.pizza.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chStore =  new CHPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		
		pizza = chStore.orderPizza("cheese");
	}
}
