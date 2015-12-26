package com.sxdsf.mvpit.module.view.impl;

import android.util.Log;
import android.widget.BaseAdapter;

import com.sxdsf.mvpit.annotation.MvpitAnnotationProcessor;
import com.sxdsf.mvpit.module.presenter.PresenterModule;
import com.sxdsf.mvpit.module.view.MvpitViewModule;

import java.lang.reflect.Constructor;

public abstract class MvpitViewModuleBaseAdapter<T extends PresenterModule> extends
        BaseAdapter implements MvpitViewModule {

    protected T presenterModule;

    private static final String TAG = "MvpitViewModuleAdapter";

    public MvpitViewModuleBaseAdapter() {
        super();
        // TODO Auto-generated constructor stub
        Class cls = MvpitAnnotationProcessor.autoBindPresenterModule(this);
        if (cls != null) {
            try {
                Constructor constructor = cls.getConstructor(this.getClass());
                this.presenterModule = (T) constructor.newInstance(this);
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                Log.e(TAG, e.getMessage());
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                Log.e(TAG, e.getMessage());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                Log.e(TAG, e.getMessage());
            }
        }
    }
}
