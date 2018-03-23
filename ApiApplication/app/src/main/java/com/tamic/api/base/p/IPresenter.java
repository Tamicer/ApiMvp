package com.tamic.api.base.p;


import com.tamic.api.base.v.IBaseView;

public interface IPresenter<V extends IBaseView> {

    void start();

    void attachView(V view);

    void detachView(boolean retainInstance);
}
