package com.sxdsf.mvpit.module.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sunbowen on 2015/12/20.
 */
public interface FragmentViewModule extends MvpitViewModule {

    View initComponents(LayoutInflater inflater, ViewGroup container);
}
