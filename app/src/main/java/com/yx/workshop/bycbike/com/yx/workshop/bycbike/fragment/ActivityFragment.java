package com.yx.workshop.bycbike.com.yx.workshop.bycbike.fragment;

import com.yx.workshop.bycbike.com.yx.workshop.ui.common.constant.Pages;

public abstract class ActivityFragment extends BaseFragment {

    private static final String TAG = ActivityFragment.class.getSimpleName();

    protected abstract Pages getPage();

    @Override
    public void onStart() {
        super.onStart();
    }
}
