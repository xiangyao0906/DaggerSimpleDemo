package com.xiangyao.bean;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author xiangyao
 * @date 2017/11/01
 */

public class Shoes {

    @Inject
    @Singleton
    Shoes() {
    }


    @Override
    public String toString() {
        return "滑板鞋";
    }
}
