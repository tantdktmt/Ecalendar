package com.dmspro.ecalendar.core;

/**
 * Created by tantd on 2/7/2020.
 */
public interface IView<T extends IPresenter> {

    void onError(Throwable t);
}
