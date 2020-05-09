package com.example.eyepetizer.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.eyepetizer.R;
import com.example.eyepetizer.fragment.CommunityFragment;
import com.example.eyepetizer.fragment.MainFragmemt;
import com.example.eyepetizer.fragment.MeFragment;
import com.example.eyepetizer.fragment.NotificationFragment;
import com.example.eyepetizer.util.SharedPUtil;
import com.example.eyepetizer.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout ll_main, ll_community, ll_upload,ll_notification,ll_me;

    private ImageView img_main, img_community, img_upload,img_notification,img_me;
    private TextView text_main, text_community, text_notification,text_me;

    private MainFragmemt mainFragmemt;
    private CommunityFragment communityFragment;
    private Fragment notificationFragment;
    private MeFragment meFragment;

    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
        initFragment();

        ll_main.setOnClickListener(this);
        ll_community.setOnClickListener(this);
        ll_notification.setOnClickListener(this);
        ll_me.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.layout_main: {
                if (mainFragmemt == null) {
                    mainFragmemt = new MainFragmemt();
                }
                addFragment(mainFragmemt);
                showFragment(mainFragmemt);

                text_main.setTextColor(Color.BLUE);
                text_notification.setTextColor(Color.BLACK);
                text_community.setTextColor(Color.BLACK);
                text_me.setTextColor(Color.BLACK);

                ll_main.setBackgroundColor(Color.parseColor("#BBBBBB"));
                ll_community.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_upload.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_notification.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_me.setBackgroundColor(Color.parseColor("#ffffff"));
            }
            break;
            case R.id.layout_community: {
                if (communityFragment == null) {
                    communityFragment = new CommunityFragment();
                }
                addFragment(communityFragment);
                showFragment(communityFragment);

                text_main.setTextColor(Color.BLACK);
                text_notification.setTextColor(Color.BLACK);
                text_community.setTextColor(Color.BLUE);
                text_me.setTextColor(Color.BLACK);

                ll_main.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_community.setBackgroundColor(Color.parseColor("#BBBBBB"));
                ll_upload.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_notification.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_me.setBackgroundColor(Color.parseColor("#ffffff"));
            }
            break;
            case R.id.layout_notification: {
                if (notificationFragment == null) {
                    notificationFragment = new NotificationFragment();
                }
                addFragment(notificationFragment);
                showFragment(notificationFragment);

                text_main.setTextColor(Color.BLACK);
                text_notification.setTextColor(Color.BLUE);
                text_community.setTextColor(Color.BLACK);
                text_me.setTextColor(Color.BLACK);

                ll_main.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_community.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_upload.setBackgroundColor(Color.parseColor("#ffffff"));
                ll_notification.setBackgroundColor(Color.parseColor("#BBBBBB"));
                ll_me.setBackgroundColor(Color.parseColor("#ffffff"));


            }
            break;
            case R.id.layout_me: {
                boolean userIsLogin = (boolean) SharedPUtil.getParam(MainActivity.this,
                        SharedPUtil.IS_LOGIN, false);
                if(userIsLogin){
                    if (meFragment == null) {
                        meFragment = new MeFragment();
                    }
                    addFragment(meFragment);
                    showFragment(meFragment);

                    text_main.setTextColor(Color.BLACK);
                    text_notification.setTextColor(Color.BLACK);
                    text_community.setTextColor(Color.BLACK);
                    text_me.setTextColor(Color.BLUE);

                    ll_main.setBackgroundColor(Color.parseColor("#ffffff"));
                    ll_community.setBackgroundColor(Color.parseColor("#ffffff"));
                    ll_upload.setBackgroundColor(Color.parseColor("#ffffff"));
                    ll_notification.setBackgroundColor(Color.parseColor("#ffffff"));
                    ll_me.setBackgroundColor(Color.parseColor("#BBBBBB"));
                }else {
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);//实例化
                    builder.setTitle("提示").setMessage("请先登录或注册").setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                            startActivity(intent);
                        }
                    }).setNegativeButton("继续浏览", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(MainActivity.this,"以游客模式继续浏览");
                        }
                    }).show();
                }


            }
            break;
            default:
                break;
        }
    }

    private void initview(){
        ll_main=findViewById(R.id.layout_main);
        ll_community=findViewById(R.id.layout_community);
        ll_upload=findViewById(R.id.layout_upload);
        ll_notification=findViewById(R.id.layout_notification);
        ll_me=findViewById(R.id.layout_me);

        img_notification=findViewById(R.id.icon_notification);
        img_main=findViewById(R.id.icon_main);
        img_community=findViewById(R.id.icon_community);
        img_me=findViewById(R.id.icon_me);
        img_upload= findViewById(R.id.icon_upload);

        text_main=findViewById(R.id.text_main);
        text_community=findViewById(R.id.text_community);
        text_me=findViewById(R.id.text_me);
        text_notification=findViewById(R.id.text_notification);
    }

    private void initFragment() {
        mainFragmemt = new MainFragmemt();
        addFragment(mainFragmemt);
        showFragment(mainFragmemt);

        text_main.setTextColor(Color.BLUE);
        text_notification.setTextColor(Color.BLACK);
        text_community.setTextColor(Color.BLACK);
        text_me.setTextColor(Color.BLACK);

        ll_main.setBackgroundColor(Color.parseColor("#BBBBBB"));
        ll_community.setBackgroundColor(Color.parseColor("#ffffff"));
        ll_upload.setBackgroundColor(Color.parseColor("#ffffff"));
        ll_notification.setBackgroundColor(Color.parseColor("#ffffff"));
        ll_me.setBackgroundColor(Color.parseColor("#ffffff"));

    }

    /*添加fragment*/
    private void addFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!fragment.isAdded()) {
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            transaction.add(R.id.main_frameLayout, fragment).commit();
            fragmentList.add(fragment);
        }
    }

    /*显示fragment*/
    private void showFragment(Fragment fragment) {
        for (Fragment frag : fragmentList) {
            if (frag != fragment) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.hide(frag).commit();
            }
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.show(fragment).commit();
    }
}
