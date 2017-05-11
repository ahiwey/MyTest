package com.ahiwey.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ahiwey on 2017/3/21.
 */

@Module
public class PoetryModule {

    // 这个方法需要一个String参数，在Dagger2注入中，这些参数也是注入形式的，也就是
    // 要有其他对方提供参数poems的生成，不然会造成编译出错
    @Provides
    public Poetry providePoetry(String poems,String st1){
        return new Poetry(poems,st1);
    }
    @Provides
    public String providePoems(){
        return "才能到达彼岸";
    }
    // 这里提供了一个生成String的方法，在这个Module里生成Poetry实例时，会查找到这里
    // 可以为上面提供String类型的参数



}