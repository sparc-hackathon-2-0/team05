package com.droidweb.droidwebsparcproject.adapters;

import com.droidweb.droidwebsparcproject.fragments.DrinkListFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * This is the adapter for the View Pager in the 
 * browser fragment
 * 
 * 
 * @author r0adkll
 * ---- Disregard Women, Aquire Currency
 */
public class BrowserFragmentAdapter extends FragmentPagerAdapter {
	public static final String[] PAGER_TABS = new String[] { "Vodka", "Bourbon", "Whiskey", "Tequila", "Gin" };
	
	
	/**
	 * Constructor
	 * @param fm
	 */
	public BrowserFragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return DrinkListFragment.newInstance(PAGER_TABS[position]);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGER_TABS.length;
	}

}
