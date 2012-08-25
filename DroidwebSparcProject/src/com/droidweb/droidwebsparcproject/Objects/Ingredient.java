package com.droidweb.droidwebsparcproject.Objects;

import java.util.ArrayList;

import com.droidweb.droidwebsparcproject.DataManager.HTTPRequestManager;
import com.droidweb.droidwebsparcproject.DataManager.RequestType;


public class Ingredient {
	String ingredientName;
	
	public Ingredient(String ingrediString){
		ingredientName = ingrediString;
	}
	
	// get recipes for drink
	public ArrayList<Recipes> getMyRecipes(){
		HTTPRequestManager requestManager = new HTTPRequestManager();
		requestManager.makeRequest(RequestType.GetRecipesForIngredient, this.getIngredientName());
		return null;
		// make query for recipes from drink
		
	}

	/**
	 * @return the ingredientName
	 */
	public String getIngredientName() {
		return ingredientName;
	}

	/**
	 * @param ingredientName the ingredientName to set
	 */
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
}
