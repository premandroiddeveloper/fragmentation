package com.example.fragmentation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class languagename extends ListFragment {
    clicked cl1;


    interface  clicked{
    public void fun(int id);
    }
    public languagename(){

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        cl1=(clicked)context;

    }


    

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String j1[]=getResources().getStringArray(R.array.languages);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,j1));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        cl1.fun(position);
    }
// TODO: Rename and change types and number of parameters



}