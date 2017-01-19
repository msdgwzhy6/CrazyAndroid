package com.cnpeng.cnpeng_demos2017_01.a_18_QuickContactBadge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.QuickContactBadge;

import com.cnpeng.cnpeng_demos2017_01.R;

/**
 * Created by CnPeng on 2017/1/18.
 * <p>
 * 使用QuickContactBadge关联联系人
 */

public class QuickContactBadgeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quickcontactbadge);

        QuickContactBadge quickContactBadge= (QuickContactBadge) findViewById(R.id.quickContactbadge);
        //关联联系人
        quickContactBadge.assignContactFromPhone("11920169901",false);

    }
}
