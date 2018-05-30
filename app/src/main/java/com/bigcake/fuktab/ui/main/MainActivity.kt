package com.bigcake.fuktab.ui.main

import android.os.Bundle
import com.bigcake.fuktab.R
import com.bigcake.fuktab.ui.base.BaseActivity

class MainActivity : BaseActivity(), MainViewCallbacks {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
