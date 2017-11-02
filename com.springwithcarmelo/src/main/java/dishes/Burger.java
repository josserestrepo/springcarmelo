package dishes;

import ingredients.Ingredients;

public class Burger implements Dishes {
	
	private Ingredients ingredient1;
	private Ingredients ingredient2;
	
	public Burger(Ingredients ingredient1, Ingredients ingredient2){
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
	}

	public void cookDish() {
		System.out.println("Cooking burger");
		ingredient1.addIngredient();
		ingredient2.addIngredient();
	}
}
