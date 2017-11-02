package dishes;

import ingredients.Ingredients;

public class Pizza implements Dishes {
	
	private Ingredients ingredient1;
	private Ingredients ingredient2;
	
	public Pizza(Ingredients ingredient1, Ingredients ingredient2){
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
	}

	public void cookDish() {
		System.out.println("Cooking pizza");
		ingredient1.addIngredient();
		ingredient2.addIngredient();
		
	}
}
