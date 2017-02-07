package singleton;

public class ChocolateBoiler {

	private static ChocolateBoiler instance;
	
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance(){
		if(instance == null){
			instance = new ChocolateBoiler();
		}
		return instance;
	}
	
	public void fill(){
		if(isEmpty()){
			empty = false;
			boiled = true;
		}
	}

	private boolean isEmpty() {
		return this.empty;
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			empty = true;
		}
	}

	private boolean isBoiled() {
		return this.boiled;
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			boiled = true;
		}
	}
	
}
