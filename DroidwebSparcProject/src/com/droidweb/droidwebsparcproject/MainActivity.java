package com.droidweb.droidwebsparcproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
<<<<<<< HEAD

import com.droidweb.droidwebsparcproject.Objects.Ingredient;
=======
import android.view.MenuItem;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
>>>>>>> branch 'master' of https://github.com/sparc-hackathon-2-0/team05.git

import com.droidweb.droidwebsparcproject.R;
import com.droidweb.droidwebsparcproject.fragments.HomeFragment;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {
        	

        	// However, if we're being restored from a previous state,
        	// then we don't need to do anything and should return or else
        	// we could end up with overlapping fragments.
        	if (savedInstanceState != null) {
        		return;
        	}
        	
        	// Create an instance of Home Fragment.
        	HomeFragment home = new HomeFragment();

        	// Add the fragment to the 'fragment_container' FrameLayout
        	getSupportFragmentManager().beginTransaction()
        	.replace(R.id.fragment_container, home).commit();

        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
