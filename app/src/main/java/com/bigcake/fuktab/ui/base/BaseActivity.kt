package com.bigcake.fuktab.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bigcake.fuktab.app.FukTabApp
import com.bigcake.fuktab.di.component.ActivityComponent
import com.bigcake.fuktab.di.component.DaggerActivityComponent

abstract class BaseActivity: AppCompatActivity() {
    lateinit var component: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component = DaggerActivityComponent.builder()
                .appComponent((application as FukTabApp).appComponent)
                .build()

        setUpcomponent(component)
    }

    abstract fun setUpcomponent(component: ActivityComponent)
}