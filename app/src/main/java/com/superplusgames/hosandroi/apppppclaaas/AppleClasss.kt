package com.superplusgames.hosandroi.apppppclaaas

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandroi.ottther.Saaasha.oneSfrgtftrgttgtgt

class AppleClasss:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        gtijgijyhjyhyhghgthtg()
        Hawk.init(this).build()
    }

    private fun gtijgijyhjyhyhghgthtg() {
        gtigtjgtjgt()
        gtkgtktgkgtk()
    }

    private fun gtigtjgtjgt() {
        OneSignal.initWithContext(this)
    }

    private fun gtkgtktgkgtk() {
        OneSignal.setAppId(oneSfrgtftrgttgtgt)
    }
}