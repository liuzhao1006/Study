package com.sydauto.study;

/**
 * @author liuchao
 */
public class SydVideoManager {

    private static final String TAG = "SydVideoManager";

    private static final Object LOCK = new Object();

    private static SydVideoManager sInstance;

    public static SydVideoManager getInstance() {
        synchronized (LOCK) {
            if (sInstance == null) {
                sInstance = new SydVideoManager();
            }
            return sInstance;
        }
    }

    static {
        System.loadLibrary("native-lib");
    }


}
