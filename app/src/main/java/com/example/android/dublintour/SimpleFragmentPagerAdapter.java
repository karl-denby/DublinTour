package com.example.android.dublintour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[] {
            App.getContext().getString(R.string.category_family),
            App.getContext().getString(R.string.category_food),
            App.getContext().getString(R.string.category_history),
            App.getContext().getString(R.string.category_landmark)
    };

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FamilyFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new HistoryFragment();
        } else {
            return new LandmarkFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}