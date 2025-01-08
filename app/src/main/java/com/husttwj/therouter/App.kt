package com.husttwj.therouter

import android.app.Application
import android.content.Context
import android.util.Log
import com.husttwj.common.IvyRouter
import com.husttwj.common.getAppProvider

/**
 * Created by TangWenjing on 2025/1/8
 */
class App: Application() {

    override fun attachBaseContext(base: Context?) {
        Thread.sleep(4000)
        super.attachBaseContext(base)

        // 禁用自动初始化
        com.therouter.theRouterUseAutoInit = false
    }

    override fun onCreate() {
        super.onCreate()

        IvyRouter.init(this)

        Log.e("twj124", "onCreate:" +  getAppProvider())
    }

}