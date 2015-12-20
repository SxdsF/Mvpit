package com.sxdsf.mvpit.sample.onepresenter.activity;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class OnePresenter extends MvpitPresenterModule<OnePresenterActivity> {

    public OnePresenter(OnePresenterActivity viewModule) {
        super(viewModule);
    }

    @Override
    protected void close() {

    }
}
