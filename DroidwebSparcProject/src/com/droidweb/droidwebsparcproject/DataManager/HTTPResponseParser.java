package com.droidweb.droidwebsparcproject.DataManager;

import java.util.ArrayList;

import android.util.Log;

import com.droidweb.droidwebsparcproject.Objects.Recipes;

public class HTTPResponseParser {
	
	public static void parseResponse(String response, RequestType request){
		switch (request){
		case GetRecipesForIngredient:
			// call the recipes for ingredient parser
			recpiesForIngredientParser(response);
		}
	}

	private static void recpiesForIngredientParser(String response) {
		// TODO Auto-generated method stub
		ArrayList<Recipes> recipesList = new ArrayList<Recipes>();
		Log.e("RESPONSE", response);
		

		
	}
	
	
}
