package com.utils.library;

import android.content.Intent;

/**
 * Created by dell on 2016/5/21.
 */
public class IntentUtil {

    private IntentUtil(){throw  new AssertionError();}

    /**
     * 判断intent和它的bundle是否为空
     *
     * @param intent
     * @return
     */
    public static boolean isBundleEmpty(Intent intent) {
        return (intent == null) && (intent.getExtras() == null);
    }
}
