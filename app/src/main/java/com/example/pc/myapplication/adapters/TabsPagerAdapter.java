package com.example.pc.myapplication.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pc.myapplication.main_amota_fragments.WantedItemFragment;
import com.example.pc.myapplication.main_amota_fragments.MainAmotaFragment;
import com.example.pc.myapplication.main_amota_fragments.StoriesFragment;

/**
 * Created by Evgeni on 04.03.2018.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    private int NUM_ITEMS = 3;
    private String[] titles= new String[]{"נדרשים", "דף בית","הסיפורים שלנו"};

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return  NUM_ITEMS ;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WantedItemFragment();
            case 1:
                return new MainAmotaFragment();
            case 2:
                return new StoriesFragment();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return  titles[position];
    }
}
