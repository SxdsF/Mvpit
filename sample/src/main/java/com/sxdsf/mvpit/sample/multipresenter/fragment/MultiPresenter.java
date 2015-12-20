package com.sxdsf.mvpit.sample.multipresenter.fragment;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class MultiPresenter extends MvpitPresenterModule<MultiFragment> {

    public MultiPresenter(MultiFragment viewModule) {
        super(viewModule);
    }

    @Override
    protected void close() {

    }
}
