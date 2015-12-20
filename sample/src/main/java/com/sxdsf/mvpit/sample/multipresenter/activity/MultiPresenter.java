package com.sxdsf.mvpit.sample.multipresenter.activity;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class MultiPresenter extends MvpitPresenterModule<MultiPresenterActivity> {

    public MultiPresenter(MultiPresenterActivity viewModule) {
        super(viewModule);
    }

    @Override
    protected void close() {

    }
}
