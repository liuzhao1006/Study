/*
 * Copyright (c) 2020. syd
 */

package com.sydauto.base.mvp;

/**
 * @author liuchao
 */
public class BaseService<V extends BaseView> {
    protected V mView;

    /**
     * 绑定view，一般在初始化中调用该方法
     *
     * @param view view
     */
    public void attachView(V view) {
        mView = view;
    }

    /**
     * 解除绑定view，一般在onDestroy中调用
     */

    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }

    /**
     * View是否绑定
     *
     * @return 是否绑定
     */
    public boolean isViewAttached() {
        return mView != null;
    }
}
