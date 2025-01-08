package com.husttwj.common

/**
 * Created by TangWenjing on 2025/1/8
 */
interface IAppProvider : IServiceProvider {

    fun getVersionCode(): Int

    fun getVersionName(): String

}

fun getAppProvider(): IAppProvider? = IvyRouter.get(IAppProvider::class.java)