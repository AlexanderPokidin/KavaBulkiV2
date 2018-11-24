package com.pokidin.a.kavabulkiv2.kava;

import com.pokidin.a.kavabulkiv2.base.MvpPresenter;
import com.pokidin.a.kavabulkiv2.base.MvpView;

public interface MainContract {

    interface MainView extends MvpView {

        void buttonPressed();
    }

    interface MainPresenter extends MvpPresenter<MainView> {
        void openNextView();
    }
}
