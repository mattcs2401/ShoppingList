package mcssoft.com.shoppinglist.model.impl;

import android.content.Context;
import android.view.View;

import butterknife.ButterKnife;
import mcssoft.com.shoppinglist.interfaces.mvp.IModelPresenter;
import mcssoft.com.shoppinglist.interfaces.mvp.IPresenterModel;

public class ShoppingModelImpl implements IModelPresenter {

    public ShoppingModelImpl(IPresenterModel iPresenterModel) {
        // retain reference to the IPresenterModel interface.
        this.iPresenterModel =iPresenterModel;
        Context context = iPresenterModel.getContext();

        // set the adapter.
        setAdapter();
        // set the database.
//        raceDatabase = RaceDatabase.getInstance(context);
        // set the loader manager.
//        loaderManager = iPresenterModel.getActivity().

//        getLoaderManager();

        // resource bindings
        ButterKnife.bind(this,new View(context)); // a bit of a hack but seems to work.

//        doMeetingOps(COUNT_MEETINGS, null);
    }

    private void setAdapter() {

    }

    private IPresenterModel iPresenterModel;

}
