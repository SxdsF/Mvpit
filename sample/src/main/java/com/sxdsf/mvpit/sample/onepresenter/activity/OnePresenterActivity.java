package com.sxdsf.mvpit.sample.onepresenter.activity;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.annotation.BindPresenterModule;
import com.sxdsf.mvpit.module.view.impl.MvpitViewModuleBaseActivity;
import com.sxdsf.mvpit.sample.R;

import butterknife.ButterKnife;

@BindLayout(R.layout.activity_one_presenter)
@BindPresenterModule(OnePresenter.class)
public class OnePresenterActivity extends MvpitViewModuleBaseActivity<OnePresenter> {

    @Override
    public void initData() {

    }

    @Override
    public void initComponents() {
        super.initComponents();
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        this.presenterModule.close();
        super.onDestroy();
    }
}
