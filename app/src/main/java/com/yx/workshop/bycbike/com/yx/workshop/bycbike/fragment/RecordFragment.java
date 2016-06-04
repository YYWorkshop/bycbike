package com.yx.workshop.bycbike.com.yx.workshop.bycbike.fragment;

import android.support.v4.app.Fragment;

import com.yx.workshop.bycbike.com.yx.workshop.ui.common.constant.Pages;

public abstract class RecordFragment extends BaseFragment {

    private static final String TAG = RecordFragment.class.getSimpleName();

    protected abstract Pages getPage();

    @Override
    public void onStart() {
        super.onStart();
    }
}
