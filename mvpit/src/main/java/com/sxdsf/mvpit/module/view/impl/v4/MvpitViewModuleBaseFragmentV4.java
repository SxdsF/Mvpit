package com.sxdsf.mvpit.module.view.impl.v4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.annotation.MvpitAnnotationProcessor;
import com.sxdsf.mvpit.module.presenter.PresenterModule;
import com.sxdsf.mvpit.module.view.FragmentViewModule;

import java.lang.reflect.Constructor;

public abstract class MvpitViewModuleBaseFragmentV4<T extends PresenterModule> extends
        Fragment implements FragmentViewModule {
    protected T presenterModule;

    private static final String TAG = "MvpitViewModuleFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = this.initComponents(inflater, container, savedInstanceState);
        return view;
    }

    @Override
    public View initComponents(LayoutInflater inflater,
                               ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        int layoutId = MvpitAnnotationProcessor.autoBindLayout(this);
        View view = inflater.inflate(layoutId, container, false);
        return view;
    }
}
