/*
 * Copyright (c) 2020. syd
 */

package com.sydauto.study.mvp;


import android.app.Activity;
import android.content.Intent;

import com.sydauto.base.mvp.BaseService;


/**
 * @author liuchao
 */
public class MvpServiceImpl extends BaseService<IMvpService.View> implements IMvpService.Login {
    private static final String TAG = MvpServiceImpl.class.getSimpleName();

    private SydMvpController controller;

    private Activity mActivity;

    public MvpServiceImpl (Activity activity) {
        mActivity = activity;
    }

    /**
     * 通知绑定View接口，必须放到attachView()方法后面执行，否则绑定不上
     */
    public void notifyBindView() {
        controller = new SydMvpController(mActivity, mView);
    }

    @Override
    public void onLogin(String userName, String passWard) {
    }


}