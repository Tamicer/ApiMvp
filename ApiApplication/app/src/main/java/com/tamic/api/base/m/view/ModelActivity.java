package com.tamic.api.base.m.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tamic.api.base.p.IPresenter;
import com.tamic.api.base.v.IBaseView;


/**
 * Created by Tamic on 2018-01-08.
 */

public abstract class ModelActivity<V extends IBaseView, P extends IPresenter> extends AppCompatActivity implements IBaseView {

    protected P presenter;
    protected V view;

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView(false);
    }

    protected abstract P createPresenter();
}
