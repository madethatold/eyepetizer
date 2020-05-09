package com.example.eyepetizer.networks;

import android.content.Context;
import android.content.Intent;

public interface API {
    //首页-日报
    public static final String DAILY="http://baobab.kaiyanapp.com/api/v5/index/tab/feed";

    //首页-推荐
    public static final String NOMINATE="http://baobab.kaiyanapp.com/api/v5/index/tab/allRec";

    //首页-发现
    public static final String DISCOVER="http://baobab.kaiyanapp.com/api/v7/index/tab/discover";
}
