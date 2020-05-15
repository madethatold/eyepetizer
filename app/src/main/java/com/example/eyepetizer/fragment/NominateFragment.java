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

import com.example.eyepetizer.adapter.NominateAdapter;
import com.example.eyepetizer.databinding.FragmentNominateBinding;
import com.example.eyepetizer.model.NominateModel;
import com.example.eyepetizer.networks.API;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NominateFragment extends Fragment {
    private static String TAG="!!!!!!!!!!!!!!!!!!!!!!!";
    private FragmentNominateBinding binding;
    private String nextUrl;

    private List<NominateModel.ItemEntity> itemEntityList;
    private List<NominateModel.ItemEntity.DataEntity> dataEntityList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=FragmentNominateBinding.inflate(getLayoutInflater());
        initview();
//        downLoad(API.NOMINATE);
        Log.d(TAG, "onCreateView: "+API.NOMINATE);
        return binding.getRoot();
    }

    private void initview(){
        binding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
//                downLoad(nextUrl);
            }
        });

        //为recyclerView设置Adapter
        binding.rvNominate.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
//        NominateAdapter adapter=new NominateAdapter(itemEntities,dataList);
//        binding.rvNominate.setAdapter(adapter);
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
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //json转换为实体类
    private void parseJSONWithGSON(String jsonData){
        Gson gson=new Gson();
        NominateModel nominateModel=gson.fromJson(jsonData,NominateModel.class);
        nextUrl=nominateModel.getNextPageUrl();
        Log.d(TAG, "parseJSONWithGSON: "+nextUrl);
//        //list初始化
//        itemEntityList=nominateModel.getLists();
//
//        for (NominateModel.ItemEntity itemEntity: itemEntityList){
//            dataEntityList.add(itemEntity.getDataEntity());
//        }
//
//        Log.d(TAG, "parseJSONWithGSON: "+itemEntityList.get(0).getType());

    }
}
