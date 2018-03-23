package com.tamic.api.base.m.data;



/**
 * Created by LIUYONGKUI726 on 2017-12-28.
 */

public abstract class BaseModel<T, E> {

    abstract public   T getApi();

    abstract public E getBean(String... var);
}
