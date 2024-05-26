package com.onixx.ef_testwork

import android.app.Application
import com.onixx.ef_testwork.di.appModule
import com.onixx.ef_testwork.di.dataModule
import com.onixx.ef_testwork.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(){
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(listOf(
                appModule, dataModule, domainModule
            ))
        }

    }
}