package com.sxdsf.mvpit.sample.multipresenter.activity;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.annotation.BindPresenterModule;
import com.sxdsf.mvpit.module.view.impl.MvpitViewModuleBaseActivity;
import com.sxdsf.mvpit.sample.R;

import butterknife.ButterKnife;

@BindLayout(R.layout.activity_multi_presenter)
@BindPresenterModule(MultiPresenter.class)
public class MultiPresenterActivity extends MvpitViewModuleBaseActivity<MultiPresenter> implements CommonViewModule {

    //第二个presenter
    private CommonPresenter commonPresenter;

    @Override
    public void initData() {
        //第二个presenter初始化
        this.commonPresenter = new CommonPresenter(this);
    }

    @Override
    public void initComponents() {
        super.initComponents();
        ButterKnife.bind(this);
    }

    @Override
    public void get() {

    }

    @Override
    protected void onDestroy() {
        this.presenterModule.close();
        this.commonPresenter.close();
        super.onDestroy();
    }
}
