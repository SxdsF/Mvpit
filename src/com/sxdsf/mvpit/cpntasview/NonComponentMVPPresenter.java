package com.sxdsf.mvpit.cpntasview;

import com.sxdsf.mvpit.MVPPresenter;
import com.sxdsf.mvpit.MVPView;

/**
 * 
 * @author SUNBOWEN
 * 
 * @param <T>�������View������� �˽ӿ�����������Ϊpresenter
 */

public abstract class NonComponentMVPPresenter<T extends MVPView> implements
		MVPPresenter {
	protected T viewLayer;

	public NonComponentMVPPresenter() {
	}

	public abstract void setView(T view);

}
