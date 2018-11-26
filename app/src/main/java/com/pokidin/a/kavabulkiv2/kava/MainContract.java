package com.pokidin.a.kavabulkiv2.kava;

import com.pokidin.a.kavabulkiv2.base.MvpPresenter;
import com.pokidin.a.kavabulkiv2.base.MvpView;

public interface MainContract {

    interface View extends MvpView {

        void buttonMenuPressed();
    }

    interface Presenter extends MvpPresenter<View> {
        void openMenuScreen();
    }
}
