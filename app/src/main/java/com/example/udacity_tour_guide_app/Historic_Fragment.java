package com.example.udacity_tour_guide_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Objects;

public class Historic_Fragment extends Fragment {
    public Historic_Fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
View view=inflater.inflate(R.layout.fragment_historic_, container, false);
        final ArrayList<Guide> Guides = new ArrayList<>();
        Guides.add(new Guide(R.string.pyramid_name , R.string.pyramid_loc,R.drawable.phyramids_historic,R.string.pyramid_call,R.string.pyramid_open_time ));
        Guides.add(new Guide(R.string.alkarnak_name , R.string.alkarnak_loc,R.drawable.karnak_temple_historic,R.string.alkarnak_call ,R.string.alkarnak_open_time));
        Guides.add(new Guide(R.string.abosimple_name, R.string.abosimple_loc,R.drawable.abu_simbel_historic,R.string.abosimple_call,R.string.abosimple_open_time ));
        Guides.add(new Guide(R.string.Hatshepsut_name , R.string.Hatshepsut_loc,R.drawable.queen_hatshepsut_historic,R.string.Hatshepsut_call,R.string.Hatshepsut_open_time));
        Guide_Adapter adapter =new Guide_Adapter(Objects.requireNonNull(getContext()), Guides ,R.color.purple_200);
        ListView listView = (ListView) view.findViewById(R.id.List);
        listView.setAdapter(adapter);
        return view;
    }
}