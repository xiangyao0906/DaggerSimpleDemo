package com.xiangyao.bean;

import dagger.Module;

/**
 *
 * @author xiangyao
 * @date 2017/11/01
 */

@Module
public class Cloth {

    String color;

    public Cloth(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
