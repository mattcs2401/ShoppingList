package mcssoft.com.shoppinglist.interfaces.mvp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

import mcssoft.com.shoppinglist.interfaces.click.IClick;

public interface IPresenterModel {

    Context getContext();

    Activity getActivity();

    RecyclerView getRecyclerView();

    IClick.ItemClick getClickListener();
}
