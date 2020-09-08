/*
 * Copyright (c) 2020. syd
 */

package com.sydauto.study.mvp;


import com.sydauto.base.mvp.BaseView;

/**
 * @author liuchao
 */
public interface IMvpService {

    interface View extends BaseView {

        void onLoginCallback (boolean isSuccess, String message);

        void onLoginSaveUserInfo (boolean isSuccess, String message);

        void onLoginWriteStoragePermission (boolean isSuccess);

        void onCheckUpload (boolean isCheckUpload, SydUpload upload);

        void onDownLoad (boolean isFinish, String progress, int currentProgress);

    }

    interface Login {
        void onLogin (String userName, String passWard);
    }
}
