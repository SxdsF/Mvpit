package com.sxdsf.mvpit.cpntaspresenter;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.sxdsf.mvpit.ActivityInserter;
import com.sxdsf.mvpit.MVPPresenter;

public abstract class ComponentPresenterBaseFragmentActivity<T extends NonComponentMVPView<? extends MVPPresenter>, I extends ActivityInserter>
		extends FragmentActivity {

	protected T viewLayer;
	protected I inserter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Class<I> iCls = this.getInserterClass();
		if (iCls != null) {
			try {
				this.inserter = iCls.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Class<T> vCls = this.getViewClass();
		if (vCls != null) {
			try {
				this.viewLayer = vCls.newInstance();
				if (this.viewLayer != null) {
					this.viewLayer.init(this.getLayoutInflater(), null);
					this.setContentView(this.viewLayer.getView());
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (this.inserter != null) {
			this.inserter.onCreate();
		}
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if (this.inserter != null) {
			this.inserter.onStart();
		}
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (this.inserter != null) {
			this.inserter.onDestroy();
		}
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (this.inserter != null) {
			this.inserter.onPause();
		}
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (this.inserter != null) {
			this.inserter.onResume();
		}
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if (this.inserter != null) {
			this.inserter.onStop();
		}
	}

	protected abstract Class<T> getViewClass();

	protected abstract Class<I> getInserterClass();
}
