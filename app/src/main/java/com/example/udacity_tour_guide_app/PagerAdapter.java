package com.example.udacity_tour_guide_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {
    public PagerAdapter(@NonNull  FragmentManager fm, @NonNull Lifecycle lifecycle) {
        super(fm, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new Hotel_Fragment();
            case 2:
                return new Restaurant_Fragment();
            case 3:
                return new Shopping_Fragment();
        }
        return new Historic_Fragment();
    }
    @Override
    public int getItemCount() {
        return 4;
    }
}
