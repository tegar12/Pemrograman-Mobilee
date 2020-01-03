package com.example.myapplication;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext =context;
    }
    @StringRes
    private final int[] TAB_TITLE = new int[]{
            R.string.tab_text1,
            R.string.tab_text2
    };
    @Override
    public Fragment getItem(int position){
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment =new Home_fragment();
                break;
            case 1:
                fragment = new Profile_fragment();
                break;
        }
        return fragment;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle (int position){
        return
                mContext.getResources().getString(TAB_TITLE[position]);
    }
    @Override
    public int getCount(){
        return 2;
    }
}
