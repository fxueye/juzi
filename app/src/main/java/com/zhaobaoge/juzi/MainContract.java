package com.zhaobaoge.juzi;

import java.util.Map;

/**
 * Created by shikewei on 2017/12/25.
 */

public interface MainContract {
    interface View {
        void setText(String text);

        void showProgressDialogView();

        void hiddenProgressDialogView();
    }

    interface Presenter {
        void getText();

        void destory();

        void saveData();

        Map getData();
    }

}