package com.cnpeng.cnpeng_demos2017_01.a_21_ListActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.cnpeng.cnpeng_demos2017_01.R;

/**
 * Created by CnPeng on 2017/1/19.
 * <p>
 * ListActivity 的使用
 */

public class MyListActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] names = new String[]{"张三", "李四", "王五", "赵六"};

        //直接使用android原生的条目布局
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);

        //直接设置适配器就好，不需要setContentView 
        setListAdapter(adapter);
    }
}
