package com.example.eyepetizer.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.eyepetizer.adapter.FollowAdapter;
import com.example.eyepetizer.databinding.FragmentFollowBinding;
import com.example.eyepetizer.model.FollowModel;
import com.example.eyepetizer.networks.API;
import com.example.eyepetizer.util.HttpUtil;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;
import okhttp3.Response;

public class FollowFragment extends Fragment {

    private FragmentFollowBinding binding;
    private static String TAG="_____________________FOLLOW";
    private FollowAdapter adapter;
    private List<FollowModel.ItemListBean.DataBeanX> dataBeanXList=new ArrayList<>();
    private String nextPageUrl;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFollowBinding.inflate(getLayoutInflater());
        downLoad(API.FOLLOW);
        initview();
        binding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                downLoad(nextPageUrl);
                binding.refreshLayout.finishLoadMore(1000);
            }
        });
        return binding.getRoot();
    }

    private void initview(){
        binding.rvFollow.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter=new FollowAdapter(dataBeanXList);
        binding.rvFollow.setAdapter(adapter);
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
        FollowModel followModel=gson.fromJson(jsonData,FollowModel.class);
        nextPageUrl=followModel.getNextPageUrl();
        List<FollowModel.ItemListBean> list1=new ArrayList<>();
        List<FollowModel.ItemListBean.DataBeanX> list2=new ArrayList<>();
        list1=followModel.getItemList();
        for(FollowModel.ItemListBean bean:list1){
            list2.add(bean.getData());
        }

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter.add(list2);
            }
        });


    }
}
