package abstractFactory;

import abstractFactory.dough.ChiCrustDough;
import abstractFactory.dough.Dough;
import abstractFactory.dough.ThinCrustDough;
import abstractFactory.sauce.ChiMarinaraSauce;
import abstractFactory.sauce.MarinaraSauce;
import abstractFactory.sauce.Sauce;

public class ChiPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ChiCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new ChiMarinaraSauce();
	}

}
