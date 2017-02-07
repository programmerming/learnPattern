package abstractFactory.pizza;

import abstractFactory.dough.Dough;
import abstractFactory.sauce.Sauce;

public abstract class Pizza {

	Dough dough;
	Sauce sauce;
	
	abstract void prepare();
	
	void bake(){
		
	}
	
	void cut(){
		
	}
}
