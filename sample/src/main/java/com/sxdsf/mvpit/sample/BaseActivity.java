package com.sxdsf.mvpit.sample;

import android.os.Bundle;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;
import com.sxdsf.mvpit.module.view.impl.MvpitViewModuleBaseActivity;

@BindLayout(R.layout.activity_base)
public abstract class BaseActivity<T extends MvpitPresenterModule> extends MvpitViewModuleBaseActivity<T> {

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void onPause() {
        super.onPause();
        if (this.presenterModule != null) {
            this.presenterModule.close();
        }
    }
}
