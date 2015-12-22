package com.sxdsf.mvpit.sample.multipresenter.activity;

import com.sxdsf.mvpit.sample.BasePresenterModule;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class CommonPresenter<T extends CommonViewModule> extends BasePresenterModule<T> {

    public CommonPresenter(T viewModule) {
        super(viewModule);
    }
}
