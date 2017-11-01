package com.xiangyao.provider;

import com.xiangyao.bean.Cloth;
import com.xiangyao.bean.Clothes;
import com.xiangyao.bean.Shoes;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author xiangyao
 * @date 2017/11/01
 */

@Module()
public class MainMoudule {

    @Provides
    public Cloth getCloth() {

        return new Cloth("红色");
    }


    /**
     * 当创建的依赖对象 依赖于另一个对象
     * 直接传了另一个对象就行
     *
     * */
    @Provides
    public Clothes getClothes(Cloth clothe, Shoes shoes) {
        return new Clothes(clothe, shoes, "NIKE");
    }
}
