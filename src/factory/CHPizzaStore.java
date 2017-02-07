package factory;

import simpleFactory.pizza.CHCheesePizza2;
import simpleFactory.pizza.CHClamPizza;
import simpleFactory.pizza.CHVeggiePizza;
import simpleFactory.pizza.Pizza;

public class CHPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new CHCheesePizza2();
		} else if(type.equals("veggie")){
			return new CHVeggiePizza();
		} else if(type.equals("clam")){
			return new CHClamPizza();
		} else return null;
	}

}
