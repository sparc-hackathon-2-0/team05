package com.droidweb.droidwebsparcproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.droidweb.droidwebsparcproject.R;

/**
 * Home Screen
 * @author r0adkll
 *
 */
public class HomeFragment extends Fragment{

	/**
	 * Variables
	 */
	
	
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
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);	
		
		return inflater.inflate(R.layout.fragment_home, container, false);
	}
	
}
