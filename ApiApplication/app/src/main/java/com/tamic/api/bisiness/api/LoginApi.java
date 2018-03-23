package com.tamic.api.bisiness.api;


import com.tamic.api.base.api.Api;
import com.tamic.api.bisiness.UserBean;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

/**
 * Created by LIUYONGKUI726 on 2017-12-28.
 */

public class LoginApi<T> extends Api {

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[] {
            "foo@example.com:hello", "bar@example.com:world"
    };

    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */
    private UserLoginTask mAuthTask = null;

    @Override
    public Call<UserBean> getData(String... var1) {
       /* //模拟请求
        if(mAuthTask!= null) {
            mAuthTask.onCancelled();
        }
        mAuthTask = new UserLoginTask(var1[0], var1[1]);
        return (T) mAuthTask.execute();*/
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("ip", "21.22.11.33");
        return create(LoginApiService.class).login(hashMap);

    }


    public interface LoginApiService {

        /**
         * http://ip.taobao.com/service/getIpInfo.php?ip=21.22.11.33
         */
        @GET("service/getIpInfo.php")
        @Headers({"Accept: application/json"})
        Call<UserBean> login(
                @QueryMap Map<String, String> maps);
    }


    /**
     * Represents an asynchronous login/registration task used to authenticate
     * the user.
     */
    public class UserLoginTask {

        private final String mEmail;
        private final String mPassword;

        UserLoginTask(String email, String password) {
            mEmail = email;
            mPassword = password;
        }

        String execute() {
            return onPostExecute(doInBackground());
        }

        protected String doInBackground(Void... params) {
            // TODO: attempt authentication against a network service.
            for (String credential : DUMMY_CREDENTIALS) {
                String[] pieces = credential.split(":");
                if (pieces[0].equals(mEmail)) {
                    // Account exists, return true if the password matches.
                    return pieces[1].equals(mPassword) ? "恭喜你 ！登录成功" : "失败";
                }
            }

            // TODO: register the new account here.
            return "恭喜你 ！登录成功";
        }


        protected String onPostExecute(final String success) {
            mAuthTask = null;
            return success;
        }

        protected void onCancelled() {
            mAuthTask = null;
        }
    }
}
