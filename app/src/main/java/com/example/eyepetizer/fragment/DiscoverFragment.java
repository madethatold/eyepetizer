package com.example.eyepetizer.fragment;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.eyepetizer.adapter.FindMoreAdapter;
import com.example.eyepetizer.databinding.FragmentDiscoverBinding;
import com.example.eyepetizer.model.FindMoreModel;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DiscoverFragment extends Fragment {

    private static String TAG = "_______________________Discover";
    private FragmentDiscoverBinding binding;
    private List<FindMoreModel.ItemListBeanX> itemListBeanXList = new ArrayList<>();
    private List<FindMoreModel.ItemListBeanX.DataBeanX> dataBeanXList = new ArrayList<>();

    private FindMoreAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDiscoverBinding.inflate(getLayoutInflater());

        parseJSONWithGSON(getJson("findMore.json", getContext()));

        binding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                binding.refreshLayout.finishRefresh(500);
            }
        });
        binding.refreshLayout.setEnableLoadMore(false);
        return binding.getRoot();
    }

    private void initview() {
        //为recyclerView设置Adapter
        binding.rvFindMore.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new FindMoreAdapter(itemListBeanXList, dataBeanXList);
        binding.rvFindMore.setAdapter(adapter);
        Log.d(TAG, "initview: " + itemListBeanXList.size() + "     " + dataBeanXList.size());
    }

    //json转换为实体类
    private void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        FindMoreModel findMoreModel = gson.fromJson(jsonData, FindMoreModel.class);
        //list初始化
        itemListBeanXList = findMoreModel.getItemList();
        for (int i = 0; i < itemListBeanXList.size(); i++) {
            if (itemListBeanXList.get(i).getType().equals("textCard")) {
                if (itemListBeanXList.get(i).getData().getText().equals("查看全部分类")) {
                    itemListBeanXList.remove(i);
                }
            }
        }
        //dataBeanList初始化
        for (FindMoreModel.ItemListBeanX itemListBeanX : itemListBeanXList) {
            dataBeanXList.add(itemListBeanX.getData());
        }

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                initview();
            }
        });
        adapter.notifyDataSetChanged();
    }

    //将json数据文件变成字符串
    public static String getJson(String fileName, Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //获取assets资源管理器
            AssetManager assetManager = context.getAssets();
            //通过管理器打开文件并读取
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}