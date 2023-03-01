package io.sefu.nuntium

import android.app.Application
import app.rive.runtime.kotlin.core.Rive

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Rive.init(applicationContext)
    }
}