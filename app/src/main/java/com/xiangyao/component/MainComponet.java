package com.xiangyao.component;

import com.xiangyao.provider.MainMoudule;
import com.xiangyao.ui.MainActivity;

import dagger.Component;

/**
 *
 * @author xiangyao
 * @date 2017/11/01
 */

@Component(modules = MainMoudule.class)
public interface MainComponet {
    void inject(MainActivity mainActivity);
}
