package com.droidweb.droidwebsparcproject.fragments;

import com.droidweb.droidwebsparcproject.R;
import com.droidweb.droidwebsparcproject.adapters.BrowserFragmentAdapter;
import com.droidweb.droidwebsparcproject.customviews.VerticalSeekBar;
import com.viewpagerindicator.TitlePageIndicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class BottleAddEditFragment extends Fragment{

	/**
	 * Variables
	 */
	private Spinner _drinkSpinner;
	private TextView _title;
	private ImageView _bottle;
	private VerticalSeekBar _bottleSeekBar;
	private TextView _totalVol, _approxVol;
	
	/**
	 * Constructor
	 */
	public BottleAddEditFragment(){
		
		
		
	}
	
	
	/****************************************************
	 * Super Methods
	 */
	
	@Override 
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
		menu.clear();
		inflater.inflate(R.menu.addedit_menu, menu);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		// load Views from layout
		_drinkSpinner = (Spinner)getActivity().findViewById(R.id.sp_addedit_categories);
		_title = (TextView)getActivity().findViewById(R.id.et_addedit_title);
		_bottle = (ImageView)getActivity().findViewById(R.id.iv_addedit_bottle);
		_bottleSeekBar = (VerticalSeekBar)getActivity().findViewById(R.id.vs_addedit_drinkslider);
		_totalVol = (TextView)getActivity().findViewById(R.id.tv_addedit_totalvolume);
		_approxVol = (TextView)getActivity().findViewById(R.id.tv_addedit_estimatedvolume);
		
		
		_bottleSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				String totalVolume = _totalVol.getText().toString().replace(" mL", "");
				int total = Integer.parseInt(totalVolume);
				
				int sTot = seekBar.getMax();
				float ratio = (float)progress/sTot;
				float approx = ratio * total;
				
				Log.d("ADD_EDIT", "Progress[" + progress + "]-[" + approx + "]-[" + sTot + "]");
				
				_approxVol.setText(((int)approx + " mL"));
				
			}
		});
		
		// Load out the spinner
		ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(getActivity(), android.R.layout.simple_spinner_item, BrowserFragmentAdapter.PAGER_TABS);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		_drinkSpinner.setAdapter(adapter);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);	
		
		return inflater.inflate(R.layout.fragment_addedit_bottle, container, false);
	}
	
}
