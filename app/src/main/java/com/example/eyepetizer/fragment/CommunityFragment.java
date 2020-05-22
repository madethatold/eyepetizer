package com.example.eyepetizer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eyepetizer.databinding.LayoutFraCommunityBinding;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class CommunityFragment extends Fragment {
    private LayoutFraCommunityBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = LayoutFraCommunityBinding.inflate(getLayoutInflater());
        initView();
        return binding.getRoot();
    }

    private void initView() {
        FragmentPagerItemAdapter adapter;
        adapter = new FragmentPagerItemAdapter(
                getFragmentManager(), FragmentPagerItems.with(getContext())
                .add("推荐", Nominate2Fragment.class)
                .add("关注", FollowFragment.class)
                .create());
        binding.viewpagerCommunity.setAdapter(adapter);
        binding.tabLayoutCommunity.setupWithViewPager(binding.viewpagerCommunity);
    }
}
