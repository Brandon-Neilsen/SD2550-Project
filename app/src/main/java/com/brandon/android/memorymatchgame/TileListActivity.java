package com.brandon.android.memorymatchgame;

import android.support.v4.app.Fragment;

public class TileListActivity extends SingleFragmentActivity {

    public Fragment createFragment(){
        return new TileListFragment();
    }//end createFragment()
}
