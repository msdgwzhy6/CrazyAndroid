package com.cnpeng.cnpeng_demos2017_01.b_08_CL_TB_VP_RV;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * 作者：CnPeng
 * <p>
 * 时间：2017/4/12:下午6:22
 * <p>
 * 说明：ViewPager 的适配器
 */

class ClTbVpRvViewPagerAdapter extends FragmentPagerAdapter {

    private final String[] titles;

    public ClTbVpRvViewPagerAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return ClTbVpRbFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
