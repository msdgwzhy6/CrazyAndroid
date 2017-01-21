package com.cnpeng.cnpeng_demos2017_01.a_26_spinner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.cnpeng.cnpeng_demos2017_01.R;

/**
 * Created by CnPeng on 2017/1/21.
 * <p>
 * 使用Spinner展现下拉列表
 */

public class SpinnerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spinner= (Spinner) findViewById(R.id.spinner_adapter);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.books));
        spinner.setAdapter(adapter);
//        spinner.setPrompt("选择你喜欢的书");
    }
}
