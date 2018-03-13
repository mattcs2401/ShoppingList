package mcssoft.com.shoppinglist.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import mcssoft.com.shoppinglist.R;
import mcssoft.com.shoppinglist.adapter.ShoppingItemAdapter;
import mcssoft.com.shoppinglist.interfaces.click.IClick;
import mcssoft.com.shoppinglist.interfaces.mvp.IPresenterView;
import mcssoft.com.shoppinglist.interfaces.mvp.IViewPresenter;
import mcssoft.com.shoppinglist.presenter.ShoppingPresenterImpl;

public class ShoppingFragment extends Fragment implements IViewPresenter, IClick.ItemClick {

    //<editor-fold defaultstate="collapsed" desc="Region: Lifecycle">
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shopping_fragment, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        pageCode = getArguments().getString(Resources.getInstance().getString(R.string.bundle_pagecode_key));

        setRecyclerView();        // set the recycler view.
        iPresenterView = new ShoppingPresenterImpl(this, null);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_shopping_item, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Region: IViewPresenter">
    @Override
    public Context getContext() {
        return getActivity().getApplicationContext();
    }

    @Override
    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    @Override
    public IClick.ItemClick getClickListener() {
        return this;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Region: IClick.ItemClick">
    @Override
    public void onItemClick(View view, @Nullable int lPos) {
        // TBA
        String bp = "";
//        iMainActivity.showRaceFragment(iPresenterViewMeeting.getMeeting(lPos));
    }
    //</editor-fold>

    private void setRecyclerView() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.scrollToPosition(0);
        recyclerView.setLayoutManager(llm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        // Note: the recyclerview adapter is set in the model.
    }

    private IPresenterView iPresenterView;

    // Butter Knife.
    private Unbinder unbinder;
    @BindView(R.id.id_rv_shopping_item) RecyclerView recyclerView;
}
