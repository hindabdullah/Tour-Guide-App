package com.example.android.theguidesaudi;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hind on 11/01/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new  HotelsFragment();
        }
        else if (position == 1) {
            return new BeachesFragment();
        }
        else if (position == 2) {
            return new RestaurantsFragment();
        }
        else {
            return new PlacesFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fragment_Hotel);
        }
        else if (position == 1) {
            return mContext.getString(R.string.fragment_Beach);
        }
        else if (position == 2) {
            return mContext.getString(R.string.fragment_Restaurants);
        }
        else {
            return mContext.getString(R.string.fragment_Place);
        }
    }
}