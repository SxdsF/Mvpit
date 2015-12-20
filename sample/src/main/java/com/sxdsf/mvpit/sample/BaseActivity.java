package com.sxdsf.mvpit.sample;

import com.sxdsf.mvpit.module.presenter.PresenterModule;
import com.sxdsf.mvpit.module.view.impl.MvpitViewModuleBaseActivity;

/**
 * Created by sunbowen on 2015/12/20.
 */
public class BaseActivity<T extends PresenterModule> extends MvpitViewModuleBaseActivity<T> {

    @Override
    public void initData() {

    }
}
