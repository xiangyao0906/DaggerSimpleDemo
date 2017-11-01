package com.xiangyao.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.xiangyao.R;
import com.xiangyao.bean.Cloth;
import com.xiangyao.bean.Clothes;
import com.xiangyao.component.DaggerMainComponet;
import com.xiangyao.component.MainComponet;
import com.xiangyao.provider.MainMoudule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author xiangyao
 */
public class MainActivity extends AppCompatActivity {
    /**
     * 引用:
     * http://blog.izouxiang.cn/2016/10/22/Dagger2%20入门/
     * <p>
     * <p>
     * 创建依赖关系的两种方式
     *
     * @module 关键字 通过 Componet 确定依赖关系
     * <p>
     * class 在构造方法通过@Inject 关键字
     * <p>
     * 注入对象的时候首先在Componet中寻找 找不到再去找 标识 @Inject的构造方法 实例化对象
     */


    @Inject
    Cloth clothe;
    @BindView(R.id.haha)
    TextView haha;
    @Inject
    Clothes clothes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        MainComponet mainComponet = DaggerMainComponet.builder().mainMoudule(new MainMoudule()).build();

        mainComponet.inject(this);
        haha.setText(clothes.toString());

    }
}
