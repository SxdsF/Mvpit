package com.sxdsf.mvpit.asview.presenter;

import com.sxdsf.mvpit.MvpMode;
import com.sxdsf.mvpit.PresenterModule;
import com.sxdsf.mvpit.ViewModule;

public abstract class CpntAsViewBasePresenterModule<T extends ViewModule> implements
		PresenterModule {

	protected T viewModule;

	public void setViewNodule(T viewModule) {
		this.viewModule = viewModule;
	}

	@Override
	public MvpMode getMvpMode() {
		// TODO Auto-generated method stub
		return MvpMode.AndroidComponentAsView;
	}

	/**
	 * 关闭所有请求以及释放资源
	 */
	protected abstract void close();

}
