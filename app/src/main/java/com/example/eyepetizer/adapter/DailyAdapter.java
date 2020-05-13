package com.example.eyepetizer.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.eyepetizer.R;
import com.example.eyepetizer.activity.MainActivity;

import com.example.eyepetizer.databinding.DailyListViewItemBinding;
import com.example.eyepetizer.databinding.ItemTitleBinding;
import com.example.eyepetizer.fragment.DailyFragment;
import com.example.eyepetizer.model.DailyModel;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DailyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private static final int TEXT = 0;
    private static final int FOLLOW = 1;

    private Context context;
    private List<DailyModel.itemEntity> itemEntityList;
    private List<DailyModel.itemEntity.DataEntity> dataEntityList;

    static class TextHolder extends RecyclerView.ViewHolder{
        private TextView tv;

        public TextHolder(@NonNull ItemTitleBinding itemView) {
            super(itemView.getRoot());
            tv=itemView.tvTitle;
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle,tvTag;
        private ImageView img;
        private ImageView imgHead;
        private LinearLayout llInfo;

        public ViewHolder(@NonNull DailyListViewItemBinding itemView) {
            super(itemView.getRoot());
            tvTitle=itemView.tvTitle;
            tvTag=itemView.tvDescription;
            img=itemView.ivVideoCover;
            imgHead=itemView.ivAuthor;
            llInfo=itemView.linearLayout;
        }
    }

    //供外部使用的构造器
    public DailyAdapter(List<DailyModel.itemEntity> itemEntityList,List<DailyModel.itemEntity.DataEntity> dataEntityList){
        this.itemEntityList=itemEntityList;
        this.dataEntityList=dataEntityList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }

        ItemTitleBinding textItemBinding=ItemTitleBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        DailyListViewItemBinding viewItemBinding=DailyListViewItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        if (viewType==TEXT){
            return new TextHolder(textItemBinding);
        }else {
            return new ViewHolder(viewItemBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        DailyModel.itemEntity.DataEntity entity = dataEntityList.get(position);

        if(getItemViewType(position)==TEXT){
            ((TextHolder)holder).tv.setText(entity.getText());
        }else if (getItemViewType(position)==FOLLOW){

            ((ViewHolder)holder).tvTitle.setText(entity.getContent().getData().getTitle());
            ((ViewHolder)holder).tvTag.setText(entity.getHeader().getTitle()+" /#"+entity.getContent().getData().getCategory());


            Glide.with(context)
                    .load(entity.getContent().getData().getCoverBean().getFeed())
//                    .placeholder(R.drawable.loading)
//                    .error(R.drawable.loading)
//                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((ViewHolder)holder).img);
            Glide.with(context)
                    .load(entity.getHeader().getIcon())
//                    .placeholder(R.drawable.loading)
//                    .error(R.drawable.loading)
//                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(((ViewHolder)holder).imgHead);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            //item的点击事件
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return itemEntityList.size();
    }

    @Override
    public int getItemViewType(int position) {
        DailyModel.itemEntity entity = itemEntityList.get(position);
        if ("textCard".equals(entity.getType())) {
            return TEXT;
        } else {
            return FOLLOW;
        }
    }
}
