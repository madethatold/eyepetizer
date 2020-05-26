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

import com.example.eyepetizer.adapter.FindMoreAdapter;
import com.example.eyepetizer.databinding.FragmentDiscoverBinding;
import com.example.eyepetizer.model.FindMoreModel;
import com.example.eyepetizer.networks.API;
import com.example.eyepetizer.util.ToastUtil;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DiscoverFragment extends Fragment {

    private static String TAG="_______________________Discover";
    private FragmentDiscoverBinding binding;
    private List<FindMoreModel.ItemListBeanX> itemListBeanXList=new ArrayList<>();
    private List<FindMoreModel.ItemListBeanX.DataBeanX> dataBeanXList=new ArrayList<>();

    private FindMoreAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=FragmentDiscoverBinding.inflate(getLayoutInflater());
        downLoad(API.DISCOVER);
        binding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                ToastUtil.showMsg(getContext(),"test");
            }
        });
        binding.refreshLayout.setEnableLoadMore(false);
        return binding.getRoot();
    }

    private void initview(){


        //为recyclerView设置Adapter
        binding.rvFindMore.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        adapter=new FindMoreAdapter(itemListBeanXList,dataBeanXList);
        binding.rvFindMore.setAdapter(adapter);
        Log.d(TAG, "initview: "+itemListBeanXList.size()+"     "+dataBeanXList.size());
    }

    //网络请求
    private void  downLoad(final String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    OkHttpClient client=new OkHttpClient();
                    Request request=new Request.Builder()
                            .url(url)
                            .build();
                    Response response=client.newCall(request).execute();
                    String responseData=response.body().string();
                    parseJSONWithGSON(responseData);
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            initview();
                        }
                    });
                    adapter.notifyDataSetChanged();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //json转换为实体类
    private void parseJSONWithGSON(String jsonData){
        Gson gson=new Gson();
        FindMoreModel findMoreModel=gson.fromJson(jsonData,FindMoreModel.class);
        //list初始化
        itemListBeanXList=findMoreModel.getItemList();
        for (int i=0;i<itemListBeanXList.size();i++){
            if (itemListBeanXList.get(i).getType().equals("textCard")){
                if (itemListBeanXList.get(i).getData().getText().equals("查看全部分类")){
                    itemListBeanXList.remove(i);
                }
            }
        }
        //dataBeanList初始化
        for (FindMoreModel.ItemListBeanX itemListBeanX:itemListBeanXList){
            dataBeanXList.add(itemListBeanX.getData());
        }
        Log.d(TAG, "parseJSONWithGSON: "+dataBeanXList.get(0).getDataType());
    }
}