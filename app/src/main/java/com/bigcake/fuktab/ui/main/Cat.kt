package com.bigcake.fuktab.ui.main

import android.util.Log
import javax.inject.Inject

/**
 * Created by kiethuynh on 01/06/2018
 */
class Cat @Inject constructor() {
    fun call() {
        Log.d("CAT", "Meoooo!")
    }
}