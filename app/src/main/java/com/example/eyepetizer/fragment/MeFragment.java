package com.example.eyepetizer.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.eyepetizer.R;
import com.example.eyepetizer.User;
import com.example.eyepetizer.activity.LoginActivity;
import com.example.eyepetizer.activity.MainActivity;
import com.example.eyepetizer.util.SharedPUtil;
import com.example.eyepetizer.util.ToastUtil;

import de.hdodenhof.circleimageview.CircleImageView;

public class MeFragment extends Fragment implements View.OnClickListener{
    private Button btnHistory,btnBadge,btnNotice,btnWriter,btnOffline,btnMyFollow;
    private LinearLayout llStar,llLoad;
    private CircleImageView imagHead;
    private TextView tvMyPage,userName;

    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fra_me, container, false);
        initview();
        setOnClick();
        return view;
    }

    private void initview(){
        btnBadge=view.findViewById(R.id.btn_my_badge);
        btnHistory=view.findViewById(R.id.btn_history);
        btnNotice=view.findViewById(R.id.btn_set_notification);
        btnWriter=view.findViewById(R.id.btn_writer);
        btnOffline=view.findViewById(R.id.btn_offline);
        btnMyFollow=view.findViewById(R.id.btn_my_follow);

        llLoad=view.findViewById(R.id.load);
        llStar=view.findViewById(R.id.star);

        imagHead=view.findViewById(R.id.imag_head);

        tvMyPage=view.findViewById(R.id.intoMyPage);
        userName=view.findViewById(R.id.username);

        imagHead.setImageResource(R.drawable.default_head);
        String name= (String) SharedPUtil.getParam(getContext(),SharedPUtil.LOGIN_DATA,"");
        userName.setText(name);


    }

    private void setOnClick(){
        btnBadge.setOnClickListener(this);
        btnWriter.setOnClickListener(this);
        btnMyFollow.setOnClickListener(this);
        btnHistory.setOnClickListener(this);
        btnOffline.setOnClickListener(this);
        btnNotice.setOnClickListener(this);

        llLoad.setOnClickListener(this);
        llStar.setOnClickListener(this);

        tvMyPage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_offline:
                SharedPUtil.setParam(getContext(), SharedPUtil.IS_LOGIN, false);
                SharedPUtil.removeParam(getContext(), SharedPUtil.LOGIN_DATA);

                //重新跳转到登录页面
                Intent intent = new Intent(getContext(), LoginActivity.class);
                startActivity(intent);
                getActivity().finish();
                break;
            case R.id.btn_history:
                break;
            case R.id.btn_my_badge:
                break;

            case R.id.btn_my_follow:
                break;

            case R.id.btn_set_notification:
                break;

            case R.id.btn_writer:
                break;

            case R.id.load:
                break;

            case R.id.star:
                break;

            case R.id.intoMyPage:
                break;


        }
    }
}
