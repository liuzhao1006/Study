/*
 * Copyright (c) 2020. syd
 */

package com.sydauto.study.mvp;

import android.app.Activity;

/**
 * @author liuchao
 */
public class SydMvpController {
    private static final String TAG = SydMvpController.class.getSimpleName();
    private Activity mActivity;
    private IMvpService.View mView;

    public SydMvpController (Activity activity, IMvpService.View view) {
        mActivity = activity;
        mView = view;
    }
}