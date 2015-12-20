package com.sxdsf.mvpit.sample;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/19.
 */
public class MainActivityPresenter extends MvpitPresenterModule<MainActivity> {

    public MainActivityPresenter(MainActivity viewModule) {
        super(viewModule);
    }

    void initData() {
        this.viewModule.showLoading();
    }

    @Override
    protected void close() {

    }
}
