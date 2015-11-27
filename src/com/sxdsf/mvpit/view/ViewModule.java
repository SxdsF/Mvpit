package com.sxdsf.mvpit.view;

import com.sxdsf.mvpit.MvpMode;

public interface ViewModule {
	public MvpMode getMvpMode();

	public void initComponents();

	public void setEventExecutions();
}
