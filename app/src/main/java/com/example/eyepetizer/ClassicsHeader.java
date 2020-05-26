package com.example.eyepetizer;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;

public class ClassicsHeader extends InternalAbstract implements RefreshHeader {

    private ImageView header;//动画视图

    public ClassicsHeader(Context context,@LayoutRes int resource) {
        this(context, null,resource);
    }

    public ClassicsHeader(Context context, AttributeSet attrs,@LayoutRes int resource) {
        this(context, attrs, 0,resource);
    }

    @SuppressLint("ResourceType")
    public ClassicsHeader(Context context, AttributeSet attrs, int defStyleAttr, @LayoutRes int resource) {
        super(context, attrs, defStyleAttr);
        View view = View.inflate(context, resource, this);
        header = view.findViewById(R.drawable.ic_eye_white);
//        header.setColorFilter(Color.BLACK);
    }

    @NonNull
    @Override
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Scale;
    }


    @Override
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int height, int maxDragHeight) {
        //旋转动画
        ObjectAnimator rotation = ObjectAnimator.ofFloat(header, "rotation",0,360);
        rotation.setDuration(2000);
        rotation.start();
    }


    @Override
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean success) {
        return 0;//动画结束就回弹
    }


    @Override
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState) {
        switch (newState) {
            case None:
            case PullDownToRefresh://动画结束释放刷新
                header.setVisibility(GONE);
                break;
            case Refreshing://正在刷新
                header.setImageResource(R.drawable.ic_eye_white);
                break;
            case ReleaseToRefresh://开始下拉操作
                header.setVisibility(VISIBLE);
                header.setImageResource(R.drawable.ic_eye_white);
                break;
        }
    }



}
