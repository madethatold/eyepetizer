package com.example.eyepetizer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eyepetizer.databinding.LayoutFraNotificationBinding;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class NotificationFragment extends Fragment {
    private LayoutFraNotificationBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = LayoutFraNotificationBinding.inflate(getLayoutInflater());
        initview();
        return binding.getRoot();
    }

    private void initview(){
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getFragmentManager(), FragmentPagerItems.with(getContext())
                .add("推送", PushFragment.class)
                .add("互动", InteractFragment.class)
                .add("私信",MessageFragment.class)
                .create());
        binding.viewpagerNo.setAdapter(adapter);
        binding.tabLayoutNo.setupWithViewPager(binding.viewpagerNo);
    }
}
