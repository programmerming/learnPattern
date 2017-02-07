package abstractFactory;

import abstractFactory.dough.Dough;
import abstractFactory.dough.ThinCrustDough;
import abstractFactory.sauce.MarinaraSauce;
import abstractFactory.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

}
