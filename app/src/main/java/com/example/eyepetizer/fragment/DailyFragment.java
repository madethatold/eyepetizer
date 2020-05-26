package com.example.eyepetizer.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.eyepetizer.adapter.DailyAdapter;
import com.example.eyepetizer.databinding.FragmentDailyBinding;
import com.example.eyepetizer.model.DailyModel;
import com.example.eyepetizer.networks.API;
import com.example.eyepetizer.util.HttpUtil;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;
import okhttp3.Response;

public class DailyFragment extends Fragment {
    private static String TAG = ".....................Daily";
    private FragmentDailyBinding binding;
    private List<DailyModel.itemEntity.DataEntity> dataList = new ArrayList<>();
    private List<DailyModel.itemEntity> itemEntities = new ArrayList<>();
    private String nextUrl;
    private DailyAdapter adapter;
    private boolean isload = true;
    private List<DailyModel.itemEntity.DataEntity> list2 = new ArrayList<>();
    private List<DailyModel.itemEntity> list1 = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDailyBinding.inflate(getLayoutInflater());
        downLoad(API.DAILY);
        binding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                downLoad(nextUrl);
                Log.d(TAG, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + list1.size() + " " + list2.size());
                adapter.add(list1,list2);
                binding.refreshLayout.finishLoadMore(1000);
            }
        });
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void initview() {

        //为recyclerView设置Adapter
        binding.rvDaily.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new DailyAdapter(itemEntities, dataList);
        binding.rvDaily.setAdapter(adapter);

        Log.d(TAG, "initview: " + itemEntities.size() + "      " + dataList.size());
        isload=false;
    }

    //网络请求
    private void downLoad(final String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Request request = new Request.Builder()
                            .url(url)
                            .build();
                    Response response = HttpUtil.getInstance().newCall(request).execute();
                    String responseData = response.body().string();
                    parseJSONWithGSON(responseData);
                    if (isload) {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                initview();
                            }
                        });
                        adapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //json转换为实体类
    private void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        DailyModel dailyModel = gson.fromJson(jsonData, DailyModel.class);
        nextUrl = dailyModel.getNextPageUrl();

        //itemEntities初始化
        itemEntities = dailyModel.getLists();
        //dataList初始化
        for (DailyModel.itemEntity entity : itemEntities) {
            dataList.add(entity.getDataEntity());
        }

        list1 = dailyModel.getLists();
        for (DailyModel.itemEntity entity : list1) {
            list2.add(entity.getDataEntity());
        }


    }

}
