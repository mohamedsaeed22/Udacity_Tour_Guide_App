package com.example.udacity_tour_guide_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.Tab_Layout);
        viewPager2=findViewById(R.id.Pager);
        FragmentManager fm=getSupportFragmentManager();
        pagerAdapter=new PagerAdapter(fm,getLifecycle());
        viewPager2.setAdapter(pagerAdapter);
        tabLayout.addTab(tabLayout.newTab().setText("Historic"));
        tabLayout.addTab(tabLayout.newTab().setText("Hotel"));
        tabLayout.addTab(tabLayout.newTab().setText("Rest"));
        tabLayout.addTab(tabLayout.newTab().setText("Shopping"));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}