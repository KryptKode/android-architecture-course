package com.techyourchance.mvc.screens.common;

import android.content.Context;
import android.support.annotation.IdRes;
import android.view.View;

/**
 * Created by kryptkode on 5/21/2020.
 */
public abstract class BaseViewMvc implements ViewMvc {
    private View rootView;

    protected void setRootView(View rootView) {
        this.rootView = rootView;
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    protected <T extends View> T findViewById(@IdRes int viewResId) {
        return getRootView().findViewById(viewResId);
    }

    protected Context getContext() {
        return getRootView().getContext();
    }
}
