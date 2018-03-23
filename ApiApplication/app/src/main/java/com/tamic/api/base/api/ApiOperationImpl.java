package com.tamic.api.base.api;

import android.content.Context;


/**
 * Created by LIUYONGKUI726 on 2017-12-28.
 */

public class ApiOperationImpl implements ApiOperation {

    public ApiOperationImpl(Context context) {
        // 初始化API
        ApiInit.initialize(context);
    }


    @Override
    public Api getApi(ApiType type) {

       /* switch (type) {
            case HFB:
             return HaoFangtuoApi.getIntstens; //兼容目前的遗留的四个Api

        }*/
        return null;
    }
}
