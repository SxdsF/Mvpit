package com.sxdsf.mvpit.sample;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.annotation.BindPresenterModule;

@BindLayout(R.layout.activity_main)
@BindPresenterModule(MainActivityPresenter.class)
public class MainActivity extends BaseActivity<MainActivityPresenter> implements CommonViewModule{

    private CommonPresenter commonPresenter;

    @Override
    public void initData() {
        super.initData();
        this.commonPresenter = new CommonPresenter(this);
        this.commonPresenter.close();
        this.presenterModule.initData();
    }

    void showLoading() {

    }

    @Override
    public void get() {

    }
}
