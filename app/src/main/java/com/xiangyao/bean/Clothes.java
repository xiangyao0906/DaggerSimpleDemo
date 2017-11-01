package com.xiangyao.bean;

/**
 *
 * @author xiangyao
 * @date 2017/11/01
 */

public class Clothes {
    private Cloth clothe;
    private String brand;
    private Shoes shoes;

    public Clothes(Cloth clothe, Shoes shoes , String brand) {
        this.clothe = clothe;
        this.brand = brand;
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return clothe.color + "布料的" + brand + "衣服和"+shoes;
    }
}
