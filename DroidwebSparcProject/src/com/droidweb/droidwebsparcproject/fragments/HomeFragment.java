package com.droidweb.droidwebsparcproject.fragments;

import com.droidweb.droidwebsparcproject.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Home Screen
 * @author r0adkll
 *
 */
public class HomeFragment extends Fragment{

	/**
	 * Variables
	 */
	private LayoutInflater inflater;
	private LinearLayout scrollContainer;
	
	/**
	 * Constructor
	 */
	public HomeFragment(){
		
	}
	
	
	/****************************************************
	 * Super Methods
	 */
	
	@Override 
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		// Load Views From layout
		scrollContainer = (LinearLayout)getActivity().findViewById(R.id.ll_yourdrinks_content);
		
		// Load Your Current Drinks
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Vodka", R.drawable.vodka);
		createYourDrink("Scotch", R.drawable.scotch);
		createYourDrink("Wine", R.drawable.wine);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		createYourDrink("Whiskey", R.drawable.whiskey);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);	
		
		return inflater.inflate(R.layout.fragment_home, container, false);
	}
	
	/**
	 * Create and add a drank
	 * @param title
	 * @param drawRes
	 */
	public void createYourDrink(String title, int drawRes){
		View drank = inflater.inflate(R.layout.liquor_bottle_view, scrollContainer, false);
		((ImageView)drank.findViewById(R.id.iv_bottle_image)).setImageResource(drawRes);
		((TextView)drank.findViewById(R.id.tv_bottle_title)).setText(title);
		drank.setPadding(10, 3, 10, 3);
		
		scrollContainer.addView(drank);
	}
	
}
