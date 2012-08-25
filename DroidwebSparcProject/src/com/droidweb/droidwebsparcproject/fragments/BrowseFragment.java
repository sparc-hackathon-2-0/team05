package com.droidweb.droidwebsparcproject.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.droidweb.droidwebsparcproject.R;
import com.viewpagerindicator.TitlePageIndicator;

public class BrowseFragment extends Fragment{
	
	/**
	 * Variables
	 */
	ViewSwitcher _switcher;
	TitlePageIndicator _indicator;
	ViewPager _pager;
	
	/**
	 * Constructor
	 */
	public BrowseFragment(){
		
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
		
		// load Views from layout
		_switcher = (ViewSwitcher)getActivity().findViewById(R.id.vs_browser_switcher);
		_indicator = (TitlePageIndicator)getActivity().findViewById(R.id.browse_indicator);
		_pager = (ViewPager)getActivity().findViewById(R.id.browse_pager);
		
		// Set initial page <possibly changing depending on passed parameters>
		_switcher.setDisplayedChild(0);
		
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);	
		
		return inflater.inflate(R.layout.fragment_browsedrinks, container, false);
	}
}
