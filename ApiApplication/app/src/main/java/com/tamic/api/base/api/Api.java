package com.tamic.api.base.api;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by Tamic on 2017-12-28.
 */

public abstract class Api<T> extends ApiInit {

    /**
     * 1 api管理一些基础 action的方法，不做属性赋值初始化操作，
     * 2 ApiInit沿用好房拓既有的apiInit,
     * 3 从ApiInit里面分离一些签名检验，token过期等共有action
     * 4子类是具体的业务Api，和bean绑定, 输出的数据格式由业务自己指定
     * 5 预留可以兼容retrofit的注解接口*/
    public abstract T getData(String... var1) throws ExecutionException, InterruptedException;

    //todo add 扩展基础接口
    public void doSomething() {

    }

    public Call<T> getDataWithRetrofit(Map<String, Object> parameters) {
        return new Retrofit.Builder().build().create(BaseApiService.class).getData(parameters);
    }
}
