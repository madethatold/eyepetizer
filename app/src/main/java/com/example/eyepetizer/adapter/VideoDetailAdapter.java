package com.example.eyepetizer.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.databinding.ItemDetailCardBinding;
import com.example.eyepetizer.databinding.ItemDetailHeaderBinding;
import com.example.eyepetizer.databinding.ItemReplyBinding;
import com.example.eyepetizer.databinding.ItemTitleBinding;
import com.example.eyepetizer.model.CommentModel;
import com.example.eyepetizer.model.FindMoreModel;
import com.example.eyepetizer.model.VideoRalatedModel;

import java.util.List;

public class VideoDetailAdapter extends RecyclerView.Adapter {

    private List<VideoRalatedModel.ItemListBean.DataBean> videoList;
    private List<CommentModel.ItemListBean.DataBean> commentList;
    private static int HEADER=0;
    private static int TITLE=1;
    private static int VIDEO=2;
    private static int REPLY=3;
    private Context context;

    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;


    public VideoDetailAdapter(List<VideoRalatedModel.ItemListBean.DataBean> list1,List<CommentModel.ItemListBean.DataBean> list2
    ,String head,String title,String desc,String name,int collect,int share){
        this.commentList=list2;
        this.videoList=list1;
        this.head=head;
        this.title=title;
        this.desc=desc;
        this.name=name;
        this.collect=collect;
        this.share=share;
    }


    //标题
    static class TitleHolder extends RecyclerView.ViewHolder{
        private TextView tv;

        public TitleHolder(@NonNull ItemTitleBinding itemView) {
            super(itemView.getRoot());
            tv=itemView.tvTitle;
        }
    }

    //视频
    static class VideoHolder extends RecyclerView.ViewHolder{
        private TextView tvTime,tvTitle,tvDescription;
        private ImageView iv;

        public VideoHolder(@NonNull ItemDetailCardBinding itemView) {
            super(itemView.getRoot());
            tvTitle=itemView.tvVideoTitle;
            tvDescription=itemView.textView;
            tvTime=itemView.tvVideoTime;
            iv=itemView.ivVideoCover;

        }
    }

    //回复
    static class ReplyHolder extends RecyclerView.ViewHolder{
        private TextView tvName,tvMessage,tvTime,tvCount;
        private ImageView ivHeader;

        public ReplyHolder(@NonNull ItemReplyBinding itemView) {
            super(itemView.getRoot());
            tvName=itemView.tvUserName;
            tvCount=itemView.tvLikeCount;
            tvMessage=itemView.tvUserMessage;
            tvTime=itemView.tvUserReleaseTime;
            ivHeader=itemView.ivUserAvatar;
        }
    }

    //HEADER
    static class HeaderHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle,tvDescription,tvCollection,tvShare,tvLoad,tvStar,tvName;
        private ImageView imgHead;
        public HeaderHolder(@NonNull ItemDetailHeaderBinding itemView) {
            super(itemView.getRoot());
            tvCollection=itemView.tvCollectionCount;
            tvDescription=itemView.tvDescription;
            tvLoad=itemView.tvDownload;
            tvName=itemView.tvName;
            tvShare=itemView.tvShareCount;
            tvStar=itemView.ivStar;
            tvTitle=itemView.tvVideoTitle;
            imgHead=itemView.ivAuthor;

        }
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }

        ItemDetailHeaderBinding headerBinding=ItemDetailHeaderBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemReplyBinding replyBinding=ItemReplyBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemDetailCardBinding cardBinding=ItemDetailCardBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemTitleBinding titleBinding=ItemTitleBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        if (viewType==HEADER){
            return new HeaderHolder(headerBinding);
        }else if(viewType==VIDEO){
            return new VideoHolder(cardBinding);
        }else if(viewType==REPLY){
            return new ReplyHolder(replyBinding);
        }else {
            return new TitleHolder(titleBinding);
        }

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VideoRalatedModel.ItemListBean.DataBean dataVBean=videoList.get(position-1);
        CommentModel.ItemListBean.DataBean dataCBean=commentList.get(position-1-videoList.size());
        if (getItemViewType(position)==TITLE){
            if(position>videoList.size()+1){
                ((TitleHolder)holder).tv.setText(dataCBean.getText());
            }else {
                ((TitleHolder)holder).tv.setText(dataVBean.getText());
            }
        }else if(getItemViewType(position)==VIDEO){
            ((VideoHolder)holder).tvTitle.setText(dataVBean.getTitle());
            ((VideoHolder)holder).tvDescription.setText(dataVBean.getDescription());
            int minutes = dataVBean.getDuration() / 60;
            int remainingSeconds = dataVBean.getDuration() % 60;
            ((VideoHolder)holder).tvTime.setText(minutes+":"+remainingSeconds);
            Glide.with(context).load(dataVBean.getCover().getFeed()).into(((VideoHolder)holder).iv);

        }else if(getItemViewType(position)==REPLY){
            ((ReplyHolder)holder).tvTime.setText(dataCBean.getCreateTime()+"");
            ((ReplyHolder)holder).tvMessage.setText(dataCBean.getMessage());
            ((ReplyHolder)holder).tvName.setText(dataCBean.getUser().getNickname());
            ((ReplyHolder)holder).tvCount.setText(dataCBean.getLikeCount());
            Glide.with(context).load(dataCBean.getUser().getAvatar()).into(((ReplyHolder)holder).ivHeader);
        }else {
            ((HeaderHolder)holder).tvTitle.setText(title);
            ((HeaderHolder)holder).tvDescription.setText(desc);
            ((HeaderHolder)holder).tvShare.setText(share);
            ((HeaderHolder)holder).tvCollection.setText(collect);
            ((HeaderHolder)holder).tvName.setText(name);
            Glide.with(context).load(head).into(((HeaderHolder)holder).imgHead);

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return HEADER;
        }else if (videoList.get(position-1).getDataType().equals("VideoBeanForClient")){
            return VIDEO;
        }else if (commentList.get((position-1-videoList.size())).getDataType().equals("ReplyBeanForClient")){
            return REPLY;
        }else {
            return TITLE;
        }
    }

    @Override
    public int getItemCount() {
        return commentList.size()+videoList.size()+1;
    }
}
