package com.ahiwey.mytest;

import android.util.Log;

/**
 * Created by ahiwey on 2017/3/1.
 *
 */

public class BB extends AA {

    static {
        Log.d("BB", "static_bb");
    }

    public BB() {
        Log.d("BB", "bb");
    }
}
