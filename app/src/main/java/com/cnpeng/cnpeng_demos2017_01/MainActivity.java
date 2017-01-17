package com.cnpeng.cnpeng_demos2017_01;

import android.content.Intent;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cnpeng.cnpeng_demos2017_01.a_01_WebView01.WebViewTestActivity01;
import com.cnpeng.cnpeng_demos2017_01.a_02_ViewStubTest.ViewStubTestActivitiy;
import com.cnpeng.cnpeng_demos2017_01.a_03_CreateViewWithoutXML.CreateViewWithoutXMLActivity;
import com.cnpeng.cnpeng_demos2017_01.a_04_ImageBrowser_V1.ImageBrowserActivityV1;
import com.cnpeng.cnpeng_demos2017_01.a_05_scrollBallWithFinger.ScrollBallActivity;
import com.cnpeng.cnpeng_demos2017_01.a_06_tablelayoutTest.TableLayoutTestActivity;
import com.cnpeng.cnpeng_demos2017_01.a_07_frameLayout_NoenLamp.NeonLampActivity;
import com.cnpeng.cnpeng_demos2017_01.a_08_relativeLayout_plumBlossom.PlumBlossomActivity;
import com.cnpeng.cnpeng_demos2017_01.a_09_gridLayout_caculater.CaculaterActivity;
import com.cnpeng.cnpeng_demos2017_01.a_10_textView_01.TextView01Activtiy;
import com.cnpeng.cnpeng_demos2017_01.a_11_9PatchTest.NinePatchActivity;
import com.cnpeng.cnpeng_demos2017_01.a_12_RadioButtonAndCheckBox.RadioButtonAndCheckBoxActivity;
import com.cnpeng.cnpeng_demos2017_01.a_13_ToogleButtonAndSwitch.TBAndSwitchActivity;
import com.cnpeng.cnpeng_demos2017_01.a_14_TextClockAndAnalogClock.TcAndAcActivity;
import com.cnpeng.cnpeng_demos2017_01.a_15_chronometer.ChronometerActivity;
import com.cnpeng.cnpeng_demos2017_01.databinding.ActivityMainBinding;
import com.cnpeng.cnpeng_demos2017_01.utils.CommonUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btWebviewTest01.setOnClickListener(this);
        binding.btViewStub02.setOnClickListener(this);
        binding.btWithoutXML.setOnClickListener(this);
        binding.btImageBrowserV1.setOnClickListener(this);
        binding.btScrollBall.setOnClickListener(this);
        binding.btTableLayout.setOnClickListener(this);
        binding.btNeonLamp.setOnClickListener(this);
        binding.btPlumBlossom.setOnClickListener(this);
        binding.btCaculater.setOnClickListener(this);
        binding.btTextView01.setOnClickListener(this);
        binding.bt9Patch.setOnClickListener(this);
        binding.btRBAndCB.setOnClickListener(this);
        binding.btTbAndSwitch.setOnClickListener(this);
        binding.btTcAndAc.setOnClickListener(this);
        binding.btChronometer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_webview_Test01:
                CommonUtils.mStartActivity(this, WebViewTestActivity01.class);
                break;
            case R.id.bt_viewStub_02:
                CommonUtils.mStartActivity(this, ViewStubTestActivitiy.class);
                break;
            case R.id.bt_withoutXML:
                CommonUtils.mStartActivity(this, CreateViewWithoutXMLActivity.class);
                break;
            case R.id.bt_ImageBrowserV1:
                CommonUtils.mStartActivity(this, ImageBrowserActivityV1.class);
                break;
            case R.id.bt_ScrollBall:
                CommonUtils.mStartActivity(this, ScrollBallActivity.class);
                break;
            case R.id.bt_TableLayout:
                CommonUtils.mStartActivity(this, TableLayoutTestActivity.class);
                break;
            case R.id.bt_neonLamp:
                CommonUtils.mStartActivity(this, NeonLampActivity.class);
                break;
            case R.id.bt_plumBlossom:
                CommonUtils.mStartActivity(this, PlumBlossomActivity.class);
                break;
            case R.id.bt_caculater:
                CommonUtils.mStartActivity(this, CaculaterActivity.class);
                break;
            case R.id.bt_textView01:
                CommonUtils.mStartActivity(this, TextView01Activtiy.class);
                break;
            case R.id.bt_9Patch:
                CommonUtils.mStartActivity(this, NinePatchActivity.class);
                break;
            case R.id.bt_RBAndCB:
                CommonUtils.mStartActivity(this, RadioButtonAndCheckBoxActivity.class);
                break;
            case R.id.bt_TbAndSwitch:
                CommonUtils.mStartActivity(this, TBAndSwitchActivity.class);
                break;
            case R.id.bt_TcAndAc:
                CommonUtils.mStartActivity(this, TcAndAcActivity.class);
                break;
            case R.id.bt_chronometer:
                CommonUtils.mStartActivity(this, ChronometerActivity.class);
                break;
        }
    }
}
