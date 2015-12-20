package com.sxdsf.mvpit.module.presenter;

import com.sxdsf.mvpit.module.view.ViewModule;

public abstract class MvpitPresenterModule<T extends ViewModule> implements
        PresenterModule {

    protected T viewModule;

    public MvpitPresenterModule(T viewModule) {
        this.viewModule = viewModule;
    }

    protected abstract void close();

}
