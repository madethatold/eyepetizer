package com.example.eyepetizer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.eyepetizer.R;
import com.example.eyepetizer.databinding.ActivityPictureDetailBinding;
import com.example.eyepetizer.model.Nominate2Model;
import com.example.eyepetizer.util.DateUtil;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;
import java.util.List;

public class PictureDetailActivity extends AppCompatActivity {

    private Nominate2Model.ItemListBeanX.DataBeanX.Content.DataBean bean;
    private ArrayList<View> pageView;
    private ActivityPictureDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPictureDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        receive();
        initview();

    }

    private void receive() {
        Intent intent = getIntent();
        bean = (Nominate2Model.ItemListBeanX.DataBeanX.Content.DataBean) intent.getSerializableExtra("bean");
    }

    private void initview() {
        List<String> imgs = bean.getUrls();
        pageView = new ArrayList<View>();
        LayoutInflater inflater = getLayoutInflater();
        for (int i = 0; i < imgs.size(); i++) {
            View view = inflater.inflate(R.layout.item_pager, null);
            ImageView imageView = view.findViewById(R.id.img);
            pageView.add(imageView);
        }

        PagerAdapter adapter = new PagerAdapter() {
            @Override
            public int getCount() {
                return pageView.size();
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return view == object;
            }

            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {
                String url = imgs.get(position);
                PhotoView photoView = new PhotoView(PictureDetailActivity.this);
                Glide.with(PictureDetailActivity.this)
                        .load(url)
                        .into(photoView);
                container.addView(photoView);
                photoView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });
                return photoView;
            }

            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                container.removeView((View) object);
            }
        };

        binding.viewpager.setAdapter(adapter);

        binding.tvName.setText(bean.getOwner().getNickname());
        binding.tvTime.setText(DateUtil.getDateToString(bean.getCreateTime()));
        binding.tvDec.setText(bean.getDescription());
        Glide.with(PictureDetailActivity.this)
                .load(bean.getOwner().getAvatar())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(binding.header);
    }
}
