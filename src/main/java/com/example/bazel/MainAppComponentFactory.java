package com.example.bazel;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.content.Intent;
import android.util.Log;

public class MainAppComponentFactory extends AppComponentFactory {

    public MainAppComponentFactory() {
        Log.d("GREC_T", "factory init");
    }

    @Override
    public Application instantiateApplication(ClassLoader cl, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Log.d("GREC_T", "Application instantiated");
        return super.instantiateApplication(cl, className);
    }

    @Override
    public Activity instantiateActivity(ClassLoader cl, String className, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Log.d("GREC_T", "Activity instantiated");
        return super.instantiateActivity(cl, className, intent);
    }
}
