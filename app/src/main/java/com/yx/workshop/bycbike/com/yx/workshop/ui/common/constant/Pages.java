package com.yx.workshop.bycbike.com.yx.workshop.ui.common.constant;

import android.support.annotation.StringRes;

import com.yx.workshop.bycbike.R;

public enum Pages {

    /**
     * A List of Records
     */
    RECORD_VIEW(R.string.record_view),

    /**
     * Display current activity
     */
    ACTIVITY_VIEW(R.string.activity_view);

    public
    @StringRes
    int titleRes;

    Pages(@StringRes int titleRes) {
        this.titleRes = titleRes;
    }
}
