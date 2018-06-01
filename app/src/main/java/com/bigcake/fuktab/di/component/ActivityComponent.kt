package com.bigcake.fuktab.di.component

import com.bigcake.fuktab.di.scope.ActivityScope
import com.bigcake.fuktab.ui.main.MainActivity
import dagger.Component

/**
 * Created by kiethuynh on 01/06/2018
 */
@ActivityScope
@Component(dependencies = [AppComponent::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}