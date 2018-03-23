package com.tamic.api.base.api;


/**
 * Created by liuyongkui726 on 2017-12-15.
 */

public abstract class CallBack<T> {

    public abstract void onSuccess(int code, String msg, T data);

    public abstract void onFailure(int code, String msg);

    public void onFinal() {

    }
}
