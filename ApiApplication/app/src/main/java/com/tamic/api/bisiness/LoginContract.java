/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tamic.api.bisiness;


import com.tamic.api.base.p.IPresenter;
import com.tamic.api.base.v.IBaseView;

/**
 * This specifies the contract between the view and the presenter.
 * Created by Tamic on 2018-01-04.
 */
public interface LoginContract {

    interface View extends IBaseView {

        void showLoading();

        void dismissLoading();

    }

    interface LoginPresenter extends IPresenter {

    }
}
