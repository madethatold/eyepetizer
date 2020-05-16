package com.example.eyepetizer.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.MediaController;

import com.example.eyepetizer.R;
import com.example.eyepetizer.adapter.VideoDetailAdapter;
import com.example.eyepetizer.databinding.ActivityVideoDetailBinding;
import com.example.eyepetizer.model.CommentModel;
import com.example.eyepetizer.model.VideoRalatedModel;
import com.example.eyepetizer.networks.API;
import com.google.gson.Gson;

import org.w3c.dom.Comment;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class VideoDetailActivity extends AppCompatActivity {
    private static String TAG="oooooooooooooooooooVideoDetail";

    private ActivityVideoDetailBinding binding;
    List<CommentModel.ItemListBean> commentList=new ArrayList<>();
    List<CommentModel.ItemListBean.DataBean> commentDataList=new ArrayList<>();
    List<VideoRalatedModel.ItemListBean> videoList=new ArrayList<>();
    List<VideoRalatedModel.ItemListBean.DataBean> videoDataList=new ArrayList<>();

    private String video;
    private String blurred;
    private int id;

    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityVideoDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        receive();
        String commentAPI=API.COMMENT+id+"";
        String videoAPI=API.RELATED+id+"";
        downLoad(videoAPI,commentAPI);
        initview();
        

    }

    private void initview(){
        binding.rvList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        VideoDetailAdapter adapter=new VideoDetailAdapter(videoDataList,commentDataList,head,title,desc,name,collect,share);
        binding.rvList.setAdapter(adapter);
        Log.d(TAG, "initview: "+videoDataList.size()+"  "+commentDataList.size());

        binding.videoView.setVideoPath(video);
        binding.videoView.setMediaController(new MediaController(this));
        binding.videoView.requestFocus();
        binding.videoView.start();

    }

    private void receive(){
        head=getIntent().getStringExtra("head");
        title=getIntent().getStringExtra("title");
        name=getIntent().getStringExtra("name");
        desc=getIntent().getStringExtra("description");
        video=getIntent().getStringExtra("video");
        blurred=getIntent().getStringExtra("blurred");

        id=getIntent().getIntExtra("id",0);
        collect=getIntent().getIntExtra("collect",0);
        share=getIntent().getIntExtra("share",0);

        Log.d("00000",video);
        Log.d("00000", blurred);
        Log.d("00000", id+"");
        Log.d("00000", head);
        Log.d("00000", name);
        Log.d("00000", title);
        Log.d("00000", desc);
        Log.d("00000", collect+"");
        Log.d("00000", share+"");
    }

    //网络请求
    private void  downLoad(String url1,String url2) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    OkHttpClient client=new OkHttpClient();
                    Request request1=new Request.Builder()
                            .url(url1)
                            .build();
                    Request request2=new Request.Builder()
                            .url(url2)
                            .build();
                    Response response1=client.newCall(request1).execute();
                    Response response2=client.newCall(request2).execute();
                    String responseData1=response1.body().string();
                    String responseData2=response2.body().string();
                    parseJSONWithGSON(responseData1,responseData2);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    //json转换为实体类
    private void parseJSONWithGSON(String jsonData1,String jsonData2){

        Gson gson=new Gson();

        VideoRalatedModel videoRalatedModel=gson.fromJson(jsonData1,VideoRalatedModel.class);
        videoList=videoRalatedModel.getItemList();

        for (VideoRalatedModel.ItemListBean bean : videoList){
            videoDataList.add(bean.getData());
        }

        CommentModel commentModel=gson.fromJson(jsonData2,CommentModel.class);
        commentList=commentModel.getItemList();
        for (CommentModel.ItemListBean bean:commentList){
            commentDataList.add(bean.getData());
        }

        Log.d(TAG, "parseJSONWithGSON: "+commentDataList.size()+"   "+videoDataList.size());
    }

}
