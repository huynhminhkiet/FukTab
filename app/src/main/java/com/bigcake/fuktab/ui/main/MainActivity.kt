package com.bigcake.fuktab.ui.main

import android.os.Bundle
import android.util.Log
import com.bigcake.fuktab.R
import com.bigcake.fuktab.di.component.ActivityComponent
import com.bigcake.fuktab.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject lateinit var cat: Cat
    @Inject lateinit var appName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cat.call()
        Log.d("AAA", appName)
    }

    override fun setUpcomponent(component: ActivityComponent) {
        component.inject(this)
    }
}
