package mcssoft.com.shoppinglist.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import mcssoft.com.shoppinglist.interfaces.mvp.IModelPresenter;
import mcssoft.com.shoppinglist.interfaces.mvp.IPresenterModel;
import mcssoft.com.shoppinglist.interfaces.mvp.IPresenterView;
import mcssoft.com.shoppinglist.interfaces.mvp.IViewPresenter;
import mcssoft.com.shoppinglist.interfaces.mvp.click.IClick;
import mcssoft.com.shoppinglist.model.impl.ShoppingModelImpl;

public class ShoppingPresenterImpl implements IPresenterModel, IPresenterView {

    /**
     * Implemeentation of the main Presenter.
     * @param iViewPresenter reference to IViewPresenter interface.
     * @param arguments TBA.
     */
    public ShoppingPresenterImpl(@NonNull IViewPresenter iViewPresenter, @Nullable Bundle arguments) {
        this.iViewPresenter = iViewPresenter;
        iModelPresenter = new ShoppingModelImpl(this);
    }

    //<editor-fold defaultstate="collapsed" desc="Region: IPresenterModel">
    @Override
    public Context getContext() { return iViewPresenter.getContext(); }

    @Override
    public Activity getActivity() {
        return iViewPresenter.getActivity();
    }

    @Override
    public RecyclerView getRecyclerView() {
        return iViewPresenter.getRecyclerView();
    }

    @Override
    public IClick.ItemClick getClickListener() {
        return iViewPresenter.getClickListener();
    }
    //</editor-fold>

    private IViewPresenter iViewPresenter;
    private IModelPresenter iModelPresenter;
}
