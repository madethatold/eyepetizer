package com.example.eyepetizer.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.eyepetizer.activity.PictureDetailActivity;
import com.example.eyepetizer.databinding.ItemCommunityCardBinding;
import com.example.eyepetizer.databinding.ItemCommunityHeaderBinding;
import com.example.eyepetizer.model.Nominate2Model;

import java.util.List;

public class Nominate2Adapter extends RecyclerView.Adapter {
    private List<Nominate2Model.ItemListBeanX> itemListBeanXList;
    private List<Nominate2Model.ItemListBeanX.DataBeanX> dataBeanXList;

    private static int HEADER = 0;
    private static int CARD = 1;
    private Context context;

    public Nominate2Adapter(List<Nominate2Model.ItemListBeanX> itemListBeanXList, List<Nominate2Model.ItemListBeanX.DataBeanX> dataBeanXList) {
        this.itemListBeanXList = itemListBeanXList;
        this.dataBeanXList = dataBeanXList;
    }


    static class CardHolder extends RecyclerView.ViewHolder {
        private ImageView img, imgStar, imgHeader;
        private TextView tvStar, tvDescription, tvName;

        public CardHolder(@NonNull ItemCommunityCardBinding itemView) {
            super(itemView.getRoot());
            imgStar = itemView.imageView2;
            img = itemView.ivCoverBg;
            imgHeader = itemView.ivAvatar;
            tvStar = itemView.tvCollectionNum;
            tvDescription = itemView.tvDescription;
            tvName = itemView.tvNickname;
        }
    }

    static class HeaderHolder extends RecyclerView.ViewHolder {
        private TextView tv;
        private ImageView img1, img2;

        public HeaderHolder(@NonNull ItemCommunityHeaderBinding itemView) {
            super(itemView.getRoot());
//            tv = itemView.tvLabel;
            img1 = itemView.ivBg1;
            img2 = itemView.ivBg2;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }

        ItemCommunityHeaderBinding headerBinding = ItemCommunityHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemCommunityCardBinding cardBinding = ItemCommunityCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        if (viewType == HEADER) {
            return new HeaderHolder(headerBinding);
        } else {
            return new CardHolder(cardBinding);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (position > 0) {
            Nominate2Model.ItemListBeanX.DataBeanX dataBeanX = dataBeanXList.get(position);
            ((CardHolder) holder).tvName.setText(dataBeanX.getHeader().getIssuerName());
            ((CardHolder) holder).tvDescription.setText(dataBeanX.getContent().getData().getDescription());
            ((CardHolder) holder).tvStar.setText(dataBeanX.getContent().getData().getConsumption().getCollectionCount() + "");

            ViewGroup.LayoutParams layoutParams = ((CardHolder) holder).img.getLayoutParams();
            DisplayMetrics metrics = context.getResources().getDisplayMetrics();
            layoutParams.width = metrics.widthPixels / 2; //瀑布流为两列
            layoutParams.height = px2dip(context,dataBeanX.getContent().getData().getHeight());
            ((CardHolder) holder).img.setLayoutParams(layoutParams);

            Glide.with(context).load(dataBeanX.getContent().getData().getCover().getFeed()).into(((CardHolder) holder).img);
            Glide.with(context).load(dataBeanX.getHeader().getIcon()).apply(RequestOptions.bitmapTransform(new CircleCrop())).into(((CardHolder) holder).imgHeader);

            ((CardHolder) holder).img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Nominate2Model.ItemListBeanX.DataBeanX.Content.DataBean bean = dataBeanX.getContent().getData();
                    Intent intent = new Intent(context, PictureDetailActivity.class);
                    intent.putExtra("bean", bean);
                    context.startActivity(intent);
                }
            });
        }

        if (getItemViewType(position) == HEADER) {
            Glide.with(context).load(dataBeanXList.get(0).getItemList().get(0).getData().getBgPicture()).into(((HeaderHolder) holder).img1);
            Glide.with(context).load(dataBeanXList.get(0).getItemList().get(1).getData().getBgPicture()).into(((HeaderHolder) holder).img2);
        }
    }

    @Override
    public int getItemCount() {
        return itemListBeanXList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HEADER;
        } else {
            return CARD;
        }
    }

    //    下面两个方法提供给页面刷新和加载时调用
    public void add(List<Nominate2Model.ItemListBeanX> addList1, List<Nominate2Model.ItemListBeanX.DataBeanX> addList2) {
        //增加数据
        int position = itemListBeanXList.size();
        itemListBeanXList.addAll(position, addList1);
        dataBeanXList.addAll(position, addList2);
        notifyItemInserted(position);
    }

    public void refresh(List<Nominate2Model.ItemListBeanX> newList1, List<Nominate2Model.ItemListBeanX.DataBeanX> newList2) {
        //刷新数据
        itemListBeanXList.removeAll(itemListBeanXList);
        dataBeanXList.removeAll(dataBeanXList);
        itemListBeanXList.addAll(newList1);
        dataBeanXList.addAll(newList2);
        notifyDataSetChanged();
    }

    public int px2dip(Context context, float pxValue) {
        float m = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / m + 0.5f);
    }
}
