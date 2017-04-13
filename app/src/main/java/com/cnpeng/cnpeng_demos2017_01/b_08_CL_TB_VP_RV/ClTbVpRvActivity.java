package com.cnpeng.cnpeng_demos2017_01.b_08_CL_TB_VP_RV;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cnpeng.cnpeng_demos2017_01.R;
import com.cnpeng.cnpeng_demos2017_01.utils.LogUtils;

/**
 * 作者：CnPeng
 * <p>
 * 时间：2017/4/12:下午4:41
 * <p>
 * 说明：CoordinatorLayout + ViewPager + TabLayout + RecyclerView + AppBarLayout + CollapsingToolbarLayout
 * 整合以上控件实现，上滑时隐藏最顶部的内容，下拉LV到顶时展示隐藏的内容，并且能实现左右侧滑，还能让 RV 流畅运行
 * <p>
 * TODO 下一步要实现的是：LV的上拉和下拉
 */

public class ClTbVpRvActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cltbvprv);

        init();
    }

    private void init() {
        //获取控件
        final TextView tv_searchBar = (TextView) findViewById(R.id.tv_search_clTbVpRv);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_clTbVpRv);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tb_clTbVpRv);

        //设置 顶部搜索框TV 的点击事件
        tv_searchBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClTbVpRvActivity.this, "顶部搜索栏被点击了", Toast.LENGTH_SHORT).show();
            }
        });

        //关联TB和VP
        tabLayout.setupWithViewPager(viewPager, true);

        //初始化 TB 的标题
        String[] tbTitles = {"最新", "精选", "关注"};

        //给VP添加适配器
        FragmentManager fm = getSupportFragmentManager();
        ClTbVpRvViewPagerAdapter adapter = new ClTbVpRvViewPagerAdapter(fm, tbTitles);
        viewPager.setAdapter(adapter);

        final AppBarLayout appBar_clTbVpRv = (AppBarLayout) findViewById(R.id.appBar_clTbVpRv);

        //当界AppBar 滚动的时候，动态监听其垂直滚动的距离。上移是负值，下移是正值。
        // 当appBar的高度+垂直偏移量=0 ，表示appBar已经移除界面了；当 垂直偏移量=0 ，表示appBar正在被展示
        //由于ViewPager 的预加载机制，初次进入页面时，会走两次这个监听
        appBar_clTbVpRv.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                LogUtils.e("顶部标题的高度：", appBar_clTbVpRv.getHeight() + "____" + "垂直偏移量：" + verticalOffset);

                TextView tv_titleBar = (TextView) findViewById(R.id.tv_titleBar_ClTbVpRv);

                int appBarHeight = appBar_clTbVpRv.getHeight();
                if (appBarHeight + verticalOffset == 0) {    //说明appBar 已经滚出去看不见了
                    LogUtils.e("appBar滚出去了：", "展示标题栏的搜索按钮");
                    Toast.makeText(ClTbVpRvActivity.this, "appBar滚出去了，展示标题栏的搜索按钮", Toast.LENGTH_SHORT).show();
                    tv_titleBar.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable
                            (android.R.drawable.ic_search_category_default), null);
                }

                if (verticalOffset == 0) {  //此时应该先判断标题栏的搜索按钮的显示属性，如果当前可见，则隐藏。如果当前可见，不做操作
                    LogUtils.e("appBar滚回来了：", "隐藏标题栏的搜索按钮");
                    Toast.makeText(ClTbVpRvActivity.this, "appBar滚回来了，隐藏标题栏的搜索按钮", Toast.LENGTH_SHORT).show();
                    Drawable[] drawables = tv_titleBar.getCompoundDrawables();
                    if (drawables.length > 0) {
                        tv_titleBar.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                    }
                }
            }
        });

    }
}
