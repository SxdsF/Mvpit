package com.sxdsf.mvpit.sample.onepresenter.activity;

import android.os.Bundle;

import com.sxdsf.mvpit.annotation.BindLayout;
import com.sxdsf.mvpit.annotation.BindPresenterModule;
import com.sxdsf.mvpit.sample.BaseActivity;
import com.sxdsf.mvpit.sample.R;

import butterknife.ButterKnife;

@BindLayout(R.layout.activity_one_presenter)
@BindPresenterModule(OnePresenter.class)
public class OnePresenterActivity extends BaseActivity<OnePresenter> {

    @Override
    public void initData() {

    }

    @Override
    public void initComponents(Bundle saveInstanceState) {
        super.initComponents(saveInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        this.presenterModule.close();
        super.onDestroy();
    }
}
