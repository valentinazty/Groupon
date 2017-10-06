package com.example.tarena.groupon.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.tarena.groupon.Constant.Constant;

/**
 * 1.Context 的getSharedPreferences(文件名，模式)
 * 2.Activity的preference（模式）获取以preference_activity名的偏好设置文件
 * 3.preferenceManager的getDefaultShredPreferecnce(Context)
 * 获取preference_包名 偏好设置文件
 * 模式Context_MODE_Private
 *
 * Created by valentina on 2017/10/3.
 */

public class SPUtils {
    SharedPreferences sp;
    //通过构造器重载，以不同的方式来获得偏好设置
    public SPUtils(Context context, String name){
    sp=context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }

    public SPUtils(Context context){
    sp= PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean isFirst(){
        return sp.getBoolean(Constant.FIRST,true);
    }

    public void setFirst(boolean flag){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(Constant.FIRST,flag);
        editor.commit();
    }


}
