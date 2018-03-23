/*
 *    Copyright (C) 2016 Tamic
 *
 *    link :https://github.com/Tamicer/Novate
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.tamic.api.base.api;


import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


/**
 * ApiService
 * Created by Tamic on 2016-06-03.
 */
public interface BaseApiService {

    String BASE_URL = "http://ip.taobao.com/";

    /**
     * http://ip.taobao.com/service/getIpInfo.php?ip=21.22.11.33
     */
    @GET
    <T> Call<T> getData(
            @QueryMap Map<String, Object> maps);
}


