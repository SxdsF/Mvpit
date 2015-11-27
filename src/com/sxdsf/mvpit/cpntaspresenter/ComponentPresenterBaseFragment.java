package com.sxdsf.mvpit.cpntaspresenter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sxdsf.mvpit.FragmentInserter;
import com.sxdsf.mvpit.presenter.Presenter;

public abstract class ComponentPresenterBaseFragment<T extends NonComponentMVPView<? extends Presenter>, I extends FragmentInserter>
		extends Fragment {

	protected T viewLayer;
	protected I inserter;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Class<I> iCls = this.getInserterClass();
		if (iCls != null) {
			try {
				this.inserter = iCls.newInstance();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Class<T> vCls = this.getViewClass();
		if (vCls != null) {
			try {
				this.viewLayer = vCls.newInstance();
				if (this.viewLayer != null) {
					this.viewLayer.init(inflater, container);
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (this.inserter != null) {
			this.inserter.onCreateView();
		}
		return this.viewLayer.getView();
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if (this.inserter != null) {
			this.inserter.onStart();
		}
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if (this.inserter != null) {
			this.inserter.onDestroy();
		}
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (this.inserter != null) {
			this.inserter.onPause();
		}
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if (this.inserter != null) {
			this.inserter.onResume();
		}
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if (this.inserter != null) {
			this.inserter.onStop();
		}
	}

	protected abstract Class<T> getViewClass();

	protected abstract Class<I> getInserterClass();
}
