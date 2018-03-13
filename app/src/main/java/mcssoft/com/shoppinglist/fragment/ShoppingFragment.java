package mcssoft.com.shoppinglist.fragment;

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

import mcssoft.com.shoppinglist.R;
import mcssoft.com.shoppinglist.adapter.ShoppingItemAdapter;

public class ShoppingFragment extends Fragment {

    //<editor-fold defaultstate="collapsed" desc="Region: Lifecycle">
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.shopping_fragment, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        pageCode = getArguments().getString(Resources.getInstance().getString(R.string.bundle_pagecode_key));

        setShoppingAdapter();     // set adapter associated with the recycler view.
        setRecyclerView();        // set the recycler view.
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_shopping_item, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
    //</editor-fold>

    private void setShoppingAdapter() {
        adapter = new ShoppingItemAdapter();
//        adapter.setData(Database.getInstance().getAllReferenceItems(pageCode));
//        adapter.setOnItemClickListener(this);
    }

    private void setRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.id_rv_shopping_item);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.scrollToPosition(0);
        recyclerView.setLayoutManager(llm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private View rootView;
    private ShoppingItemAdapter adapter;
}
