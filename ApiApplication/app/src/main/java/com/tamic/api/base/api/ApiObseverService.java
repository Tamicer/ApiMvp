package com.tamic.api.base.api;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by liuyongkui726 on 2017-12-15.
 */
public class ApiObseverService {


    private static ApiObseverService sCityService;
    private CallBack mCityInfo;

    private Map<String, CallChangedObserver> mObservers = new HashMap();

    public static ApiObseverService getInstance(Context context) {
        if (sCityService == null) {
            synchronized (ApiObseverService.class) {
                if (sCityService == null) {
                    sCityService = new ApiObseverService(context);
                }
            }
        }
        return sCityService;
    }

    private ApiObseverService(final Context context) {

    }


    public void registerObserver(String tag, CallChangedObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (mObservers) {
            if (mObservers.containsKey(tag)) {
                throw new IllegalStateException("Observer " + observer + " is already registered.");
            }
            mObservers.put(tag, observer);
        }
    }


    public void unregisterObserver(CallChangedObserver observer) {
        if (observer == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (mObservers) {

            if (!mObservers.containsValue(observer)) {
                throw new IllegalStateException("Observer " + observer + " was not registered.");
            }
            mObservers.remove(observer);
        }
    }


    public void unregisterAllObservers() {
        synchronized (mObservers) {
            mObservers.clear();
        }
    }


    public void notifyDataChanged(CallBack callBack) {
        for (String set : mObservers.keySet()) {
            mObservers.get(set).onChanged(set, callBack);
        }
    }


}
