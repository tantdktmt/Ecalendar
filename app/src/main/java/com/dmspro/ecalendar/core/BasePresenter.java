package com.dmspro.ecalendar.core;

/**
 * Created by tantd on 2/7/2020.
 */
public class BasePresenter<V extends IView> implements IPresenter<V> {

    private static final String TAG = BasePresenter.class.getName();

    protected V view;

    protected UseCaseHandler useCaseHandler;

    public BasePresenter() {
        useCaseHandler = UseCaseHandler.getInstance();
    }

    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        view = null;
    }
}
