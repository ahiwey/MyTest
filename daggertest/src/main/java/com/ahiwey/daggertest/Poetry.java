package com.ahiwey.daggertest;

/**
 * Created by ahiwey on 2017/3/21.
 */

public class Poetry {
    private String mPoemo;
    private String st1;

    public Poetry(){
        mPoemo="生活就像海洋";
    }

    public Poetry(String st,String st1){
        mPoemo=st;
        this.st1=st1;
    }
    public String getmPoemo() {
        return mPoemo;
    }

    public String getSt1() {
        return st1;
    }
}
