package com.utils.library;

import android.content.Context;
import android.util.TypedValue;

/**
 * 常用单位转换的辅助类，涉及到单位转换的方法都在这里
 * <ul>
 * <strong>Convert between dp and sp</strong>
 * <li>{@link ScreenUtil#dp2Px(Context, float)}</li>
 * <li>{@link ScreenUtil#px2Dp(Context, float)}</li>
 * </ul>
 **/
public class ScreenUtil {


    private ScreenUtil() {
        throw new AssertionError();
    }

    /**
     * dp转px
     */
    public static float dp2Px(Context context, float dp) {
        if (context == null) {
            return -1;
        }
        return dp * context.getResources().getDisplayMetrics().density;
    }

    /**
     * px转dp
     */
    public static float px2Dp(Context context, float px) {
        if (context == null) {
            return -1;
        }
        return px / context.getResources().getDisplayMetrics().density;
    }

    /**
     * sp转px
     */
    public static int sp2Px(Context context, float spVal) {
        if (context == null) {
            return -1;
        }
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px转sp
     */
    public static float px2Sp(Context context, float pxVal) {
        if (context == null) {
            return -1;
        }
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }

    /**
     *
     * @param context
     * @param dp
     * @return
     */
    public static int dp2PxInt(Context context, float dp) {
        return (int)(dp2Px(context, dp) + 0.5f);
    }

    /**
     *
     * @param context
     * @param px
     * @return
     */
    public static int pxToDpCeilInt(Context context, float px) {
        return (int)(px2Dp(context, px) + 0.5f);
    }
}
