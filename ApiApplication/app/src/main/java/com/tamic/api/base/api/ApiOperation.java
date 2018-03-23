package com.tamic.api.base.api;

/**
 * Created by LIUYONGKUI726 on 2017-12-28.
 */

public interface ApiOperation {

    Api getApi(ApiType type);

    enum ApiType {
        COMMOM, HFT, HFB, UC
    }
}
