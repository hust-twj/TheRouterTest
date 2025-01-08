package com.husttwj.common;

import android.app.Application;

import com.therouter.TheRouter;
import com.therouter.router.Navigator;


public class IvyRouter {

    public static void init(Application application) {
        if (com.therouter.InnerTheRouterContentProviderKt.getApplicationContext() == null) {
            com.therouter.InnerTheRouterContentProviderKt.setContext(application);
        }
        TheRouter.init(application);
    }

    public static TheRouter getInstance() {
        return TheRouter.INSTANCE;
    }

    /**
     * 获取跨模块依赖的服务
     *
     * @param clazz  clazz
     * @param params params
     * @param <T>    T
     * @return T
     */
    public static <T> T get(Class<T> clazz, Object... params) {
        return TheRouter.get(clazz, params);
    }

    public static synchronized void openDebug() {
        TheRouter.setDebug(true);
    }

    public static boolean debuggable() {
        return TheRouter.isDebug();
    }

    /**
     * Inject params and services.
     */
    public static void inject(Object thiz) {
        TheRouter.inject(thiz);
    }

    /**
     * Build the roadmap, draw a postcard.
     *
     * @param path Where you go.
     */
    public Navigator build(String path) {
        return TheRouter.build(path);
    }

}
