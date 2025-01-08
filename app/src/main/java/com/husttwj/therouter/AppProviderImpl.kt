package com.husttwj.therouter

import com.husttwj.common.IAppProvider
import com.therouter.inject.ServiceProvider

/**
 * Created by TangWenjing on 2025/1/8
 */
@ServiceProvider
class AppProviderImpl: IAppProvider {

    override fun getVersionCode(): Int {
        return 1
      //  return BuildConfig.VERSION_CODE
    }

    override fun getVersionName(): String {
        return "1.0"
      //  return BuildConfig.VERSION_NAME
    }
}