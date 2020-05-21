package com.techyourchance.mvc.common.di;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;

import com.techyourchance.mvc.networking.StackoverflowApi;
import com.techyourchance.mvc.screens.common.ViewMvcFactory;

/**
 * Created by kryptkode on 5/21/2020.
 */
public class ControllerCompositionRoot {
    private final CompositionRoot compositionRoot;
    private final FragmentActivity activity;

    public ControllerCompositionRoot(CompositionRoot compositionRoot, FragmentActivity activity) {
        this.compositionRoot = compositionRoot;
        this.activity = activity;
    }


    public StackoverflowApi getStackOverflowApi() {
        return compositionRoot.getStackOverflowApi();
    }


    public ViewMvcFactory getViewFactory() {
        return new ViewMvcFactory(getLayoutInflater());
    }

    private LayoutInflater getLayoutInflater() {
        return activity.getLayoutInflater();
    }
}
