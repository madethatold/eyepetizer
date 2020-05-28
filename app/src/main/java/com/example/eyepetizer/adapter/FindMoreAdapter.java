package com.example.eyepetizer.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eyepetizer.activity.VideoDetailActivity;
import com.example.eyepetizer.activity.WebDetailActivity;
import com.example.eyepetizer.databinding.ItemBannerBinding;
import com.example.eyepetizer.databinding.ItemBannerFindMoreBinding;
import com.example.eyepetizer.databinding.ItemBriefTagBinding;
import com.example.eyepetizer.databinding.ItemCardViewBinding;
import com.example.eyepetizer.databinding.ItemColumnBinding;
import com.example.eyepetizer.databinding.ItemSpecialCategoryBinding;
import com.example.eyepetizer.databinding.ItemTitleTagBinding;
import com.example.eyepetizer.model.FindMoreModel;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

public class FindMoreAdapter extends RecyclerView.Adapter {
    private static final int TITLE = 1;
    private static final int BANNER = 2;
    private static final int HORIZONTAL_BANNER = 3;
    private static final int COLUMN = 4;
    private static final int BRIEF_TAG = 5;
    private static final int SPECIAL = 6;
    private static final int VIDEO = 7;

    private String video;
    private String blurred;
    private int id;
    private String head;
    private String title;
    private String desc;
    private String name;
    private int collect;
    private int share;
    private static String TAG = "+++++++++++++++++++++++";
    private Context context;
    List<FindMoreModel.ItemListBeanX> itemListBeanXList;
    List<FindMoreModel.ItemListBeanX.DataBeanX> dataBeanXList;

    //构造器
    public FindMoreAdapter(List<FindMoreModel.ItemListBeanX> list1, List<FindMoreModel.ItemListBeanX.DataBeanX> list2) {
        this.itemListBeanXList = list1;
        this.dataBeanXList = list2;
    }

    //TITLE
    static class TitleHolder extends RecyclerView.ViewHolder {
        private TextView tv, tvSub;

        public TitleHolder(@NonNull ItemTitleTagBinding itemView) {
            super(itemView.getRoot());
            tv = itemView.tvTitle;
            tvSub = itemView.tvActionTitle;
        }
    }

    //BANNER
    static class BannerCardHolder extends RecyclerView.ViewHolder {
        private ImageView img;

        public BannerCardHolder(@NonNull ItemBannerFindMoreBinding itemView) {
            super(itemView.getRoot());
            img = itemView.img;
        }
    }

    //HORIZONTAL_BANNER
    static class TopBannerHolder extends RecyclerView.ViewHolder {
        private Banner banner;

        public TopBannerHolder(@NonNull ItemBannerBinding itemView) {
            super(itemView.getRoot());
            banner = itemView.banner;
        }
    }

    //COLUMN
    static class ColumnHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private ImageView img1, img2, img3, img4;

