package com.tamic.api.bisiness.m;

import com.tamic.api.base.m.data.BaseModel;
import com.tamic.api.bisiness.api.LoginApi;
import com.tamic.api.bisiness.UserBean;

import retrofit2.Call;

/**
 * Created by Tamic on 2017-12-28.
 */

public class LoginModel extends BaseModel<LoginApi, UserBean> {


    public LoginModel() {
    }

    @Override
    public LoginApi getApi() {
        return new LoginApi<>();
    }

    @Override
    public UserBean getBean(String... var) {
        //return (LoginBean) getApi().getData(var);
        return null;
    }

    public Call<UserBean> getFlowable(String... var) {
        return getApi().getData(var);
    }
}
