package com.example.eyepetizer.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.activity.VideoDetailActivity;
import com.example.eyepetizer.databinding.DailyListViewItemBinding;
import com.example.eyepetizer.databinding.ItemCardViewBinding;
import com.example.eyepetizer.databinding.ItemTitleTagBinding;
import com.example.eyepetizer.model.NominateModel;

import java.util.List;

public class NominateAdapter extends RecyclerView.Adapter {
    private static String TAG="------";
    private static int TITLE=0;
    private static int FOLLOW=1;
    private static int VIDEO=2;

    private Context context;

    private List<NominateModel.ItemListBean> itemEntityList;
    private List<NominateModel.ItemListBean.DataBean> dataEntityList;
    private String video;
    private String blurred;
    private int id;

    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;

    public NominateAdapter(List<NominateModel.ItemListBean> itemEntityList,List<NominateModel.ItemListBean.DataBean> dataEntityList){
        this.itemEntityList=itemEntityList;
        this.dataEntityList=dataEntityList;
    }

    //可点击title
    static class TitleHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public TitleHolder(@NonNull ItemTitleTagBinding itemView) {
            super(itemView.getRoot());
            tv=itemView.tvTitle;
        }
    }

    //followCard
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

    //videoSmallCard
    static class CardHolder extends RecyclerView.ViewHolder{

        private TextView tvTitle,tvDesc,tvTime;
        private ImageView iv;

        public CardHolder(@NonNull ItemCardViewBinding itemView){
            super(itemView.getRoot());
            tvTitle=itemView.tvVideoTitle;
            tvTime=itemView.tvVideoTime;
            tvDesc=itemView.textView;
            iv=itemView.ivVideoCover;
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }

        DailyListViewItemBinding viewItemBinding=DailyListViewItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemTitleTagBinding titleTagBinding=ItemTitleTagBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemCardViewBinding cardViewBinding=ItemCardViewBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        if (viewType==TITLE){
            return new TitleHolder(titleTagBinding);
        }else if(viewType==FOLLOW){
            return new ViewHolder(viewItemBinding);
        }else {
            return new CardHolder(cardViewBinding);
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        NominateModel.ItemListBean.DataBean bean=dataEntityList.get(position+1);

        if (getItemViewType(position)==TITLE){
            ((TitleHolder)holder).tv.setText(bean.getText());
        }else if(getItemViewType(position)==FOLLOW){
            ((ViewHolder)holder).tvTag.setText(bean.getContent().getData().getDescription());
            ((ViewHolder)holder).tvTitle.setText(bean.getContent().getData().getTitle());
            Glide.with(context).load(bean.getContent().getData().getCover().getDetail()).into(((ViewHolder) holder).img);
            Glide.with(context).load(bean.getHeader().getIcon()).into(((ViewHolder)holder).imgHead);
        }else if(getItemViewType(position)==VIDEO) {

            ((CardHolder)holder).tvTitle.setText(bean.getTitle());
            ((CardHolder)holder).tvDesc.setText(bean.getDescription());

            int minutes = bean.getDuration() / 60;
            int remainingSeconds = bean.getDuration() % 60;
            if (remainingSeconds<10){
                ((CardHolder)holder).tvTime.setText(minutes+":0"+remainingSeconds);
            }else {
                ((CardHolder)holder).tvTime.setText(minutes+":"+remainingSeconds);
            }
            Glide.with(context).load(bean.getCover().getDetail()).into(((CardHolder)holder).iv);

            ((CardHolder)holder).iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video=bean.getPlayUrl();
                    blurred=bean.getCover().getBlurred();
                    id=bean.getId();
                    head=bean.getAuthor().getIcon();
                    name=bean.getAuthor().getName();
                    title=bean.getTitle();
                    desc=bean.getDescription();
                    collect=bean.getConsumption().getCollectionCount();
                    share=bean.getConsumption().getShareCount();

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
        }
    }

    @Override
    public int getItemCount() {
        return itemEntityList.size()-1;
    }

    @Override
    public int getItemViewType(int position) {
        NominateModel.ItemListBean itemListBean=itemEntityList.get(position+1);
        if ("textCard".equals(itemListBean.getType())){
            return TITLE;
        }else if ("followCard".equals(itemListBean.getType())){
            return FOLLOW;
        }else {
            return VIDEO;
        }
    }
}
