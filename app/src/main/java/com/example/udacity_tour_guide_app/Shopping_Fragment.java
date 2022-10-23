package com.example.udacity_tour_guide_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class Shopping_Fragment extends Fragment {
    public Shopping_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shopping_, container, false);
        final ArrayList<Guide> Guides = new ArrayList<>();
        Guides.add(new Guide(R.string.arab_mall_name, R.string.arab_mall_loc, R.drawable.arab_mall_shopping, R.string.arab_mall_call, R.string.arab_mall_open));
        Guides.add(new Guide(R.string.cairo_festival_mall_name, R.string.cairo_festival_mall_loc, R.drawable.cairo_festival_mall_shopping, R.string.cairo_festival_mall_call, R.string.cairo_festival_mall_open));
        Guides.add(new Guide(R.string.city_stars_mall_name, R.string.city_stars_mall_loc, R.drawable.citystars_malls_shopping, R.string.city_stars_mall_call, R.string.city_stars_mall_open));
        Guides.add(new Guide(R.string.hurghada_mall_name, R.string.hurghada_mall_loc, R.drawable.hurghada_mall_shopping, R.string.hurghada_mall_call, R.string.hurghada_mall_open));
        Guide_Adapter adapter = new Guide_Adapter(Objects.requireNonNull(getContext()), Guides, R.color.purple_700);
        ListView listView = (ListView) view.findViewById(R.id.List);
        listView.setAdapter(adapter);
        return view;
    }
}