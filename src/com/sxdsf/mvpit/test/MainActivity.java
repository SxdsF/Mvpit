package com.sxdsf.mvpit.test;

import android.os.Bundle;

import com.sxdsf.mvpit.cpntaspresenter.ComponentPresenterBaseActivity;

public class MainActivity extends
		ComponentPresenterBaseActivity<MainActivityView, MainActivityInserter>
		implements MainActivityPresenter {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if (this.viewLayer != null) {
			this.viewLayer.setPresenter(this);
		}
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected Class<MainActivityView> getViewClass() {
		// TODO Auto-generated method stub
		return MainActivityView.class;
	}

	@Override
	protected Class<MainActivityInserter> getInserterClass() {
		// TODO Auto-generated method stub
		return MainActivityInserter.class;
	}

}
