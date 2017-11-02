package com.xiangyao.ui

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.xiangyao.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnKoActivity : AppCompatActivity() {
    /**
     * anko 布局 没有预览还真不习惯啊
     *
     * 练习的demo 慢慢积累
     *
     * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        verticalLayout {
            relativeLayout {
                imageView(R.mipmap.ic_launcher)
                textView("anko").lparams {
                    centerInParent()
                }
            }.lparams(ViewGroup.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT))

            relativeLayout {
                button("button in center") {
                    textSize = 13.0f
                    setPadding(23, 0, 23, 0)
                    textColor = Color.WHITE
                    backgroundResource = R.drawable.green_corner

                    onClick {
                        longToast("you click button by anko")
                    }

                }.lparams {
                    centerInParent()
                    width = wrapContent
                    height = wrapContent
                }
            }.lparams(ViewGroup.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT))
        }

    }
}
