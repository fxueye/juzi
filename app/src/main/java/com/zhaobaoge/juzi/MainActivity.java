package com.zhaobaoge.juzi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View{
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder().mainPresenterModule(new MainPresenterModule(this)).build().inject(this);
    }

    @Override
    public void setText(String text) {

    }

    @Override
    public void showProgressDialogView() {

    }

    @Override
    public void hiddenProgressDialogView() {

    }
}
