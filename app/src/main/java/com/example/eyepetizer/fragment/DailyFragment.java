package com.example.eyepetizer.fragment;

import android.app.DownloadManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.eyepetizer.databinding.FragmentDailyBinding;
import com.example.eyepetizer.model.DailyModel;
import com.example.eyepetizer.util.ToastUtil;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import java.util.List;

public class DailyFragment extends Fragment {
    private FragmentDailyBinding binding;
    private RequestQueue queue;
    private List<DailyModel.itemEntity> dataList;
    private String nextUrl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentDailyBinding.inflate(getLayoutInflater());
        initview();
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void initview(){
        binding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                ToastUtil.showMsg(getContext(),"test");
            }
        });

    }


    private void  downLoad(String url) {
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {

            private Gson gson;
            @Override
            public void onResponse(String response) {
                DailyModel dailyModel=gson.fromJson(response,DailyModel.class);
                List<DailyModel.itemEntity> itemEntities=dailyModel.getLists();
                DailyModel.itemEntity itemEntity=itemEntities.get(0);
                dataList.removeAll(dataList);
                dataList.addAll(itemEntities);
                nextUrl=dailyModel.getNextPageUrl();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("===>" , "===获取数据失败===>");

            }
        });

        queue.add(request);
        queue.start();
    }

}
