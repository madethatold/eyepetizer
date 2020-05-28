package com.example.eyepetizer.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.eyepetizer.activity.WebDetailActivity;
import com.example.eyepetizer.databinding.ItemCategoryItemCardBinding;
import com.example.eyepetizer.model.FindMoreModel;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CardViewHolder> {

    private List<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean> beans;
    private Context context;

    public CategoryAdapter(List<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean> beans){
        this.beans=beans;
    }

    class CardViewHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        private ImageView img;
        public CardViewHolder(ItemCategoryItemCardBinding itemView){
            super(itemView.getRoot());
            tv=itemView.tvLabel;
            img=itemView.ivCategoryBg;
        }
    }

    @NonNull
    @Override
    public CategoryAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (context == null) {
            context = parent.getContext();
        }
        return new CardViewHolder(ItemCategoryItemCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.CardViewHolder holder, int position) {
        holder.tv.setText(beans.get(position).getData().getTitle());

        RequestOptions options = new RequestOptions().bitmapTransform(new RoundedCorners(30));
        Glide.with(context).load(beans.get(position).getData().getImage()).apply(options).into(holder.img);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String actionUrl=beans.get(position).getData().getActionUrl();
                int index1=actionUrl.indexOf("tag/")+4;
                int index2=actionUrl.indexOf("/?title");
                String id=actionUrl.substring(index1,index2);
                String url="https://www.eyepetizer.net/tag.html?tid="+id;
                Bundle bundle = new Bundle();
                bundle.putString("URL",url);
                Intent intent = new Intent(context, WebDetailActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return beans.size();
    }
}
