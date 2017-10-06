package com.example.tarena.groupon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.tarena.groupon.fragment.FragmentA;
import com.example.tarena.groupon.fragment.FragmentB;
import com.example.tarena.groupon.fragment.FragmentC;
import com.example.tarena.groupon.fragment.FragmentD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pjy on 2017/6/15.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new FragmentA());
        fragmentList.add(new FragmentB());
        fragmentList.add(new FragmentC());
        fragmentList.add(new FragmentD());
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
