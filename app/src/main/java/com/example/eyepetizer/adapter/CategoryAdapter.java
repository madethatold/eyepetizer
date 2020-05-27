package com.example.eyepetizer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
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
    }

    @Override
    public int getItemCount() {
        return beans.size();
    }
}
