package com.droidweb.droidwebsparcproject.adapters;

import java.util.List;

import com.droidweb.droidwebsparcproject.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkListAdapter extends ArrayAdapter{

	/**
	 * Variables
	 */
	private LayoutInflater inflater;
	
	/**
	 * Constructor
	 * @param context					the application context
	 * @param textViewResourceId		ignore this, not used.
	 * @param objects					the list of objects to pull data from
	 */
	public DrinkListAdapter(Context context, int textViewResourceId,
			List objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
	
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}
	
	
	/**
	 * Get the individual data view
	 */
	@Override
	public View getView(int position, View convertView ,ViewGroup parent){
		
		// if the view passed is null, inflate it
		if(convertView == null){			
			convertView = inflater.inflate(R.layout.drink_list_item, parent, false);			
		}
		
		// Load the Data object
		// TODO: update to the proper class, waiting on Maliek
		Object data = getItem(position);
		
		// otherwise bind the data
		ImageView icon = (ImageView)convertView.findViewById(R.id.iv_drink_icon);
		TextView title = (TextView)convertView.findViewById(R.id.tv_drink_title);
		TextView calories = (TextView)convertView.findViewById(R.id.tv_drink_calories);
		
		// Bind Data
		
		
		return convertView;
	}

}
