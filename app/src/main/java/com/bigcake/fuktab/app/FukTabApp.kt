package com.bigcake.fuktab.app

import android.app.Application
import com.bigcake.fuktab.di.component.AppComponent
import com.bigcake.fuktab.di.component.DaggerAppComponent
import com.bigcake.fuktab.di.module.AppModule

/**
 * Created by kiethuynh on 01/06/2018
 */
class FukTabApp: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}