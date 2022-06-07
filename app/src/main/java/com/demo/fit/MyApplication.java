package com.demo.fit;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;

import org.litepal.LitePal;

import androidx.appcompat.app.AppCompatDelegate;

public class MyApplication extends Application {
    private static SharedPreferences mSharedPreference;
    private static MyApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        LitePal.initialize(this);

    }

    public static MyApplication getInstance() {
        return context;
    }


    public static Context getContext() {

        return context;
    }

    public static SharedPreferences getmSharedPreference() {
        if (mSharedPreference == null) {
            mSharedPreference = PreferenceManager
                    .getDefaultSharedPreferences(context);
        }
        return mSharedPreference;
    }


}
