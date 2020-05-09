package com.example.eyepetizer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eyepetizer.databinding.DailyListTextItemBinding;
import com.example.eyepetizer.databinding.DailyListViewItemBinding;
import com.example.eyepetizer.model.DailyModel;

import java.util.List;

public class DailyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<DailyModel.itemEntity> mList;

    static class TextHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public TextHolder(@NonNull DailyListTextItemBinding itemView) {
            super(itemView.getRoot());
        }
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle,tvTime;
        private ImageView img;

        public ViewHolder(@NonNull DailyListViewItemBinding itemView) {
            super(itemView.getRoot());
        }
    }

    public DailyAdapter(List<DailyModel.itemEntity> list){
        this.mList=list;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DailyListTextItemBinding textItemBinding=DailyListTextItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        DailyListViewItemBinding viewItemBinding=DailyListViewItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        if (viewType==1){
            return new TextHolder(textItemBinding);
        }else{
            return new ViewHolder(viewItemBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        DailyModel.itemEntity entity = mList.get(position);
        if ("textCard".equals(entity.getType())) {
            return 1;
        } else {
            return 0;
        }
    }
}
