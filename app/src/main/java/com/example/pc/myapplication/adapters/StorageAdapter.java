package com.example.pc.myapplication.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pc.myapplication.storage_fragments.DeliveryFragment;
import com.example.pc.myapplication.storage_fragments.ReceiveFragment;
import com.example.pc.myapplication.storage_fragments.StockFragment;

/**
 * Created by Evgeni on 06.03.2018.
 */

public class StorageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public StorageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ReceiveFragment tab1 = new ReceiveFragment();
                return tab1;
            case 1:
                StockFragment tab2 = new StockFragment();
                return tab2;
            case 2:
                DeliveryFragment tab3 = new DeliveryFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
