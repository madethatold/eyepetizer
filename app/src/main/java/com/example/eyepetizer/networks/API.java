package com.example.eyepetizer.networks;

public interface API {
    //首页-日报
    public static final String DAILY="http://baobab.kaiyanapp.com/api/v5/index/tab/feed";

    //首页-推荐
    public static final String NOMINATE="http://baobab.kaiyanapp.com/api/v5/index/tab/allRec";

    //首页-发现
    public static final String DISCOVER="http://baobab.kaiyanapp.com/api/v7/index/tab/discovery";

    //视频详情页-相关推荐
    public static final String RELATED="http://baobab.kaiyanapp.com/api/v4/video/related?id=";

    //视频详情页-评论
    public static final String COMMENT="http://baobab.kaiyanapp.com/api/v2/replies/video?videoId=";

    //社区页-推荐
    public static final String NOMINATE2="http://baobab.kaiyanapp.com/api/v7/community/tab/rec";

    //社区页-关注
    public static final String FOLLOW="http://baobab.kaiyanapp.com/api/v6/community/tab/follow";


}
