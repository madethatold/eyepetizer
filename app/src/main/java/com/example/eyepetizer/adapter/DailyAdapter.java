package com.example.eyepetizer.adapter;

import android.content.Context;
import android.content.Intent;
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

import com.example.eyepetizer.activity.VideoDetailActivity;
import com.example.eyepetizer.databinding.DailyListViewItemBinding;
import com.example.eyepetizer.databinding.ItemTitleBinding;
import com.example.eyepetizer.fragment.DailyFragment;
import com.example.eyepetizer.model.DailyModel;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DailyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String video;
    private String blurred;
    private int id;

    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;


    private static final int TEXT = 0;
    private static final int FOLLOW = 1;
    private static final int VIDEO =2;

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
        }else{
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
                    .into(((ViewHolder)holder).img);
            Glide.with(context)
                    .load(entity.getHeader().getIcon())
                    .into(((ViewHolder)holder).imgHead);

            ((ViewHolder)holder).img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video=entity.getContent().getData().getPlayUrl();
                    blurred=entity.getContent().getData().getCoverBean().getBlurred();
                    id=entity.getContent().getData().getId();
                    head=entity.getHeader().getIcon();
                    name=entity.getHeader().getTitle();
                    title=entity.getContent().getData().getTitle();
                    desc=entity.getContent().getData().getDescription();
                    collect=entity.getContent().getData().getConsumption().getCollectionCount();
                    share=entity.getContent().getData().getConsumption().getShareCount();

                    Intent intent=new Intent(context, VideoDetailActivity.class);
                    intent.putExtra("video",video);
                    intent.putExtra("blurred",blurred);
                    intent.putExtra("id",id);
                    intent.putExtra("head",head);
                    intent.putExtra("name",name);
                    intent.putExtra("title",title);
                    intent.putExtra("description",desc);
                    intent.putExtra("collect",collect);
                    intent.putExtra("share",share);
                    context.startActivity(intent);
                }
            });
        }else if (getItemViewType(position)==VIDEO){
            ((ViewHolder)holder).tvTitle.setText(entity.getHeader().getIssuerName());
            ((ViewHolder)holder).tvTag.setText(entity.getContent().getData().getDescription());
            Glide.with(context)
                    .load(entity.getContent().getData().getCoverBean().getFeed())
                    .into(((ViewHolder)holder).img);
            Glide.with(context)
                    .load(entity.getHeader().getIcon())
                    .into(((ViewHolder)holder).imgHead);


        }


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
        } else if("followCard".equals(entity.getType())){
            return FOLLOW;
        }else{
            return VIDEO;
        }
    }
}
