package com.example.eyepetizer.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.eyepetizer.activity.VideoDetailActivity;
import com.example.eyepetizer.databinding.ItemDetailCardBinding;
import com.example.eyepetizer.databinding.ItemDetailHeaderBinding;
import com.example.eyepetizer.databinding.ItemTitleBinding;
import com.example.eyepetizer.model.VideoRalatedModel;

import java.util.List;

public class VideoDetailAdapter extends RecyclerView.Adapter {
    private List<VideoRalatedModel.ItemListBean.DataBean> videoList;
    private static int HEADER = 0;
    private static int TITLE = 1;
    private static int VIDEO = 2;
    private Context context;

    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;

    private String video;
    private String blurred;
    private int id;


    public VideoDetailAdapter(List<VideoRalatedModel.ItemListBean.DataBean> list1
            , String head, String title, String desc, String name, int collect, int share) {
        this.videoList = list1;
        this.head = head;
        this.title = title;
        this.desc = desc;
        this.name = name;
        this.collect = collect;
        this.share = share;
    }


    //标题
    static class TitleHolder extends RecyclerView.ViewHolder {
        private TextView tv;

        public TitleHolder(@NonNull ItemTitleBinding itemView) {
            super(itemView.getRoot());
            tv = itemView.tvTitle;
        }
    }

    //视频
    static class VideoHolder extends RecyclerView.ViewHolder {
        private TextView tvTime, tvTitle, tvDescription;
        private ImageView iv;

        public VideoHolder(@NonNull ItemDetailCardBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvVideoTitle;
            tvDescription = itemView.textView;
            tvTime = itemView.tvVideoTime;
            iv = itemView.ivVideoCover;

        }
    }

    //回复
//    static class ReplyHolder extends RecyclerView.ViewHolder{
//        private TextView tvName,tvMessage,tvTime,tvCount;
//        private ImageView ivHeader;
//
//        public ReplyHolder(@NonNull ItemReplyBinding itemView) {
//            super(itemView.getRoot());
//            tvName=itemView.tvUserName;
//            tvCount=itemView.tvLikeCount;
//            tvMessage=itemView.tvUserMessage;
//            tvTime=itemView.tvUserReleaseTime;
//            ivHeader=itemView.ivUserAvatar;
//        }
//    }

    //HEADER
    static class HeaderHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvDescription, tvCollection, tvShare, tvLoad, tvStar, tvName;
        private ImageView imgHead;

        public HeaderHolder(@NonNull ItemDetailHeaderBinding itemView) {
            super(itemView.getRoot());
            tvCollection = itemView.tvCollectionCount;
            tvDescription = itemView.tvDescription;
            tvLoad = itemView.tvDownload;
            tvName = itemView.tvNikeName;
            tvShare = itemView.tvShareCount;
            tvStar = itemView.ivStar;
            tvTitle = itemView.tvVideoTitle;
            imgHead = itemView.ivAuthor;

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }

        ItemDetailHeaderBinding headerBinding = ItemDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemDetailCardBinding cardBinding = ItemDetailCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemTitleBinding titleBinding = ItemTitleBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        if (viewType == HEADER) {
            return new HeaderHolder(headerBinding);
        } else if (viewType == VIDEO) {
            return new VideoHolder(cardBinding);
        } else {
            return new TitleHolder(titleBinding);
        }

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            ((HeaderHolder) holder).tvTitle.setText(title);
            ((HeaderHolder) holder).tvDescription.setText(desc);

            //淡入淡出动画
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
            alphaAnimation.setDuration(3000);
            animationSet.addAnimation(alphaAnimation);
            ((HeaderHolder) holder).tvDescription.startAnimation(animationSet);
            ((HeaderHolder) holder).tvTitle.startAnimation(animationSet);

            ((HeaderHolder) holder).tvShare.setText(share + "");
            ((HeaderHolder) holder).tvCollection.setText(collect + "");
            ((HeaderHolder) holder).tvName.setText(name);
            Glide.with(context).load(head).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((HeaderHolder) holder).imgHead);
        }
        if (position > 0) {
            VideoRalatedModel.ItemListBean.DataBean dataVBean = videoList.get(position - 1);
            if (getItemViewType(position) == TITLE) {
                ((TitleHolder) holder).tv.setText(dataVBean.getText());
            } else {
                ((VideoHolder) holder).tvTitle.setText(dataVBean.getTitle());
                ((VideoHolder) holder).tvDescription.setText("#" + dataVBean.getCategory());
                int minutes = dataVBean.getDuration() / 60;
                int remainingSeconds = dataVBean.getDuration() % 60;
                if (remainingSeconds < 10) {
                    ((VideoHolder) holder).tvTime.setText(minutes + ":0" + remainingSeconds);
                } else {
                    ((VideoHolder) holder).tvTime.setText(minutes + ":" + remainingSeconds);
                }
                Glide.with(context).load(dataVBean.getCover().getFeed()).into(((VideoHolder) holder).iv);
                ((VideoHolder) holder).iv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        video = dataVBean.getPlayUrl();
                        blurred = dataVBean.getCover().getBlurred();
                        id = dataVBean.getId();
                        head = dataVBean.getAuthor().getIcon();
                        name = dataVBean.getAuthor().getName();
                        title = dataVBean.getTitle();
                        desc = dataVBean.getDescription();
                        collect = dataVBean.getConsumption().getCollectionCount();
                        share = dataVBean.getConsumption().getShareCount();

                        Intent intent = new Intent(context, VideoDetailActivity.class);
                        intent.putExtra("video", video);
                        intent.putExtra("blurred", blurred);
                        intent.putExtra("id", id);
                        intent.putExtra("head", head);
                        intent.putExtra("name", name);
                        intent.putExtra("title", title);
                        intent.putExtra("description", desc);
                        intent.putExtra("collect", collect);
                        intent.putExtra("share", share);

                        context.startActivity(intent);
                    }
                });

            }
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HEADER;
        } else {
            if (videoList.get(position - 1).getDataType().equals("VideoBeanForClient")) {
                return VIDEO;
            } else {
                return TITLE;
            }
        }


    }

    @Override
    public int getItemCount() {
        return videoList.size() + 1;
    }
}
