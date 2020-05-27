package com.example.eyepetizer.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.eyepetizer.activity.VideoDetailActivity;
import com.example.eyepetizer.databinding.ItemFollowCardViewBinding;
import com.example.eyepetizer.model.FollowModel;
import com.example.eyepetizer.util.DateUtil;

import java.util.List;

public class FollowAdapter extends RecyclerView.Adapter {
    private List<FollowModel.ItemListBean.DataBeanX> dataBeanXList;
    private Context context;

    private String video;
    private String blurred;
    private int id;
    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;

    public FollowAdapter(List<FollowModel.ItemListBean.DataBeanX> dataBeanXList){
        this.dataBeanXList=dataBeanXList;
    }

    static class ItemCardHolder extends RecyclerView.ViewHolder{

        private TextView tvName,tvReleaseTime,tvDescription,tvCollect,tvReply,tvStar;
        private ImageView imgHead,img,imgShare;
        public ItemCardHolder(@NonNull ItemFollowCardViewBinding itemView) {
            super(itemView.getRoot());
            tvName=itemView.tvIssuerName;
            tvDescription=itemView.tvDescription;
            tvReleaseTime=itemView.tvReleaseTime;
            tvCollect=itemView.tvCollectionCount;
            tvStar=itemView.tvStarCount;
            tvReply=itemView.tvReplyCount;
            img=itemView.videoItemPlayer;
            imgHead=itemView.ivAvatar;
            imgShare=itemView.ivShare;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }

        ItemFollowCardViewBinding binding=ItemFollowCardViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemCardHolder(binding);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FollowModel.ItemListBean.DataBeanX bean=dataBeanXList.get(position);
        ((ItemCardHolder)holder).tvName.setText(bean.getHeader().getIssuerName());
        ((ItemCardHolder)holder).tvReleaseTime.setText(DateUtil.getDateToString(bean.getContent().getData().getReleaseTime())+"发布 ");
        ((ItemCardHolder)holder).tvCollect.setText(bean.getContent().getData().getConsumption().getCollectionCount()+"");
        ((ItemCardHolder)holder).tvReply.setText(bean.getContent().getData().getConsumption().getReplyCount()+"");
        ((ItemCardHolder)holder).tvDescription.setText(bean.getContent().getData().getDescription());
        Glide.with(context).load(bean.getContent().getData().getCover().getFeed()).into(((ItemCardHolder)holder).img);
        Glide.with(context).load(bean.getHeader().getIcon()).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((ItemCardHolder)holder).imgHead);

        ((ItemCardHolder)holder).img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video=bean.getContent().getData().getPlayUrl();
                blurred=bean.getContent().getData().getCover().getBlurred();
                id=bean.getContent().getData().getId();
                head=bean.getHeader().getIcon();
                name=bean.getHeader().getIssuerName();
                title=bean.getContent().getData().getTitle();
                desc=bean.getContent().getData().getDescription();
                collect=bean.getContent().getData().getConsumption().getCollectionCount();
                share=bean.getContent().getData().getConsumption().getShareCount();

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

    @Override
    public int getItemCount() {
        return dataBeanXList.size();
    }

    //    下面两个方法提供给页面刷新和加载时调用
    public void add(List<FollowModel.ItemListBean.DataBeanX> addList) {
        //增加数据
        int position = dataBeanXList.size();
        dataBeanXList.addAll(position, addList);
        notifyItemInserted(position);
    }

    public void refresh(List<FollowModel.ItemListBean.DataBeanX> newList) {
        //刷新数据
        dataBeanXList.removeAll(dataBeanXList);
        dataBeanXList.addAll(newList);
        notifyDataSetChanged();
    }
}
