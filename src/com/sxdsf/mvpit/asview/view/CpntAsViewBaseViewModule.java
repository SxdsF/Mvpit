package com.sxdsf.mvpit.asview.view;

import android.view.View;

import com.sxdsf.mvpit.PresenterModule;
import com.sxdsf.mvpit.ViewModule;

public interface CpntAsViewBaseViewModule<T extends PresenterModule> extends ViewModule {

	/**
	 * ���ض�Ӧ��Presenter�����class
	 * 
	 * @return
	 */
	public Class<T> getPresenterModuleClass();

	/**
	 * ��ʼ�������ڵ�����
	 */
	public void initDatas();

	/**
	 * ��ʼ�������ڵ�������Լ��������
	 */
	public View initComponents();

	/**
	 * ���ý���������ļ���
	 */
	public void setEventExecutions();

}
