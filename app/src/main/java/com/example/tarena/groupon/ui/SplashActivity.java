package com.example.tarena.groupon.ui;


import android.app.Activity;
import android.content.Intent;

import android.os.Handler;

import android.os.Bundle;
import com.example.tarena.groupon.R;
import com.example.tarena.groupon.util.SPUtils;

public class SplashActivity extends Activity {
     SPUtils spUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spUtils=new SPUtils(this);
        //界面停留几秒
         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //读取偏好设置文件中的值
                //根据是否是第一次使用
                Intent intent;
                if (true) {
                    //向新手指导页跳转
                    intent = new Intent(SplashActivity.this,GuideActivity.class);
                    spUtils.setFirst(false);

                } else {
                    //向主页面跳转
                    intent=new Intent(SplashActivity.this,MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }, 1500);

    }
}
