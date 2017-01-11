package com.cnpeng.cnpeng_demos2017_01.utils;

import android.util.Log;

/**
 * Created by CnPeng on 2017/1/6. 自定义Log工具类，方便发版时屏蔽log
 */

public class LogUtils {
    private static int v = 1;
    private static int d = 2;
    private static int i = 3;
    private static int w = 4;
    private static int e = 5;

    // 终止符，初始值1，想屏蔽log时给一个大值   
    private static int end = 1;

    public static void v(String tag, String msg) {
        if (v >= end) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (d >= end) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (i >= end) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (w >= end) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (e >= end) {
            Log.e(tag, msg);
        }
    }

}
