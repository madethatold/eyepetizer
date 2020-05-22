package com.example.eyepetizer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.databinding.ItemCommunityCardBinding;
import com.example.eyepetizer.databinding.ItemCommunityHeaderBinding;
import com.example.eyepetizer.model.Nominate2Model;
import com.example.eyepetizer.util.ToastUtil;

import java.util.List;

public class Nominate2Adapter extends RecyclerView.Adapter {
    private List<Nominate2Model.ItemListBeanX> itemListBeanXList;
    private List<Nominate2Model.ItemListBeanX.DataBeanX> dataBeanXList;

    private static int HEADER = 0;
    private static int CARD = 1;
    private Context context;

    private int baseWidth = 0;

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
        private ImageView img;

        public HeaderHolder(@NonNull ItemCommunityHeaderBinding itemView) {
            super(itemView.getRoot());
//            tv = itemView.tvLabel;
            img = itemView.ivBg;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
//        WindowManager manager =  (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
//        baseWidth = manager.getDefaultDisplay().getWidth()/2;

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

        if (position > 1) {
            Nominate2Model.ItemListBeanX.DataBeanX dataBeanX = dataBeanXList.get(position - 1);
            ((CardHolder) holder).tvName.setText(dataBeanX.getHeader().getIssuerName());
            ((CardHolder) holder).tvDescription.setText(dataBeanX.getContent().getData().getDescription());
            ((CardHolder) holder).tvStar.setText(dataBeanX.getContent().getData().getConsumption().getCollectionCount() + "");
            Glide.with(context).load(dataBeanX.getContent().getData().getCover().getFeed()).into(((CardHolder) holder).img);
            Glide.with(context).load(dataBeanX.getHeader().getIcon()).into(((CardHolder) holder).imgHeader);
            ((CardHolder) holder).img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ToastUtil.showMsg(context,position+"");
                }
            });
        }

        if (getItemViewType(position) == HEADER) {
//            ((HeaderHolder) holder).tv.setText(dataBeanXList.get(0).getItemList().get(position).getData().getTitle());
            Glide.with(context).load(dataBeanXList.get(0).getItemList().get(position).getData().getBgPicture()).into(((HeaderHolder) holder).img);
            ((HeaderHolder) holder).img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ToastUtil.showMsg(context,position+"");
                }
            });

        }


    }

    @Override
    public int getItemCount() {
        return itemListBeanXList.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position<=1) {
            return HEADER;
        } else {
            return CARD;
        }
    }
}
