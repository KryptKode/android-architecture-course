package com.techyourchance.mvc.screens.common;

import android.support.v7.app.AppCompatActivity;

import com.techyourchance.mvc.App;
import com.techyourchance.mvc.common.di.ControllerCompositionRoot;

public abstract class BaseActivity extends AppCompatActivity {

    private ControllerCompositionRoot controllerCompositionRoot;

    protected ControllerCompositionRoot getCompositionRoot() {
        if (controllerCompositionRoot == null) {
            controllerCompositionRoot = new ControllerCompositionRoot(
                    ((App) getApplication()).getCompositionRoot(),
                    this
            );
        }
        return controllerCompositionRoot;
    }
}
