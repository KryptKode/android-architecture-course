package com.techyourchance.mvc;

import android.app.Application;

import com.techyourchance.mvc.common.di.CompositionRoot;

/**
 * Created by kryptkode on 5/21/2020.
 */
public class App extends Application {
    private CompositionRoot compositionRoot;

    @Override
    public void onCreate() {
        super.onCreate();
        compositionRoot = new CompositionRoot();
    }

    public CompositionRoot getCompositionRoot() {
        return compositionRoot;
    }
}
