package com.example.eyepetizer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.eyepetizer.adapter.Nominate2Adapter;
import com.example.eyepetizer.databinding.FragmentNominate2Binding;
import com.example.eyepetizer.model.Nominate2Model;
import com.example.eyepetizer.networks.API;
import com.example.eyepetizer.util.HttpUtil;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;
import okhttp3.Response;

public class Nominate2Fragment extends Fragment {
    private static String TAG = ".....................Nominate2";
    private FragmentNominate2Binding binding;
    private Nominate2Adapter adapter;
    private String nextpageUrl;
    private List<Nominate2Model.ItemListBeanX> itemListBeanXList=new ArrayList<>();
    private List<Nominate2Model.ItemListBeanX.DataBeanX> dataBeanXList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentNominate2Binding.inflate(getLayoutInflater());
        downLoad(API.NOMINATE2);
        initview();
        binding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                downLoad(nextpageUrl);
                binding.refreshLayout.finishLoadMore(1000);
            }
        });
        binding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                binding.refreshLayout.finishRefresh(1000);
            }
        });
        return binding.getRoot();
    }

    private void initview(){
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        manager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        binding.rvNominate2.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                manager.invalidateSpanAssignments();
            }
        });
        binding.rvNominate2.setLayoutManager(manager);
        adapter=new Nominate2Adapter(itemListBeanXList,dataBeanXList);
        binding.rvNominate2.setAdapter(adapter);

    }


    //网络请求
    private void downLoad(final String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

//                    OkHttpClient client=new OkHttpClient();
                    Request request = new Request.Builder()
                            .url(url)
                            .build();
                    Response response = HttpUtil.getInstance().newCall(request).execute();
                    String responseData = response.body().string();
                    parseJSONWithGSON(responseData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //json转换为实体类
    private void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        Nominate2Model model=gson.fromJson(jsonData,Nominate2Model.class);
        nextpageUrl=model.getNextPageUrl();
        List<Nominate2Model.ItemListBeanX> list1=model.getItemList();
        List<Nominate2Model.ItemListBeanX.DataBeanX> list2=new ArrayList<>();
        for (Nominate2Model.ItemListBeanX beanX:list1){
            list2.add(beanX.getData());
        }

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.add(list1,list2);
            }
        });

    }

}
