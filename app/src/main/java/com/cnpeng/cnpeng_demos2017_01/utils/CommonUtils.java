package com.cnpeng.cnpeng_demos2017_01.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by CnPeng on 2017/1/6.
 * <p>
 * 通用工具类
 */

public class CommonUtils {

    /**
     * 自定义开启Activity的方法
     *
     * @param context       上下文
     * @param activityClass 要开启的activity.class
     */
    public static void mStartActivity(Context context, Class activityClass) {
        Intent intent = new Intent(context, activityClass);
        context.startActivity(intent);
    }

    /**
     * 自定义开启Activity的方法，携带数据
     *
     * @param context       上下文
     * @param activityClass 要开启的activity.class
     * @param bundle        要传递的数据
     * @param key           传递数据时使用的键名
     */
    public static void mStartActivity(Context context, Class activityClass, Bundle bundle, String key) {
        Intent intent = new Intent(context, activityClass);
        intent.putExtra(key, bundle);
        context.startActivity(intent);
    }

//    /**
//     * 自定义开启Activity的方法，携带数据
//     *
//     * @param activity      当前activity类
//     * @param activityClass 要开启的activity.class
//     * @param bundle        要传递的数据
//     * @param key           传递数据时使用的键名
//     * @param requestCode   请求码
//     */
//    public static void mStartActivityForResult(Activity activity, Class activityClass, Bundle bundle, String key,
//                                               int requestCode) {
//        Intent intent = new Intent(activity, activityClass);
//        intent.putExtra(key, bundle);
//        activity.startActivityForResult(intent,requestCode);
//    }

}
