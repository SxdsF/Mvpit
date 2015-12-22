package com.sxdsf.mvpit.sample;

import com.sxdsf.mvpit.module.presenter.MvpitPresenterModule;
import com.sxdsf.mvpit.module.view.ViewModule;

import java.util.ArrayList;
import java.util.List;

import rx.Subscription;

/**
 * Created by sunbowen on 2015/12/22.
 */
public abstract class BasePresenterModule<T extends ViewModule> extends MvpitPresenterModule<T> {

    private final List<Subscription> subscriptionList = new ArrayList<>();

    public BasePresenterModule(T viewModule) {
        super(viewModule);
    }

    @Override
    public void close() {
        if (!this.subscriptionList.isEmpty()) {
            for (Subscription subscription : this.subscriptionList) {
                if (subscription != null && !subscription.isUnsubscribed()) {
                    subscription.unsubscribe();
                }
            }
            this.subscriptionList.clear();
        }
    }
}
