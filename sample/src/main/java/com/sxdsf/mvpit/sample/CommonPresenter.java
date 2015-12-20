package com.sxdsf.mvpit.sample;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class CommonPresenter<T extends CommonViewModule> extends MvpitPresenterModule<T> {

    public CommonPresenter(T viewModule) {
        super(viewModule);
    }

    @Override
    protected void close() {
        this.viewModule.get();
    }
}
