package com.zhaobaoge.juzi;

import dagger.Component;

/**
 * Created by admin on 2017/3/12.
 */
@Component( modules = MainPresenterModule .class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
