package com.bigcake.fuktab.di.component

import com.bigcake.fuktab.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun appName(): String
}