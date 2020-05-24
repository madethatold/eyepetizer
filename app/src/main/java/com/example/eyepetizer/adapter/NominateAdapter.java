package com.example.eyepetizer.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.eyepetizer.activity.VideoDetailActivity;
import com.example.eyepetizer.databinding.DailyListViewItemBinding;
import com.example.eyepetizer.databinding.ItemBanner2ViewBinding;
import com.example.eyepetizer.databinding.ItemCardViewBinding;
import com.example.eyepetizer.databinding.ItemSquareViewBinding;
import com.example.eyepetizer.databinding.ItemTitleTagBinding;
import com.example.eyepetizer.model.NominateModel;

import java.util.List;

public class NominateAdapter extends RecyclerView.Adapter {
    private static int TITLE = 0;
    private static int FOLLOW = 1;
    private static int VIDEO = 2;
    private static int SQUARE = 3;
    private static int BANNER2 = 4;


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

    public NominateAdapter(List<NominateModel.ItemListBean> itemEntityList, List<NominateModel.ItemListBean.DataBean> dataEntityList) {
        this.itemEntityList = itemEntityList;
        this.dataEntityList = dataEntityList;
    }

    //可点击title
    static class TitleHolder extends RecyclerView.ViewHolder {
        private TextView tv;

        public TitleHolder(@NonNull ItemTitleTagBinding itemView) {
            super(itemView.getRoot());
            tv = itemView.tvTitle;
        }
    }

    //followCard
    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvTag, tvTime;
        private ImageView img;
        private ImageView imgHead;
        private LinearLayout llInfo;

