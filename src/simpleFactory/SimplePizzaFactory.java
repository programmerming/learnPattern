package simpleFactory;

import simpleFactory.pizza.CheesePizza;
import simpleFactory.pizza.GreekPizza;
import simpleFactory.pizza.Pizza;

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
