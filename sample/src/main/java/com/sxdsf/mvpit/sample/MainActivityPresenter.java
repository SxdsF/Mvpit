package com.sxdsf.mvpit.sample;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;

/**
 * Created by sunbowen on 2015/12/19.
 */
public class MainActivityPresenter extends MvpitPresenterModule<MainActivity> {

    //需要一个构造方法使用super
    public MainActivityPresenter(MainActivity viewModule) {
        super(viewModule);
    }

    @Override
    protected void close() {
        //做本presenter的数据清理，还有资源关闭
    }
}
