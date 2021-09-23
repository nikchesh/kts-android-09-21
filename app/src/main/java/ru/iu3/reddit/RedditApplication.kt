package ru.iu3.reddit

import android.app.Application
import timber.log.Timber

class RedditApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}