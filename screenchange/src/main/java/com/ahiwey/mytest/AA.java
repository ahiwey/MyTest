package com.ahiwey.mytest;

import android.util.Log;

/**
 * Created by ahiwey on 2017/3/1.
 */

public class AA {
    static {
        Log.d("AA","static_aa");
    }
    public AA(){
        Log.d("AA","aa");
    }
    public AA(String aa1){
        Log.d("AA","aa1");
    }
}
