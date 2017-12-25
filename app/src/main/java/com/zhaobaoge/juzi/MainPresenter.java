package com.zhaobaoge.juzi;

import java.util.Map;

import javax.inject.Inject;

/**
* Created by admin on 2017/03/12
*/

public class MainPresenter implements MainContract.Presenter{
    private MainContract.View mView;
    @Inject
    MainPresenter(MainContract.View view){
        mView = view;
    }
    @Override
    public void getText() {

    }

    @Override
    public void destory() {

    }

    @Override
    public void saveData() {

    }

    @Override
    public Map getData() {
        return null;
    }
}