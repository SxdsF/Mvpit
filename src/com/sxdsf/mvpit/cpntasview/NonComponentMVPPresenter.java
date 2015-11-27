package com.sxdsf.mvpit.cpntasview;

import com.sxdsf.mvpit.presenter.Presenter;
import com.sxdsf.mvpit.view.View;

/**
 * 
 * @author SUNBOWEN
 * 
 * @param <T>代表传入的View层的类型 此接口是针对组件作为presenter
 */

public abstract class NonComponentMVPPresenter<T extends View> implements
		Presenter {
	protected T viewLayer;

	public NonComponentMVPPresenter() {
	}

	public abstract void setView(T view);

}
