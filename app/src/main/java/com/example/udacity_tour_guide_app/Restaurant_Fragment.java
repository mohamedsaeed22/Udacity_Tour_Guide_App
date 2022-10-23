package com.example.udacity_tour_guide_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;


public class Restaurant_Fragment extends Fragment {
    public Restaurant_Fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_resturant_, container, false);
        final ArrayList<Guide> Guides = new ArrayList<>();
        Guides.add(new Guide(R.string.cairo_res_name , R.string.cairo_res_loc,R.drawable.cairo_restaurant, R.string.cairo_res_call,R.string.cairo_res_open));
        Guides.add(new Guide(R.string.nile_res_name  ,R.string.nile_res_loc ,R.drawable.nile_retaurant,R.string.nile_res_call,R.string.nile_res_open ));
        Guides.add(new Guide(R.string.fish_res_name , R.string.fish_res_loc,R.drawable.fish_restaurant,R.string.fish_res_call ,R.string.fish_res_open ));
        Guides.add(new Guide(R.string.opet_res_name  , R.string.opet_res_loc,R.drawable.opet_resaurant,R.string.opet_res_call,R.string.opet_res_open ));
        Guide_Adapter adapter =new Guide_Adapter(Objects.requireNonNull(getContext()), Guides ,R.color.teal_700);
        ListView listView = (ListView) view.findViewById(R.id.List);
        listView.setAdapter(adapter);
        return view;
    }
}