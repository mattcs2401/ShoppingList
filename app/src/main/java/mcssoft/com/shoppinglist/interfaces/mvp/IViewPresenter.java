package mcssoft.com.shoppinglist.interfaces.mvp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

import mcssoft.com.shoppinglist.interfaces.click.IClick;

public interface IViewPresenter {

    /**
     * Provide access to the application context.
     * @return The application context.
     */
    Context getContext();

    /**
     * Provide access to the Activity.
     * @return The Activity reference.
     */
    Activity getActivity();

    /**
     * Provide a reference to the RecyclerView (within the View).
     * @return The RecyclerView.
     */
    RecyclerView getRecyclerView();

    /**
     *
     * @return
     */
    IClick.ItemClick getClickListener();
}
