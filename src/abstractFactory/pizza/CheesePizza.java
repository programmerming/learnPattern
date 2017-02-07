package abstractFactory.pizza;

import abstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	//工厂决定原料
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.ingredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	void prepare() {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}

}
