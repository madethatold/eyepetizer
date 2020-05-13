package com.example.eyepetizer.adapter;

import android.content.Context;
import android.icu.text.MessagePattern;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.databinding.ItemBannerBinding;
import com.example.eyepetizer.databinding.ItemBriefCardBinding;
import com.example.eyepetizer.databinding.ItemBriefTagBinding;
import com.example.eyepetizer.databinding.ItemCardViewBinding;
import com.example.eyepetizer.databinding.ItemColumnBinding;
import com.example.eyepetizer.databinding.ItemTitleBinding;
import com.example.eyepetizer.databinding.ItemTitleTagBinding;
import com.example.eyepetizer.databinding.ItemTopBannerBinding;
import com.example.eyepetizer.model.FindMoreModel;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.List;

public class FindMoreAdapter extends RecyclerView.Adapter {
    private static final int TITLE=1;
    private static final int BRIEF=2;
    private static final int BANNER=3;
    private static final int COLUMN=4;
    private static final int TAG=5;

    private Context context;
    List<FindMoreModel.ItemListBeanX> itemListBeanXList;
    List<FindMoreModel.ItemListBeanX.DataBeanX> dataBeanXList;

    //构造器
    public FindMoreAdapter(List<FindMoreModel.ItemListBeanX> list1,List<FindMoreModel.ItemListBeanX.DataBeanX> list2){
        this.itemListBeanXList=list1;
        this.dataBeanXList=list2;
    }


    //_____________________________holder_____________________________


    //小卡片
    static class BriefCardHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        private ImageView imgB;

        public BriefCardHolder(@NonNull ItemBriefCardBinding itemView) {
            super(itemView.getRoot());
            tv=itemView.tvLabel;
            imgB=itemView.ivCategoryBg;
        }
    }

    //顶部banner
    static class TopBannerHolder extends RecyclerView.ViewHolder{
        private Banner banner;
        public TopBannerHolder(@NonNull ItemBannerBinding itemView) {
            super(itemView.getRoot());
            banner=itemView.banner;
        }
    }

    //专栏item
    static class ColumnHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle;
        private ImageView img1,img2,img3,img4;
        public ColumnHolder(@NonNull ItemColumnBinding itemView) {
            super(itemView.getRoot());
            tvTitle=itemView.tvTitle;
            img1=itemView.iv1;
            img2=itemView.iv2;
            img3=itemView.iv3;
            img4=itemView.iv4;

        }
    }

    //可点击title
    static class TitleHolder extends RecyclerView.ViewHolder{
        private TextView tv;
        public TitleHolder(@NonNull ItemTitleTagBinding itemView) {
            super(itemView.getRoot());
            tv=itemView.tvTitle;
        }
    }

    //tag
    static class TAGHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle,tvDescription;
        private ImageView img;
        private Button btnFollow;
        public TAGHolder(@NonNull ItemBriefTagBinding itemView) {
            super(itemView.getRoot());
            tvTitle=itemView.tvTitle;
            tvDescription=itemView.tvDescription;
            img=itemView.ivCover;
            btnFollow=itemView.btnFollow;
        }
    }

    //__________________________________________________________
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(context==null){
            context=parent.getContext();
        }

        ItemTitleTagBinding titleBinding=ItemTitleTagBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemBannerBinding bannerBinding=ItemBannerBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemBriefTagBinding tagBinding=ItemBriefTagBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemBriefCardBinding cardBinding=ItemBriefCardBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ItemColumnBinding columnBinding=ItemColumnBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        if (viewType==TITLE){
            return new TitleHolder(titleBinding);
        }else if (viewType==BANNER){
            return new TopBannerHolder(bannerBinding);
        }else if (viewType==TAG){
            return new TAGHolder(tagBinding);
        }else if(viewType==BRIEF){
            return new BriefCardHolder(cardBinding);
        }else {
            return new ColumnHolder(columnBinding);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FindMoreModel.ItemListBeanX.DataBeanX dataBeanX=dataBeanXList.get(position);
        if (getItemViewType(position)==TITLE){
            ((TitleHolder)holder).tv.setText(dataBeanX.getText());
        }else if(getItemViewType(position)==TAG){
            ((TAGHolder)holder).tvDescription.setText(dataBeanX.getDescription());
            ((TAGHolder)holder).tvTitle.setText(dataBeanX.getTitle());
            Glide.with(context).load(dataBeanX.getIcon()).into(((TAGHolder)holder).img);
            ((TAGHolder)holder).btnFollow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }else if (getItemViewType(position)==BRIEF){
            ((BriefCardHolder)holder).tv.setText(dataBeanX.getTitle());
            Glide.with(context).load(dataBeanX.getIcon()).into(((BriefCardHolder)holder).imgB);
        }else if (getItemViewType(position)==BANNER){
            List<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean> beans=dataBeanX.getItemList();
            ((TopBannerHolder)holder).banner.setAdapter(new MyBannerAdapter(beans))
                    .setIndicator(new CircleIndicator(context))
                    .start();
        }else {
            ((ColumnHolder)holder).tvTitle.setText(dataBeanX.getHeader().getTitle());
            Glide.with(context).load(dataBeanX.getItemList().get(0).getData().getImage()).into(((ColumnHolder)holder).img1);
            Glide.with(context).load(dataBeanX.getItemList().get(1).getData().getImage()).into(((ColumnHolder)holder).img2);
            Glide.with(context).load(dataBeanX.getItemList().get(2).getData().getImage()).into(((ColumnHolder)holder).img3);
            Glide.with(context).load(dataBeanX.getItemList().get(3).getData().getImage()).into(((ColumnHolder)holder).img4);

        }
    }

    @Override
    public int getItemCount() {
        return itemListBeanXList.size();
    }

    @Override
    public int getItemViewType(int position) {
        FindMoreModel.ItemListBeanX item =itemListBeanXList.get(position);
        if ("horizontalScrollCard".equals(item.getType())){
            return BANNER;
        }else if("briefCard".equals(item.getType())){
            if (item.getData().getDataType().equals("TagBriefCard")){
                return TAG;
            }else {
                return BRIEF;
            }
        } else if("textCard".equals(item.getType())){
            return TITLE;
        }else {
            return COLUMN;
        }
    }
}
