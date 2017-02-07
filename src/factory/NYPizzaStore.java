package factory;

import simpleFactory.pizza.NYCheesePizza;
import simpleFactory.pizza.NYClamPizza;
import simpleFactory.pizza.NYVeggiePizza;
import simpleFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new NYCheesePizza();
		} else if(type.equals("veggie")){
			return new NYVeggiePizza();
		} else if(type.equals("clam")){
			return new NYClamPizza();
		} else return null;
	}

}
