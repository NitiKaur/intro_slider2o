package com.example.intro_slider;

import android.app.Application;

public class IntroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Globals.init(getBaseContext());

    }
}
