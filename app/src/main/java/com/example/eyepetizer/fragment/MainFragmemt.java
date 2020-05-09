package com.example.eyepetizer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.eyepetizer.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainFragmemt extends Fragment {
    private View view;
    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fra_main, container, false);
        initview();
        return view;
    }

    private void initview(){

        viewPager=view.findViewById(R.id.viewpager);
        smartTabLayout=view.findViewById(R.id.viewpagertab);
        FragmentPagerItemAdapter adapter=new FragmentPagerItemAdapter(
                getFragmentManager(), FragmentPagerItems.with(getContext())
                .add("发现", DiscoverFragment.class)
                .add("推荐", NominateFragment.class)
                .add("日报", DailyFragment.class)
                .create());
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }
}
