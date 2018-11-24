package com.pokidin.a.kavabulkiv2.kava;

    /* The Catalog name refers to the list of coffee drinks menu.
    This name is chosen to avoid the Menu and List names for the class. */

import com.pokidin.a.kavabulkiv2.base.MvpPresenter;
import com.pokidin.a.kavabulkiv2.base.MvpView;

public interface CatalogContract {

    interface CatalogView extends MvpView {

        int getSelectedItemPosition();
    }

    interface CatalogPresenter extends MvpPresenter<CatalogView> {

    }
}
