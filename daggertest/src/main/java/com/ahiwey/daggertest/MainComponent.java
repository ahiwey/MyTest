package com.ahiwey.daggertest;

import dagger.Component;

/**
 * Created by ahiwey on 2017/3/21.
 */
@Component(modules ={MainModule.class,PoetryModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
