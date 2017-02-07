package abstractFactory;

import abstractFactory.dough.Dough;
import abstractFactory.sauce.Sauce;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
}
