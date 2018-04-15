package com.tamic.api;

import android.app.Application;

import com.tamic.api.base.api.ApiOperation;
import com.tamic.api.base.api.ApiOperationImpl;

/**
 * Created by Tamic on 2017-12-28.
 */

public class AppAplication extends Application {

    public ApiOperation operation;

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化API
        operation = new ApiOperationImpl(this);

    }

}
