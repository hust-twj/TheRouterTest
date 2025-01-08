package com.husttwj.common

import android.os.Handler
import android.os.Looper
import android.util.Log

/**
 * Created by TangWenjing on 2025/1/8
 */
object PackageUtil {

    private var handler =  Handler(Looper.getMainLooper())

    fun getVersionName(): String {
        log()
        print()
        return getAppProvider()?.getVersionName() ?: ""
    }

    private var count = 0
    private fun print() {
        handler.postDelayed({
            if (count < 30) {
                log()
                print()
            }
        }, 100)
    }

    private var time = 0L
    private fun log() {
        if (System.currentTimeMillis() - time < 5) {
            return
        }
        time = System.currentTimeMillis()
        Log.e("twj124", "print:" + getAppProvider())
    }

    fun getVersionCode(): Long {
        return getAppProvider()?.getVersionCode()?.toLong() ?: 0L
    }
}