        public ViewHolder(@NonNull DailyListViewItemBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvTitle;
            tvTag = itemView.tvDescription;
            img = itemView.ivVideoCover;
            imgHead = itemView.ivAuthor;
            llInfo = itemView.linearLayout;
            tvTime = itemView.tvVideoTime;
        }
    }

    //videoSmallCard
    static class CardHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle, tvDesc, tvTime;
        private ImageView iv;

        public CardHolder(@NonNull ItemCardViewBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvVideoTitle;
            tvTime = itemView.tvVideoTime;
            tvDesc = itemView.textView;
            iv = itemView.ivVideoCover;
        }
    }

    //banner2
    static class Banner2Holder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvTag;
        private ImageView img;
        private ImageView imgHead;
        private LinearLayout llInfo;

        public Banner2Holder(@NonNull ItemBanner2ViewBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvTitle;
            tvTag = itemView.tvDescription;
            img = itemView.ivVideoCover;
            imgHead = itemView.ivAuthor;
            llInfo = itemView.linearLayout;
        }
    }

    //square
    static class SquareHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle1, tvTag1,tvTime1,tvTitle2,tvTag2,tvTime2,tvTitle,tvActionTitle;
        private ImageView img1,img2;
        private ImageView imgHead1,imgHead2;

        public SquareHolder(@NonNull ItemSquareViewBinding itemView) {
            super(itemView.getRoot());
            tvTitle=itemView.tvTitle;
            tvActionTitle=itemView.tvActionTitle;
            tvTitle1=itemView.tvTitle1;
            tvTitle2=itemView.tvTitle2;
            tvTime1=itemView.tvVideoTime;
            tvTime2=itemView.tvVideoTime2;
            tvTag1=itemView.tvDescription;
            tvTag2=itemView.tvDescription2;
            img1=itemView.ivVideoCover;
            img2=itemView.ivVideoCover2;
            imgHead1=itemView.ivAuthor;
            imgHead2=itemView.ivAuthor2;
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }

        DailyListViewItemBinding viewItemBinding = DailyListViewItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemTitleTagBinding titleTagBinding = ItemTitleTagBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemCardViewBinding cardViewBinding = ItemCardViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemBanner2ViewBinding banner2Binding=ItemBanner2ViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemSquareViewBinding squareBinding=ItemSquareViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        if (viewType == TITLE) {
            return new TitleHolder(titleTagBinding);
        } else if (viewType == FOLLOW) {
            return new ViewHolder(viewItemBinding);
        } else if (viewType==VIDEO){
            return new CardHolder(cardViewBinding);
        } else if (viewType==SQUARE){
            return new SquareHolder(squareBinding);
        }else {
            return new Banner2Holder(banner2Binding);
        }

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        NominateModel.ItemListBean.DataBean bean = dataEntityList.get(position);

        if (getItemViewType(position) == TITLE) {

            ((TitleHolder) holder).tv.setText(bean.getText());

        } else if (getItemViewType(position) == FOLLOW) {

            ((ViewHolder) holder).tvTag.setText(bean.getContent().getData().getDescription());
            ((ViewHolder) holder).tvTitle.setText(bean.getContent().getData().getTitle());
            int minutes = bean.getContent().getData().getDuration() / 60;
            int remainingSeconds = bean.getContent().getData().getDuration() % 60;
            if (remainingSeconds < 10) {
                ((ViewHolder) holder).tvTime.setText(minutes + ":0" + remainingSeconds);
            } else {
                ((ViewHolder) holder).tvTime.setText(minutes + ":" + remainingSeconds);
            }

            Glide.with(context).load(bean.getContent().getData().getCover().getDetail()).into(((ViewHolder) holder).img);
            Glide.with(context).load(bean.getHeader().getIcon()).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((ViewHolder) holder).imgHead);
            ((ViewHolder) holder).img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video = bean.getContent().getData().getPlayUrl();
                    blurred = bean.getContent().getData().getCover().getBlurred();
                    id = bean.getContent().getData().getId();
                    head = bean.getHeader().getIcon();
                    name = bean.getHeader().getTitle();
                    title = bean.getContent().getData().getTitle();
                    collect = bean.getContent().getData().getConsumption().getCollectionCount();
                    share = bean.getContent().getData().getConsumption().getShareCount();
                    desc = bean.getContent().getData().getDescription();

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

        } else if (getItemViewType(position) == VIDEO) {

            ((CardHolder) holder).tvTitle.setText(bean.getTitle());
            ((CardHolder) holder).tvDesc.setText(bean.getDescription());
            int minutes = bean.getDuration() / 60;
            int remainingSeconds = bean.getDuration() % 60;
            if (remainingSeconds < 10) {
                ((CardHolder) holder).tvTime.setText(minutes + ":0" + remainingSeconds);
            } else {
                ((CardHolder) holder).tvTime.setText(minutes + ":" + remainingSeconds);
            }
            Glide.with(context).load(bean.getCover().getFeed()).into(((CardHolder) holder).iv);


            ((CardHolder) holder).iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video = bean.getPlayUrl();
                    blurred = bean.getCover().getBlurred();
                    id = bean.getId();
                    head = bean.getAuthor().getIcon();
                    name = bean.getAuthor().getName();
                    title = bean.getTitle();
                    desc = bean.getDescription();
                    collect = bean.getConsumption().getCollectionCount();
                    share = bean.getConsumption().getShareCount();

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
        }else if (getItemViewType(position)==SQUARE){
            List<NominateModel.ItemListBean.DataBean.ItemListBeanx> list=bean.getItemList();
            NominateModel.ItemListBean.DataBean.ItemListBeanx.DataBeanX bean1=list.get(0).getData();
            NominateModel.ItemListBean.DataBean.ItemListBeanx.DataBeanX bean2=list.get(1).getData();

            ((SquareHolder)holder).tvTitle.setText(bean.getHeader().getTitle());
            ((SquareHolder)holder).tvTitle1.setText(bean1.getContent().getData().getTitle());
            ((SquareHolder)holder).tvTag1.setText("#"+bean1.getContent().getData().getCategory());
            int minutes = bean1.getContent().getData().getDuration() / 60;
            int remainingSeconds = bean1.getContent().getData().getDuration() % 60;
            if (remainingSeconds < 10) {
                ((SquareHolder)holder).tvTime1.setText(minutes + ":0" + remainingSeconds);
            } else {
                ((SquareHolder)holder).tvTime1.setText(minutes + ":" + remainingSeconds);
            }

            Glide.with(context).load(bean1.getContent().getData().getCover().getFeed()).into(((SquareHolder)holder).img1);
            Glide.with(context).load(bean1.getHeader().getIcon()).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((SquareHolder)holder).imgHead1);

            ((SquareHolder)holder).tvTitle2.setText(bean2.getContent().getData().getTitle());
            ((SquareHolder)holder).tvTag2.setText("#"+bean2.getContent().getData().getCategory());
            int minutes2 = bean2.getContent().getData().getDuration() / 60;
            int remainingSeconds2 = bean2.getContent().getData().getDuration() % 60;
            if (remainingSeconds2 < 10) {
                ((SquareHolder)holder).tvTime2.setText(minutes2 + ":0" + remainingSeconds2);
            } else {
                ((SquareHolder)holder).tvTime2.setText(minutes2 + ":" + remainingSeconds2);
            }

            Glide.with(context).load(bean2.getContent().getData().getCover().getFeed()).into(((SquareHolder)holder).img2);
            Glide.with(context).load(bean2.getHeader().getIcon()).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((SquareHolder)holder).imgHead2);
            ((SquareHolder)holder).img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video = bean1.getContent().getData().getPlayUrl();
                    blurred = bean1.getContent().getData().getCover().getBlurred();
                    id = bean1.getContent().getData().getId();
                    head = bean1.getHeader().getIcon();
                    name = bean.getHeader().getTitle();
                    title = bean1.getContent().getData().getTitle();
                    desc = bean1.getContent().getData().getDescription();
                    collect = bean1.getContent().getData().getConsumption().getCollectionCount();
                    share = bean1.getContent().getData().getConsumption().getShareCount();

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
            ((SquareHolder)holder).img2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video = bean2.getContent().getData().getPlayUrl();
                    blurred = bean2.getContent().getData().getCover().getBlurred();
                    id = bean2.getContent().getData().getId();
                    head = bean2.getHeader().getIcon();
                    name = bean.getHeader().getTitle();
                    title = bean2.getContent().getData().getTitle();
                    desc = bean2.getContent().getData().getDescription();
                    collect = bean2.getContent().getData().getConsumption().getCollectionCount();
                    share = bean2.getContent().getData().getConsumption().getShareCount();

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

        }else{

            ((Banner2Holder)holder).tvTitle.setText(bean.getHeader().getTitle());
            ((Banner2Holder)holder).tvTag.setText(bean.getHeader().getDescription());
            Glide.with(context).load(bean.getImage()).into(((Banner2Holder)holder).img);
            Glide.with(context).load(bean.getHeader().getIcon()).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((Banner2Holder)holder).imgHead);
        }
    }

    @Override
    public int getItemCount() {
        return itemEntityList.size();
    }

    @Override
    public int getItemViewType(int position) {
        NominateModel.ItemListBean itemListBean = itemEntityList.get(position);
        if ("textCard".equals(itemListBean.getType())) {
            return TITLE;
        }
        if ("followCard".equals(itemListBean.getType())) {
            return FOLLOW;
        }
        if ("videoSmallCard".equals(itemListBean.getType())) {
            return VIDEO;
        }
        if ("banner2".equals(itemListBean.getType())){
            return BANNER2;
        }
        return SQUARE;
    }
}
