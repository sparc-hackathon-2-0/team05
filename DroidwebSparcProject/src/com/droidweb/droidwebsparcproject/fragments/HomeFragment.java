package com.droidweb.droidwebsparcproject.fragments;


import java.util.ArrayList;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.droidweb.droidwebsparcproject.R;
import com.droidweb.droidwebsparcproject.Objects.Ingredient;

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
	ArrayList<Ingredient> liqourList;
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
		
		liqourList = new ArrayList<Ingredient>();
		// get the users cabinet
		SharedPreferences preferences = this.getActivity().getSharedPreferences("myLiqourCabinet", 0);
		String cabinet = preferences.getString("Cabinet", "");
		
		//check to see if there are liqours in the cabinet
		if(cabinet.length() == 0){
			// we need some liqour in the cabinet!
			
		}else{
			// we're an alcoholic
			// parse string
			String[] list = cabinet.split(",");
			for(int i = 0; i < list.length; i++){
				liqourList.add(new Ingredient(list[i]));
			}
		}
		inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		// Load Views From layout
		scrollContainer = (LinearLayout)getActivity().findViewById(R.id.ll_yourdrinks_content);
		
		// Load Your Current Drinks
		for(int i = 0; i < liqourList.size(); i++){
			Ingredient myIngredient = liqourList.get(i);
			createYourDrink(myIngredient.getIngredientName(), myIngredient.getDrawable());
		}
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