        public ColumnHolder(@NonNull ItemColumnBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvTitle;
            img1 = itemView.iv1;
            img2 = itemView.iv2;
            img3 = itemView.iv3;
            img4 = itemView.iv4;
        }
    }

    //BRIEF_TAG
    static class TAGHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvDescription;
        private ImageView img;
        private Button btnFollow;

        public TAGHolder(@NonNull ItemBriefTagBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvTitle;
            tvDescription = itemView.tvDescription;
            img = itemView.ivCover;
            btnFollow = itemView.btnFollow;
        }
    }

    //VIDEO
    static class VideoCardHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle, tvDesc, tvTime;
        private ImageView iv;

        public VideoCardHolder(@NonNull ItemCardViewBinding itemView) {
            super(itemView.getRoot());
            tvTitle = itemView.tvVideoTitle;
            tvTime = itemView.tvVideoTime;
            tvDesc = itemView.textView;
            iv = itemView.ivVideoCover;
        }
    }

    //SPECIAL
    static class SpecialCardHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle, tvSubTitle;
        private RecyclerView rv;

        public SpecialCardHolder(@NonNull ItemSpecialCategoryBinding itemView) {
            super(itemView.getRoot());
            tvSubTitle = itemView.tvActionTitle;
            tvTitle = itemView.tvTitle;
            rv = itemView.rvCategoryView;
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }

        ItemTitleTagBinding titleBinding = ItemTitleTagBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemBannerFindMoreBinding bannerFindMoreBinding = ItemBannerFindMoreBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemSpecialCategoryBinding categoryBinding = ItemSpecialCategoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemCardViewBinding cardViewBinding = ItemCardViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemColumnBinding columnBinding = ItemColumnBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemBannerBinding bannerBinding = ItemBannerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ItemBriefTagBinding briefTagBinding = ItemBriefTagBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        if (viewType == TITLE) {
            return new TitleHolder(titleBinding);
        } else if (viewType == BANNER) {
            return new BannerCardHolder(bannerFindMoreBinding);
        } else if (viewType == BRIEF_TAG) {
            return new TAGHolder(briefTagBinding);
        } else if (viewType == HORIZONTAL_BANNER) {
            return new TopBannerHolder(bannerBinding);
        } else if (viewType == COLUMN) {
            return new ColumnHolder(columnBinding);
        } else if (viewType == SPECIAL) {
            return new SpecialCardHolder(categoryBinding);
        } else {
            return new VideoCardHolder(cardViewBinding);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FindMoreModel.ItemListBeanX.DataBeanX dataBeanX = dataBeanXList.get(position);
        if (getItemViewType(position) == TITLE) {
            ((TitleHolder) holder).tv.setText(dataBeanX.getText());
            ((TitleHolder) holder).tvSub.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getActionUrl();
                    if (actionUrl.indexOf("url=") != -1) {
                        String str = actionUrl.substring(0, actionUrl.indexOf("url="));
                        String CoderUrl = actionUrl.substring(str.length() + 4, actionUrl.length());
                        String url = toURLDecoder(CoderUrl);
                        Bundle bundle = new Bundle();
                        bundle.putString("URL", url);
                        Intent intent = new Intent(context, WebDetailActivity.class);
                        intent.putExtras(bundle);
                        context.startActivity(intent, bundle);
                    }
                }
            });
        } else if (getItemViewType(position) == BRIEF_TAG) {
            ((TAGHolder) holder).tvDescription.setText(dataBeanX.getDescription());
            ((TAGHolder) holder).tvTitle.setText(dataBeanX.getTitle());
            Glide.with(context).load(dataBeanX.getIcon()).into(((TAGHolder) holder).img);
            ((TAGHolder)holder).img.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getActionUrl();
                    int index1 = actionUrl.indexOf("tag/") + 4;
                    int index2 = actionUrl.indexOf("/?title");
                    String id = actionUrl.substring(index1, index2);
                    String url = "https://www.kaiyanapp.com/campaign/tag_square/tag_square.html?pageSource=tagSquare&tid=" + id;
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    Intent intent = new Intent(context, WebDetailActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent,bundle);
                }
            });
        } else if (getItemViewType(position) == SPECIAL) {
            List<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean> beans = dataBeanX.getItemList();
            ((SpecialCardHolder) holder).tvTitle.setText(dataBeanX.getHeader().getTitle());
            CategoryAdapter adapter = new CategoryAdapter(beans);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
            gridLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
            ((SpecialCardHolder) holder).rv.setLayoutManager(gridLayoutManager);
            ((SpecialCardHolder) holder).rv.setAdapter(adapter);
        } else if (getItemViewType(position) == HORIZONTAL_BANNER) {
            List<FindMoreModel.ItemListBeanX.DataBeanX.ItemListBean> beans = dataBeanX.getItemList();
            ((TopBannerHolder) holder).banner.setAdapter(new MyBannerAdapter(beans))
                    .setIndicator(new CircleIndicator(context))
                    .start();
        } else if (getItemViewType(position) == BANNER) {
            Glide.with(context).load(dataBeanX.getImage()).into(((BannerCardHolder) holder).img);
            ((BannerCardHolder) holder).img.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getActionUrl();
                    String str = actionUrl.substring(0, actionUrl.indexOf("url="));
                    String CoderUrl = actionUrl.substring(str.length() + 4, actionUrl.length());
                    String url = toURLDecoder(CoderUrl);
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    Intent intent = new Intent(context, WebDetailActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent, bundle);
                }
            });
        } else if (getItemViewType(position) == VIDEO) {
            ((VideoCardHolder) holder).tvTitle.setText(dataBeanX.getTitle());
            ((VideoCardHolder) holder).tvDesc.setText(dataBeanX.getDescription());

            int minutes = dataBeanX.getDuration() / 60;
            int remainingSeconds = dataBeanX.getDuration() % 60;
            if (remainingSeconds < 10) {
                ((VideoCardHolder) holder).tvTime.setText(minutes + ":0" + remainingSeconds);
            } else {
                ((VideoCardHolder) holder).tvTime.setText(minutes + ":" + remainingSeconds);
            }

            Glide.with(context).load(dataBeanX.getCover().getDetail()).into(((VideoCardHolder) holder).iv);

            ((VideoCardHolder) holder).iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    video = dataBeanX.getPlayUrl();
                    blurred = dataBeanX.getCover().getBlurred();
                    id = dataBeanX.getId();
                    head = dataBeanX.getAuthor().getIcon();
                    name = dataBeanX.getAuthor().getName();
                    title = dataBeanX.getTitle();
                    collect = dataBeanX.getConsumption().getCollectionCount();
                    share = dataBeanX.getConsumption().getShareCount();
                    desc = dataBeanX.getDescription();

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
        } else {
            ((ColumnHolder) holder).tvTitle.setText(dataBeanX.getHeader().getTitle());
            Glide.with(context).load(dataBeanX.getItemList().get(0).getData().getImage()).into(((ColumnHolder) holder).img1);
            Glide.with(context).load(dataBeanX.getItemList().get(1).getData().getImage()).into(((ColumnHolder) holder).img2);
            Glide.with(context).load(dataBeanX.getItemList().get(2).getData().getImage()).into(((ColumnHolder) holder).img3);
            Glide.with(context).load(dataBeanX.getItemList().get(3).getData().getImage()).into(((ColumnHolder) holder).img4);

            ((ColumnHolder) holder).img1.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getItemList().get(0).getData().getActionUrl();
                    int index1 = actionUrl.indexOf("detail/") + 7;
                    int index2 = actionUrl.indexOf("?title");
                    String id = actionUrl.substring(index1, index2);
                    String url = "https://www.eyepetizer.net/videos_article.html?nid=" + id;
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    Intent intent = new Intent(context, WebDetailActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent,bundle);
                }
            });
            ((ColumnHolder) holder).img2.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getItemList().get(1).getData().getActionUrl();
                    int index1 = actionUrl.indexOf("detail/") + 7;
                    int index2 = actionUrl.indexOf("?title");
                    String id = actionUrl.substring(index1, index2);
                    String url = "https://www.eyepetizer.net/videos_article.html?nid=" + id;
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    Intent intent = new Intent(context, WebDetailActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent, bundle);
                }
            });
            ((ColumnHolder) holder).img3.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getItemList().get(2).getData().getActionUrl();
                    int index1 = actionUrl.indexOf("detail/") + 7;
                    int index2 = actionUrl.indexOf("?title");
                    String id = actionUrl.substring(index1, index2);
                    String url = "https://www.eyepetizer.net/videos_article.html?nid=" + id;
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    Intent intent = new Intent(context, WebDetailActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent, bundle);
                }
            });
            ((ColumnHolder) holder).img4.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    String actionUrl = dataBeanX.getItemList().get(3).getData().getActionUrl();
                    int index1 = actionUrl.indexOf("detail/") + 7;
                    int index2 = actionUrl.indexOf("?title");
                    String id = actionUrl.substring(index1, index2);
                    String url = "https://www.eyepetizer.net/videos_article.html?nid=" + id;
                    Bundle bundle = new Bundle();
                    bundle.putString("URL", url);
                    Intent intent = new Intent(context, WebDetailActivity.class);
                    intent.putExtras(bundle);
                    context.startActivity(intent, bundle);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return itemListBeanXList.size();
    }

    @Override
    public int getItemViewType(int position) {
        FindMoreModel.ItemListBeanX item = itemListBeanXList.get(position);
        if ("horizontalScrollCard".equals(item.getType())) {
            return HORIZONTAL_BANNER;
        } else if ("specialSquareCardCollection".equals(item.getType())) {
            return SPECIAL;
        } else if ("columnCardList".equals(item.getType())) {
            return COLUMN;
        } else if ("textCard".equals(item.getType())) {
            return TITLE;
        } else if ("banner".equals(item.getType())) {
            return BANNER;
        } else if ("videoSmallCard".equals(item.getType())) {
            return VIDEO;
        } else {
            return BRIEF_TAG;
        }

    }

    private static String toURLDecoder(String paramString) {
        if (paramString == null || paramString.equals("")) {
            return "";
        }
        try {
            String url = new String(paramString.getBytes(), "UTF-8");
            url = URLDecoder.decode(url, "UTF-8");
            return url;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}