package com.xiangyao.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnKoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        relativeLayout {
            button("button in center") {
                textSize = sp(18).toFloat()
                onClick {
                    longToast("you click button by anko")
                }
            }.lparams {
                centerInParent()
                width = px2dip(1000).toInt()
                height = px2dip(200).toInt()
            }
        }
    }
}
