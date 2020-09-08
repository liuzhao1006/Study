/*
 * Copyright (c) 2019. syd
 */

package com.sydauto.base.mvp;

/**
 * 功能描述
 *
 * @author 2019-12-29 08:24
 * @since syd000001
 */
public abstract class BaseSydActivity<T extends BaseService> extends BaseActivity implements BaseView {

    protected T mService;

    @Override
    protected void onDestroy() {
        if (mService != null) {
            mService.detachView();
        }
        super.onDestroy();
    }
}