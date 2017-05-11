package com.ahiwey.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.File;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject
    Poetry mPoetry;

    @BindView(R.id.tv_show)
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerMainComponent.builder().build().inject(this);//使用Dagger2生成的类 生成组件进行构造，并注入
        initView();
    }

    private void initView() {
        tvShow.setText(mPoetry.getmPoemo()+mPoetry.getSt1());
        File files=null;
        files.listFiles();
    }

}
