package com.sxdsf.mvpit.sample.onepresenter.fragment;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class OnePresenter extends MvpitPresenterModule<OneFragment> {

    public OnePresenter(OneFragment viewModule) {
        super(viewModule);
    }

    @Override
    protected void close() {

    }
}
