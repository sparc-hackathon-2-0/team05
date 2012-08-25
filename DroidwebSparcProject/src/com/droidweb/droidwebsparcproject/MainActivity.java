package com.droidweb.droidwebsparcproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.droidweb.droidwebsparcproject.Objects.Ingredient;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // test my stuff
        Ingredient _ingredient = new Ingredient("Jamesons");
        _ingredient.getMyRecipes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
