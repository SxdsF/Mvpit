package com.sxdsf.mvpit.sample;


import android.os.Bundle;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;
import com.sxdsf.mvpit.module.view.impl.MvpitViewModuleBaseFragment;

public abstract class BaseFragment<T extends MvpitPresenterModule> extends MvpitViewModuleBaseFragment<T> {


    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void onPause() {
        super.onPause();
        if (this.presenterModule != null) {
            this.presenterModule.close();
        }
    }
}
