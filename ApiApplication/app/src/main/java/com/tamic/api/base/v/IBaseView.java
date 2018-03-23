package com.tamic.api.base.v;

import com.tamic.api.base.p.IPresenter;



public interface IBaseView<T extends IPresenter> {

    void setPresenter(T presenter);
}