package cookers;

import dishes.Burger;
import dishes.Dishes;
import ingredients.Ingredients;

public class Cooker implements Cookers{
	
	private Dishes dish;
	private Ingredients ingredient1;
	private Ingredients ingredient2;

	public Cooker(Dishes dish){
		this.dish = dish;
	}
	
	public void receiveOrder() {
		System.out.println("Received order");
		dish.cookDish();
		System.out.println("Dish finished");
	}

	public void deliverOrder() {
		System.out.println("Deliver order");
		
	}

}
