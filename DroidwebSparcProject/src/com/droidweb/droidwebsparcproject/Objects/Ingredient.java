package com.droidweb.droidwebsparcproject.Objects;

import com.droidweb.droidwebsparcproject.R;


public class Ingredient {
	String ingredientName;
	int drawable;
	
	private static final int[] BOTTLEDRAWABLES = {R.drawable.whiskey, R.drawable.scotch, R.drawable.vodka, R.drawable.wine};
	public Ingredient(String ingrediString){
		ingredientName = ingrediString;
		if(ingrediString.equals("whiskey")){
			drawable = BOTTLEDRAWABLES[0];
		}
		if(ingrediString.equals("scotch")){
			drawable = BOTTLEDRAWABLES[1];
		}
		if(ingrediString.equals("vodka")){
			drawable = BOTTLEDRAWABLES[2];
		}
		if(ingrediString.equals("wine")){
			drawable = BOTTLEDRAWABLES[3];
		}
		
		
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	
	public int getDrawable(){
		return drawable;
	}
	
	// get recipes for drink
//	public ArrayList<Recipes> getMyRecipes(){
//		// make query for recipes from drink
//		
//	}
}
