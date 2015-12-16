package com.sxdsf.mvpit.asview.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.PresenterModule;
import com.sxdsf.mvpit.ViewModule;

public interface CpntAsViewBaseViewModule<T extends PresenterModule> extends
		ViewModule {

	/**
	 * 返回对应的Presenter组件的class
	 * 
	 * @return
	 */
	public Class<T> getPresenterModuleClass();

	/**
	 * 初始化界面内的数据
	 */
	public void initDatas();

	/**
	 * 初始化界面内的组件，以及相关设置
	 */
	public void initComponentsInActivity();

	public View initComponentsInFragment(LayoutInflater inflater,
			ViewGroup container);
}
