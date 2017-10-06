package com.example.tarena.groupon.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.tarena.groupon.R;
import com.example.tarena.groupon.adapter.MyPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GuideActivity extends FragmentActivity {
    @BindView(R.id.vp_main)
    ViewPager viewPager;
    MyPagerAdapter adapter;
    @BindView(R.id.indicator)
    CirclePageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initViewPager();

    }

    private void initViewPager(){
        adapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);


        //density密度 手机或当前运行程序的密度
        //10dp在当前设备上所对应的像素值
        //低密度ldpi   120/linch
        //中密度mdpi   160
        //高hdpi        240
        //很高xhdpi     320
        //非常高xxhdpi   480

        //dp 绝对单位
        //160dp=1linch
        // 1dp 在低密度屏幕上0.75px
        //1dp 在中密度屏幕上1px
         // 1dp 在高密度屏幕上1.5px
         // 1dp 在很高密度屏幕上2px
        //1dp 在非常高密度屏幕上3px
        final float density = getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0xFFFFFFF);
        indicator.setRadius(10 * density);
        indicator.setPageColor(0xFFFFFFF);
        indicator.setFillColor(0xFFFF6633);
        indicator.setStrokeColor(0xFFFF6633);
        indicator.setStrokeWidth(2 * density);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==3){
                    indicator.setVisibility(View.INVISIBLE);
                }
                else {
                    indicator.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}
