package com.ahiwey.mytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by ahiwey on 2017/2/28.
 */

public class MyFrament extends Fragment {
    private MyData data;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public void setData(MyData data) {
        this.data = data;
//        public void initWindow() {
//            Window win = ad.getWindow();
//            win.getDecorView().setPadding(0, 0, 0, 0);
//            WindowManager.LayoutParams lp = win.getAttributes();
//            lp.width = (int) (0.2f * getScreenWidth(getContext()));
//            lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
//            lp.gravity = Gravity.CENTER;
//            lp.dimAmount = 0.9f;
//            win.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
//            win.setAttributes(lp);
//        }
    }

    public MyData getData() {
        return data;
    }
}
