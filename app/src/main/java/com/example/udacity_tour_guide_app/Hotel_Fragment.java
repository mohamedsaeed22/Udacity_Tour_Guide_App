package com.example.udacity_tour_guide_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Objects;

public class Hotel_Fragment extends Fragment {

    public Hotel_Fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hotel_, container, false);
        final ArrayList<Guide> Guides = new ArrayList<>();
        Guides.add(new Guide(R.string.cairo_hotel_name, R.string.cairo_hotel_loc,R.drawable.cairo_hotel,R.string.cairo_hotel_call,R.string.cairo_hotel_open ));
        Guides.add(new Guide( R.string.luxor_hotel_name, R.string.luxor_hotel_loc,R.drawable.luxury_hotel,R.string.luxor_hotel_call,R.string.luxor_hotel_open ));
        Guides.add(new Guide(R.string.hurghada_hotel_name , R.string.hurghada_hotel_loc,R.drawable.hurghada_hotel,R.string.hurghada_hotel_call,R.string.hurghada_hotel_open ));
        Guides.add(new Guide(R.string.sokhna_hotel_name , R.string.sokhna_hotel_loc,R.drawable.poro_sokhna_hotel,R.string.sokhna_hotel_call,R.string.sokhna_hotel_open ));
        Guide_Adapter adapter =new Guide_Adapter(Objects.requireNonNull(getContext()), Guides ,R.color.purple_500);
        ListView listView = (ListView) view.findViewById(R.id.List);
        listView.setAdapter(adapter);
        return view;
    }
}