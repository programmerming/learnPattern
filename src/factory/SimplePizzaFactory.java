package factory;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type){
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if(type.equals("greek")){
			pizza = new GreekPizza();
		}
		
		return pizza;
	}
}
