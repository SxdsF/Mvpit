package com.sxdsf.mvpit.cpntasview;

import com.sxdsf.mvpit.MVPPresenter;
import com.sxdsf.mvpit.MVPView;

/**
 * 
 * @author SUNBOWEN
 * 
 * @param <T>代表传入的View层的类型 此接口是针对组件作为presenter
 */

public abstract class NonComponentMVPPresenter<T extends MVPView> implements
		MVPPresenter {
	protected T viewLayer;

	public NonComponentMVPPresenter() {
	}

	public abstract void setView(T view);

}
