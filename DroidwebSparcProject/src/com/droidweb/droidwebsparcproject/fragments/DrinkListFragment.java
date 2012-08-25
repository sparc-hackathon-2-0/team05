package com.droidweb.droidwebsparcproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.droidweb.droidwebsparcproject.R;

public class DrinkListFragment extends Fragment{

	/**
	 * Static Initializer
	 * @param drinktype		the drink category
	 * @return				the drink list fragment prep'd for the drink type
	 */
	public static DrinkListFragment newInstance(String drinktype){
		return new DrinkListFragment(drinktype);
	}
	
	
	/**
	 * Variables
	 */
	private String _drinkType;
	private ListView _drinkList;
	
	/**
	 * Constructor
	 */
	public DrinkListFragment(String drinkType){
		_drinkType = drinkType;
		
		// pull Drink types for the passed parameter and fill the view
		
	}
	
	
	/****************************************************
	 * Super Methods
	 */
	
	@Override 
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		// Load all the view into local variables
		_drinkList = (ListView)getActivity().findViewById(R.id.lv_drinklist);
		
		// Load Data for Adapter from Database
		
		// Put data into list adapter
		
		// Set listadapter
		
		// magic FUCKING dragon
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);	
		
		return inflater.inflate(R.layout.fragment_home, container, false);
	}
	
}
