package com.sxdsf.mvpit.cpntasview;

import com.sxdsf.mvpit.presenter.Presenter;
import com.sxdsf.mvpit.view.View;

/**
 * 
 * @author SUNBOWEN
 * 
 * @param <T>�������View������� �˽ӿ�����������Ϊpresenter
 */

public abstract class NonComponentMVPPresenter<T extends View> implements
		Presenter {
	protected T viewLayer;

	public NonComponentMVPPresenter() {
	}

	public abstract void setView(T view);

}
