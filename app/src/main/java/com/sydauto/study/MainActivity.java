package com.sydauto.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sydauto.base.mvp.BaseSydActivity;
import com.sydauto.study.mvp.IMvpService;
import com.sydauto.study.mvp.MvpServiceImpl;
import com.sydauto.study.mvp.SydUpload;
import com.sydauto.study.video.utils.FFUtils;
import com.sydauto.study.video.widget.FFVideoView;

/**
 * @author liuchao
 */
public class MainActivity extends BaseSydActivity<MvpServiceImpl> implements IMvpService.View {

    private TextView mTextView;
    private FFVideoView mVideoView;


    /**
     * 设置布局文件ID
     *
     * @return 返回布局文件ID
     */
    @Override
    protected int getLayoutId () {
        return R.layout.activity_main;
    }

    /**
     * 初始化对象
     *
     * @param savedInstanceState 保存数据
     */
    @Override
    protected void initView (Bundle savedInstanceState) {
        SydVideoManager.getInstance();
        mTextView = findViewById(R.id.sample_text);
        mVideoView = findViewById(R.id.videoView);

        // 初始化服务接口
        mService = new MvpServiceImpl(MainActivity.this);
        mService.attachView(this);
        if (mService.isViewAttached()) {
            // 绑定View接口用的
            mService.notifyBindView();
        }
    }

    public void onButtonClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.button_protocoler:
                setInfoText(FFUtils.urlProtocolInfo());
                break;
            case R.id.button_codec:
                setInfoText(FFUtils.avCodecInfo());
                break;
            case R.id.button_filter:
                setInfoText(FFUtils.avFilterInfo());
                break;
            case R.id.button_format:
                setInfoText(FFUtils.avFormatInfo());
                break;
            case R.id.button_play:
                String videoPath = Environment.getExternalStorageDirectory() + "/DCIM/Camera/VID_20200903_183610.mp4";
                mVideoView.playVideo(videoPath);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + id);
        }
    }

    private void setInfoText(String content) {
        if (mTextView != null) {
            mTextView.setText(content);
        }
    }

    @Override
    public void onLoginCallback (boolean isSuccess, String message) {
    }

    @Override
    public void onLoginSaveUserInfo (boolean isSuccess, String message) {
    }

    @Override
    public void onLoginWriteStoragePermission (boolean isSuccess) {
    }

    @Override
    public void onCheckUpload (boolean isCheckUpload, SydUpload upload) {

    }

    @Override
    public void onDownLoad (boolean isFinish, String progress, int currentProgress) {
    }
}
