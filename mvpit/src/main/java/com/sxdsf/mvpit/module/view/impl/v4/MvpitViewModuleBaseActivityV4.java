package com.sxdsf.mvpit.module.view.impl.v4;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.sxdsf.mvpit.annotation.MvpitAnnotationProcessor;
import com.sxdsf.mvpit.module.presenter.PresenterModule;
import com.sxdsf.mvpit.module.view.ActivityViewModule;

import java.lang.reflect.Constructor;

public abstract class MvpitViewModuleBaseActivityV4<T extends PresenterModule> extends
        FragmentActivity implements ActivityViewModule {

    protected T presenterModule;

    private static final String TAG = "MvpitViewModuleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
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
        this.initData(savedInstanceState);
        this.initComponents(savedInstanceState);
    }

    @Override
    public void initComponents(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        MvpitAnnotationProcessor.autoBindLayout(this);
    }
}
