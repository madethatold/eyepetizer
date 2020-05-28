package com.example.eyepetizer.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.activity.WebDetailActivity;
import com.example.eyepetizer.model.FindMoreModel;
import com.youth.banner.adapter.BannerAdapter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

public class MyBannerAdapter extends BannerAdapter<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean, MyBannerAdapter.BannerViewHolder> {

    private Context context;

    private static String TAG="----------------------------";
    public MyBannerAdapter(List<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean> datas) {
        super(datas);
    }

    @Override
    public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
        ImageView imageView = new ImageView(parent.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new BannerViewHolder(imageView);
    }


    @Override
    public void onBindView(BannerViewHolder holder, FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean data, int position, int size) {
        Glide.with(context).load(data.getData().getImage()).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String actionUrl=data.getData().getActionUrl();
                String str=actionUrl.substring(0, actionUrl.indexOf("url="));
                String CoderUrl=actionUrl.substring(str.length()+4, actionUrl.length());
                String url=toURLDecoder(CoderUrl);
                Bundle bundle = new Bundle();
                bundle.putString("URL",url);
                Intent intent = new Intent(context, WebDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent,bundle);
            }
        });
    }

    class BannerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public BannerViewHolder(@NonNull ImageView view) {
            super(view);
            this.imageView = view;
        }
    }

    private static String toURLDecoder(String paramString) {
        if (paramString == null || paramString.equals("")) {
            return "";
        }
        try {
            String url = new String(paramString.getBytes(), "UTF-8");
            url = URLDecoder.decode(url, "UTF-8");
            return url;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
