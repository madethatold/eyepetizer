package com.example.eyepetizer.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.model.FindMoreModel;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

public class MyBannerAdapter extends BannerAdapter<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean, MyBannerAdapter.BannerViewHolder> {

    private Context context;

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
    }

    class BannerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public BannerViewHolder(@NonNull ImageView view) {
            super(view);
            this.imageView = view;
        }
    }
}
