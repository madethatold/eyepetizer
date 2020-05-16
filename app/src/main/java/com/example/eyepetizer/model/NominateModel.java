package com.example.eyepetizer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NominateModel {
    private int count;
    private String nextPageUrl;
    @SerializedName("itemList")
    private List<ItemListBean> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBean{
        private String type;
        @SerializedName("data")
        private DataBean data;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean{
            private String dataType;
            private String text;
            private int id;
            private String title;
            private String description;
            private String category;
            private String playUrl;
            private long releaseTime;
            @SerializedName("header")
            private HeaderBean header;
            @SerializedName("content")
            private ContentBean content;
            @SerializedName("tags")
            private List<TagsBean> tags;
            @SerializedName("author")
            private AuthorBean author;
            @SerializedName("cover")
            private CoverBean cover;
            @SerializedName("consumption")
            private ConsumptionBean consumption;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public long getReleaseTime() {
                return releaseTime;
            }

            public void setReleaseTime(long releaseTime) {
                this.releaseTime = releaseTime;
            }

            public HeaderBean getHeader() {
                return header;
            }

            public void setHeader(HeaderBean header) {
                this.header = header;
            }

            public ContentBean getContent() {
                return content;
            }

            public void setContent(ContentBean content) {
                this.content = content;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public CoverBean getCover() {
                return cover;
            }

            public void setCover(CoverBean cover) {
                this.cover = cover;
            }

            public ConsumptionBean getConsumption() {
                return consumption;
            }

            public void setConsumption(ConsumptionBean consumption) {
                this.consumption = consumption;
            }

            public static class HeaderBean{

                /**
                 * id : 5622
                 * title : 日食记
                 * font : null
                 * subTitle : null
                 * subTitleFont : null
                 * textAlign : left
                 * cover : null
                 * label : null
                 * actionUrl : eyepetizer://pgc/detail/22/?title=%E6%97%A5%E9%A3%9F%E8%AE%B0&userType=PGC&tabIndex=1
                 * labelList : null
                 * rightText : null
                 * icon : http://img.kaiyanapp.com/2faf2139c4b655e56a54bdb2ee06e0b4.jpeg
                 * iconType : round
                 * description : #开胃 / 收录于 每日编辑精选
                 * time : 1458403200000
                 * showHateVideo : false
                 */

                private int id;
                private String title;
                private Object font;
                private Object subTitle;
                private Object subTitleFont;
                private String textAlign;
                private Object cover;
                private Object label;
                private String actionUrl;
                private Object labelList;
                private Object rightText;
                private String icon;
                private String iconType;
                private String description;
                private long time;
                private boolean showHateVideo;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public Object getFont() {
                    return font;
                }

                public void setFont(Object font) {
                    this.font = font;
                }

                public Object getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(Object subTitle) {
                    this.subTitle = subTitle;
                }

                public Object getSubTitleFont() {
                    return subTitleFont;
                }

                public void setSubTitleFont(Object subTitleFont) {
                    this.subTitleFont = subTitleFont;
                }

                public String getTextAlign() {
                    return textAlign;
                }

                public void setTextAlign(String textAlign) {
                    this.textAlign = textAlign;
                }

                public Object getCover() {
                    return cover;
                }

                public void setCover(Object cover) {
                    this.cover = cover;
                }

                public Object getLabel() {
                    return label;
                }

                public void setLabel(Object label) {
                    this.label = label;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getLabelList() {
                    return labelList;
                }

                public void setLabelList(Object labelList) {
                    this.labelList = labelList;
                }

                public Object getRightText() {
                    return rightText;
                }

                public void setRightText(Object rightText) {
                    this.rightText = rightText;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getIconType() {
                    return iconType;
                }

                public void setIconType(String iconType) {
                    this.iconType = iconType;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public long getTime() {
                    return time;
                }

                public void setTime(long time) {
                    this.time = time;
                }

                public boolean isShowHateVideo() {
                    return showHateVideo;
                }

                public void setShowHateVideo(boolean showHateVideo) {
                    this.showHateVideo = showHateVideo;
                }
            }

            public static class ContentBean{


                /**
                 * type : video
                 * data : {"dataType":"VideoBeanForClient","id":5622,"title":"周末食谱：煲仔饭","description":"周末宅家，简直难以抉择要吃什么来与这份惬意相配呢~那就来一碗煲仔饭吧。软糯的香米配上微焦的香肠，再加一颗溏心蛋。噢，别忘了几棵清爽的青菜\u2026\u2026想想就有温暖的饱腹感~From 日食记","library":"DAILY","tags":[{"id":20,"name":"风味市集","actionUrl":"eyepetizer://tag/20/?title=%E9%A3%8E%E5%91%B3%E5%B8%82%E9%9B%86","adTrack":null,"desc":"每日美食实验，带你感受味觉巅峰瞬间","bgPicture":"http://img.kaiyanapp.com/2c869d91d5db6ecf1c8c46af0f448719.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/5748574edf96949c04ad382c46a4a2fd.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1020,"name":"开胃","actionUrl":"eyepetizer://tag/1020/?title=%E5%BC%80%E8%83%83","adTrack":null,"desc":"用美食唤醒你沉睡的味蕾","bgPicture":"http://img.kaiyanapp.com/539f19d05586a9bcf67f255b2e54da2d.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/539f19d05586a9bcf67f255b2e54da2d.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":718,"name":"美食教程","actionUrl":"eyepetizer://tag/718/?title=%E7%BE%8E%E9%A3%9F%E6%95%99%E7%A8%8B","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/403c8b2c0ffc94f8b80e4cb7779ac9bf.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/efd50bb0281c9ef9cf32ac84195f2136.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":538,"name":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":536,"name":"情怀","actionUrl":"eyepetizer://tag/536/?title=%E6%83%85%E6%80%80","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b51aacb3c8f5632a88b6d1cde9ce9ca3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b51aacb3c8f5632a88b6d1cde9ce9ca3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":136,"name":"温情","actionUrl":"eyepetizer://tag/136/?title=%E6%B8%A9%E6%83%85","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":46,"name":"教程","actionUrl":"eyepetizer://tag/46/?title=%E6%95%99%E7%A8%8B","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":9717,"shareCount":7855,"replyCount":161,"realCollectionCount":91},"resourceType":"video","slogan":null,"provider":{"name":"PGC","alias":"PGC","icon":""},"category":"开胃","author":{"id":22,"icon":"http://img.kaiyanapp.com/2faf2139c4b655e56a54bdb2ee06e0b4.jpeg","name":"日食记","description":"治愈你心和胃的日食记：）  快加我的微信公众号【日食记】，否则我就\u2026\u2026求求你加我！  微博 @日食记 @酥饼大人","link":"http://weibo.com/rishiji?from=myfollow_all","latestReleaseTime":1589270862000,"videoNum":319,"adTrack":null,"follow":{"itemType":"author","itemId":22,"followed":false},"shield":{"itemType":"author","itemId":22,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/923c833ede7c0e7bec8733006a4e32f8.jpeg?imageMogr2/quality/100","detail":"http://img.kaiyanapp.com/923c833ede7c0e7bec8733006a4e32f8.jpeg?imageMogr2/quality/100","blurred":"http://img.kaiyanapp.com/37f01792333687981c70935927b043b8.jpeg?imageMogr2/quality/100","sharing":null,"homepage":null},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":236,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=5622","forWeibo":"http://wandou.im/1jat49"},"releaseTime":1458403200000,"playInfo":[{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss","size":17648342},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=ucloud&playUrlType=url_oss","size":17648342}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":40135306},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":40135306}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1458403200000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"周末宅家，简直难以抉择要吃什么来与这份惬意相配呢~那就来一碗煲仔饭吧。软糯的香米配上微焦的香肠，再加一颗溏心蛋。噢，别忘了几棵清爽的青菜\u2026\u2026想想就有温暖的饱腹感~From 日食记","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":7,"recallSource":""}
                 * tag : null
                 * id : 0
                 * adIndex : -1
                 */

                private String type;
                private DataBean2 data;
                private Object tag;
                private int id;
                private int adIndex;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public DataBean2 getData() {
                    return data;
                }

                public void setData(DataBean2 data) {
                    this.data = data;
                }

                public Object getTag() {
                    return tag;
                }

                public void setTag(Object tag) {
                    this.tag = tag;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getAdIndex() {
                    return adIndex;
                }

                public void setAdIndex(int adIndex) {
                    this.adIndex = adIndex;
                }

                public static class DataBean2 {
                    /**
                     * dataType : VideoBeanForClient
                     * id : 5622
                     * title : 周末食谱：煲仔饭
                     * description : 周末宅家，简直难以抉择要吃什么来与这份惬意相配呢~那就来一碗煲仔饭吧。软糯的香米配上微焦的香肠，再加一颗溏心蛋。噢，别忘了几棵清爽的青菜……想想就有温暖的饱腹感~From 日食记
                     * library : DAILY
                     * tags : [{"id":20,"name":"风味市集","actionUrl":"eyepetizer://tag/20/?title=%E9%A3%8E%E5%91%B3%E5%B8%82%E9%9B%86","adTrack":null,"desc":"每日美食实验，带你感受味觉巅峰瞬间","bgPicture":"http://img.kaiyanapp.com/2c869d91d5db6ecf1c8c46af0f448719.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/5748574edf96949c04ad382c46a4a2fd.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":1020,"name":"开胃","actionUrl":"eyepetizer://tag/1020/?title=%E5%BC%80%E8%83%83","adTrack":null,"desc":"用美食唤醒你沉睡的味蕾","bgPicture":"http://img.kaiyanapp.com/539f19d05586a9bcf67f255b2e54da2d.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/539f19d05586a9bcf67f255b2e54da2d.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":718,"name":"美食教程","actionUrl":"eyepetizer://tag/718/?title=%E7%BE%8E%E9%A3%9F%E6%95%99%E7%A8%8B","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/403c8b2c0ffc94f8b80e4cb7779ac9bf.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/efd50bb0281c9ef9cf32ac84195f2136.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":538,"name":"喵星人","actionUrl":"eyepetizer://tag/538/?title=%E5%96%B5%E6%98%9F%E4%BA%BA","adTrack":null,"desc":"","bgPicture":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/e2b82549f60051d85ffb552d2efe8c07.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":536,"name":"情怀","actionUrl":"eyepetizer://tag/536/?title=%E6%83%85%E6%80%80","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/b51aacb3c8f5632a88b6d1cde9ce9ca3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/b51aacb3c8f5632a88b6d1cde9ce9ca3.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":136,"name":"温情","actionUrl":"eyepetizer://tag/136/?title=%E6%B8%A9%E6%83%85","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/0bc1dc78c631eae017ee69418303adc5.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":46,"name":"教程","actionUrl":"eyepetizer://tag/46/?title=%E6%95%99%E7%A8%8B","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/ca40278cd698aec9997985139ae05007.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}]
                     * consumption : {"collectionCount":9717,"shareCount":7855,"replyCount":161,"realCollectionCount":91}
                     * resourceType : video
                     * slogan : null
                     * provider : {"name":"PGC","alias":"PGC","icon":""}
                     * category : 开胃
                     * author : {"id":22,"icon":"http://img.kaiyanapp.com/2faf2139c4b655e56a54bdb2ee06e0b4.jpeg","name":"日食记","description":"治愈你心和胃的日食记：）  快加我的微信公众号【日食记】，否则我就\u2026\u2026求求你加我！  微博 @日食记 @酥饼大人","link":"http://weibo.com/rishiji?from=myfollow_all","latestReleaseTime":1589270862000,"videoNum":319,"adTrack":null,"follow":{"itemType":"author","itemId":22,"followed":false},"shield":{"itemType":"author","itemId":22,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
                     * cover : {"feed":"http://img.kaiyanapp.com/923c833ede7c0e7bec8733006a4e32f8.jpeg?imageMogr2/quality/100","detail":"http://img.kaiyanapp.com/923c833ede7c0e7bec8733006a4e32f8.jpeg?imageMogr2/quality/100","blurred":"http://img.kaiyanapp.com/37f01792333687981c70935927b043b8.jpeg?imageMogr2/quality/100","sharing":null,"homepage":null}
                     * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss
                     * thumbPlayUrl : null
                     * duration : 236
                     * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=5622","forWeibo":"http://wandou.im/1jat49"}
                     * releaseTime : 1458403200000
                     * playInfo : [{"height":480,"width":854,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss","size":17648342},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=ucloud&playUrlType=url_oss","size":17648342}],"name":"标清","type":"normal","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss"},{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":40135306},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":40135306}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}]
                     * campaign : null
                     * waterMarks : null
                     * ad : false
                     * adTrack : []
                     * type : NORMAL
                     * titlePgc : null
                     * descriptionPgc : null
                     * remark :
                     * ifLimitVideo : false
                     * searchWeight : 0
                     * brandWebsiteInfo : null
                     * idx : 0
                     * shareAdTrack : null
                     * favoriteAdTrack : null
                     * webAdTrack : null
                     * date : 1458403200000
                     * promotion : null
                     * label : null
                     * labelList : []
                     * descriptionEditor : 周末宅家，简直难以抉择要吃什么来与这份惬意相配呢~那就来一碗煲仔饭吧。软糯的香米配上微焦的香肠，再加一颗溏心蛋。噢，别忘了几棵清爽的青菜……想想就有温暖的饱腹感~From 日食记
                     * collected : false
                     * reallyCollected : false
                     * played : false
                     * subtitles : []
                     * lastViewTime : null
                     * playlists : null
                     * src : 7
                     * recallSource :
                     */

                    private String dataType;
                    private int id;
                    private String title;
                    private String description;
                    private String library;
                    private ConsumptionBean consumption;
                    private String resourceType;
                    private Object slogan;
                    private ProviderBean provider;
                    private String category;
                    private AuthorBean author;
                    private CoverBean cover;
                    private String playUrl;
                    private Object thumbPlayUrl;
                    private int duration;
                    private WebUrlBean webUrl;
                    private long releaseTime;
                    private Object campaign;
                    private Object waterMarks;
                    private boolean ad;
                    private String type;
                    private Object titlePgc;
                    private Object descriptionPgc;
                    private String remark;
                    private boolean ifLimitVideo;
                    private int searchWeight;
                    private Object brandWebsiteInfo;
                    private int idx;
                    private Object shareAdTrack;
                    private Object favoriteAdTrack;
                    private Object webAdTrack;
                    private long date;
                    private Object promotion;
                    private Object label;
                    private String descriptionEditor;
                    private boolean collected;
                    private boolean reallyCollected;
                    private boolean played;
                    private Object lastViewTime;
                    private Object playlists;
                    private int src;
                    private String recallSource;
                    private List<TagsBean> tags;
                    private List<PlayInfoBean> playInfo;
                    private List<?> adTrack;
                    private List<?> labelList;
                    private List<?> subtitles;

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getLibrary() {
                        return library;
                    }

                    public void setLibrary(String library) {
                        this.library = library;
                    }

                    public ConsumptionBean getConsumption() {
                        return consumption;
                    }

                    public void setConsumption(ConsumptionBean consumption) {
                        this.consumption = consumption;
                    }

                    public String getResourceType() {
                        return resourceType;
                    }

                    public void setResourceType(String resourceType) {
                        this.resourceType = resourceType;
                    }

                    public Object getSlogan() {
                        return slogan;
                    }

                    public void setSlogan(Object slogan) {
                        this.slogan = slogan;
                    }

                    public ProviderBean getProvider() {
                        return provider;
                    }

                    public void setProvider(ProviderBean provider) {
                        this.provider = provider;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

                    public AuthorBean getAuthor() {
                        return author;
                    }

                    public void setAuthor(AuthorBean author) {
                        this.author = author;
                    }

                    public CoverBean getCover() {
                        return cover;
                    }

                    public void setCover(CoverBean cover) {
                        this.cover = cover;
                    }

                    public String getPlayUrl() {
                        return playUrl;
                    }

                    public void setPlayUrl(String playUrl) {
                        this.playUrl = playUrl;
                    }

                    public Object getThumbPlayUrl() {
                        return thumbPlayUrl;
                    }

                    public void setThumbPlayUrl(Object thumbPlayUrl) {
                        this.thumbPlayUrl = thumbPlayUrl;
                    }

                    public int getDuration() {
                        return duration;
                    }

                    public void setDuration(int duration) {
                        this.duration = duration;
                    }

                    public WebUrlBean getWebUrl() {
                        return webUrl;
                    }

                    public void setWebUrl(WebUrlBean webUrl) {
                        this.webUrl = webUrl;
                    }

                    public long getReleaseTime() {
                        return releaseTime;
                    }

                    public void setReleaseTime(long releaseTime) {
                        this.releaseTime = releaseTime;
                    }

                    public Object getCampaign() {
                        return campaign;
                    }

                    public void setCampaign(Object campaign) {
                        this.campaign = campaign;
                    }

                    public Object getWaterMarks() {
                        return waterMarks;
                    }

                    public void setWaterMarks(Object waterMarks) {
                        this.waterMarks = waterMarks;
                    }

                    public boolean isAd() {
                        return ad;
                    }

                    public void setAd(boolean ad) {
                        this.ad = ad;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public Object getTitlePgc() {
                        return titlePgc;
                    }

                    public void setTitlePgc(Object titlePgc) {
                        this.titlePgc = titlePgc;
                    }

                    public Object getDescriptionPgc() {
                        return descriptionPgc;
                    }

                    public void setDescriptionPgc(Object descriptionPgc) {
                        this.descriptionPgc = descriptionPgc;
                    }

                    public String getRemark() {
                        return remark;
                    }

                    public void setRemark(String remark) {
                        this.remark = remark;
                    }

                    public boolean isIfLimitVideo() {
                        return ifLimitVideo;
                    }

                    public void setIfLimitVideo(boolean ifLimitVideo) {
                        this.ifLimitVideo = ifLimitVideo;
                    }

                    public int getSearchWeight() {
                        return searchWeight;
                    }

                    public void setSearchWeight(int searchWeight) {
                        this.searchWeight = searchWeight;
                    }

                    public Object getBrandWebsiteInfo() {
                        return brandWebsiteInfo;
                    }

                    public void setBrandWebsiteInfo(Object brandWebsiteInfo) {
                        this.brandWebsiteInfo = brandWebsiteInfo;
                    }

                    public int getIdx() {
                        return idx;
                    }

                    public void setIdx(int idx) {
                        this.idx = idx;
                    }

                    public Object getShareAdTrack() {
                        return shareAdTrack;
                    }

                    public void setShareAdTrack(Object shareAdTrack) {
                        this.shareAdTrack = shareAdTrack;
                    }

                    public Object getFavoriteAdTrack() {
                        return favoriteAdTrack;
                    }

                    public void setFavoriteAdTrack(Object favoriteAdTrack) {
                        this.favoriteAdTrack = favoriteAdTrack;
                    }

                    public Object getWebAdTrack() {
                        return webAdTrack;
                    }

                    public void setWebAdTrack(Object webAdTrack) {
                        this.webAdTrack = webAdTrack;
                    }

                    public long getDate() {
                        return date;
                    }

                    public void setDate(long date) {
                        this.date = date;
                    }

                    public Object getPromotion() {
                        return promotion;
                    }

                    public void setPromotion(Object promotion) {
                        this.promotion = promotion;
                    }

                    public Object getLabel() {
                        return label;
                    }

                    public void setLabel(Object label) {
                        this.label = label;
                    }

                    public String getDescriptionEditor() {
                        return descriptionEditor;
                    }

                    public void setDescriptionEditor(String descriptionEditor) {
                        this.descriptionEditor = descriptionEditor;
                    }

                    public boolean isCollected() {
                        return collected;
                    }

                    public void setCollected(boolean collected) {
                        this.collected = collected;
                    }

                    public boolean isReallyCollected() {
                        return reallyCollected;
                    }

                    public void setReallyCollected(boolean reallyCollected) {
                        this.reallyCollected = reallyCollected;
                    }

                    public boolean isPlayed() {
                        return played;
                    }

                    public void setPlayed(boolean played) {
                        this.played = played;
                    }

                    public Object getLastViewTime() {
                        return lastViewTime;
                    }

                    public void setLastViewTime(Object lastViewTime) {
                        this.lastViewTime = lastViewTime;
                    }

                    public Object getPlaylists() {
                        return playlists;
                    }

                    public void setPlaylists(Object playlists) {
                        this.playlists = playlists;
                    }

                    public int getSrc() {
                        return src;
                    }

                    public void setSrc(int src) {
                        this.src = src;
                    }

                    public String getRecallSource() {
                        return recallSource;
                    }

                    public void setRecallSource(String recallSource) {
                        this.recallSource = recallSource;
                    }

                    public List<TagsBean> getTags() {
                        return tags;
                    }

                    public void setTags(List<TagsBean> tags) {
                        this.tags = tags;
                    }

                    public List<PlayInfoBean> getPlayInfo() {
                        return playInfo;
                    }

                    public void setPlayInfo(List<PlayInfoBean> playInfo) {
                        this.playInfo = playInfo;
                    }

                    public List<?> getAdTrack() {
                        return adTrack;
                    }

                    public void setAdTrack(List<?> adTrack) {
                        this.adTrack = adTrack;
                    }

                    public List<?> getLabelList() {
                        return labelList;
                    }

                    public void setLabelList(List<?> labelList) {
                        this.labelList = labelList;
                    }

                    public List<?> getSubtitles() {
                        return subtitles;
                    }

                    public void setSubtitles(List<?> subtitles) {
                        this.subtitles = subtitles;
                    }

                    public static class ConsumptionBean {
                        /**
                         * collectionCount : 9717
                         * shareCount : 7855
                         * replyCount : 161
                         * realCollectionCount : 91
                         */

                        private int collectionCount;
                        private int shareCount;
                        private int replyCount;
                        private int realCollectionCount;

                        public int getCollectionCount() {
                            return collectionCount;
                        }

                        public void setCollectionCount(int collectionCount) {
                            this.collectionCount = collectionCount;
                        }

                        public int getShareCount() {
                            return shareCount;
                        }

                        public void setShareCount(int shareCount) {
                            this.shareCount = shareCount;
                        }

                        public int getReplyCount() {
                            return replyCount;
                        }

                        public void setReplyCount(int replyCount) {
                            this.replyCount = replyCount;
                        }

                        public int getRealCollectionCount() {
                            return realCollectionCount;
                        }

                        public void setRealCollectionCount(int realCollectionCount) {
                            this.realCollectionCount = realCollectionCount;
                        }
                    }

                    public static class ProviderBean {
                        /**
                         * name : PGC
                         * alias : PGC
                         * icon :
                         */

                        private String name;
                        private String alias;
                        private String icon;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getAlias() {
                            return alias;
                        }

                        public void setAlias(String alias) {
                            this.alias = alias;
                        }

                        public String getIcon() {
                            return icon;
                        }

                        public void setIcon(String icon) {
                            this.icon = icon;
                        }
                    }

                    public static class AuthorBean {
                        /**
                         * id : 22
                         * icon : http://img.kaiyanapp.com/2faf2139c4b655e56a54bdb2ee06e0b4.jpeg
                         * name : 日食记
                         * description : 治愈你心和胃的日食记：）  快加我的微信公众号【日食记】，否则我就……求求你加我！  微博 @日食记 @酥饼大人
                         * link : http://weibo.com/rishiji?from=myfollow_all
                         * latestReleaseTime : 1589270862000
                         * videoNum : 319
                         * adTrack : null
                         * follow : {"itemType":"author","itemId":22,"followed":false}
                         * shield : {"itemType":"author","itemId":22,"shielded":false}
                         * approvedNotReadyVideoCount : 0
                         * ifPgc : true
                         * recSort : 0
                         * expert : false
                         */

                        private int id;
                        private String icon;
                        private String name;
                        private String description;
                        private String link;
                        private long latestReleaseTime;
                        private int videoNum;
                        private Object adTrack;
                        private FollowBean follow;
                        private ShieldBean shield;
                        private int approvedNotReadyVideoCount;
                        private boolean ifPgc;
                        private int recSort;
                        private boolean expert;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getIcon() {
                            return icon;
                        }

                        public void setIcon(String icon) {
                            this.icon = icon;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public String getLink() {
                            return link;
                        }

                        public void setLink(String link) {
                            this.link = link;
                        }

                        public long getLatestReleaseTime() {
                            return latestReleaseTime;
                        }

                        public void setLatestReleaseTime(long latestReleaseTime) {
                            this.latestReleaseTime = latestReleaseTime;
                        }

                        public int getVideoNum() {
                            return videoNum;
                        }

                        public void setVideoNum(int videoNum) {
                            this.videoNum = videoNum;
                        }

                        public Object getAdTrack() {
                            return adTrack;
                        }

                        public void setAdTrack(Object adTrack) {
                            this.adTrack = adTrack;
                        }

                        public FollowBean getFollow() {
                            return follow;
                        }

                        public void setFollow(FollowBean follow) {
                            this.follow = follow;
                        }

                        public ShieldBean getShield() {
                            return shield;
                        }

                        public void setShield(ShieldBean shield) {
                            this.shield = shield;
                        }

                        public int getApprovedNotReadyVideoCount() {
                            return approvedNotReadyVideoCount;
                        }

                        public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
                            this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                        }

                        public boolean isIfPgc() {
                            return ifPgc;
                        }

                        public void setIfPgc(boolean ifPgc) {
                            this.ifPgc = ifPgc;
                        }

                        public int getRecSort() {
                            return recSort;
                        }

                        public void setRecSort(int recSort) {
                            this.recSort = recSort;
                        }

                        public boolean isExpert() {
                            return expert;
                        }

                        public void setExpert(boolean expert) {
                            this.expert = expert;
                        }

                        public static class FollowBean {
                            /**
                             * itemType : author
                             * itemId : 22
                             * followed : false
                             */

                            private String itemType;
                            private int itemId;
                            private boolean followed;

                            public String getItemType() {
                                return itemType;
                            }

                            public void setItemType(String itemType) {
                                this.itemType = itemType;
                            }

                            public int getItemId() {
                                return itemId;
                            }

                            public void setItemId(int itemId) {
                                this.itemId = itemId;
                            }

                            public boolean isFollowed() {
                                return followed;
                            }

                            public void setFollowed(boolean followed) {
                                this.followed = followed;
                            }
                        }

                        public static class ShieldBean {
                            /**
                             * itemType : author
                             * itemId : 22
                             * shielded : false
                             */

                            private String itemType;
                            private int itemId;
                            private boolean shielded;

                            public String getItemType() {
                                return itemType;
                            }

                            public void setItemType(String itemType) {
                                this.itemType = itemType;
                            }

                            public int getItemId() {
                                return itemId;
                            }

                            public void setItemId(int itemId) {
                                this.itemId = itemId;
                            }

                            public boolean isShielded() {
                                return shielded;
                            }

                            public void setShielded(boolean shielded) {
                                this.shielded = shielded;
                            }
                        }
                    }

                    public static class CoverBean {
                        /**
                         * feed : http://img.kaiyanapp.com/923c833ede7c0e7bec8733006a4e32f8.jpeg?imageMogr2/quality/100
                         * detail : http://img.kaiyanapp.com/923c833ede7c0e7bec8733006a4e32f8.jpeg?imageMogr2/quality/100
                         * blurred : http://img.kaiyanapp.com/37f01792333687981c70935927b043b8.jpeg?imageMogr2/quality/100
                         * sharing : null
                         * homepage : null
                         */

                        private String feed;
                        private String detail;
                        private String blurred;
                        private Object sharing;
                        private Object homepage;

                        public String getFeed() {
                            return feed;
                        }

                        public void setFeed(String feed) {
                            this.feed = feed;
                        }

                        public String getDetail() {
                            return detail;
                        }

                        public void setDetail(String detail) {
                            this.detail = detail;
                        }

                        public String getBlurred() {
                            return blurred;
                        }

                        public void setBlurred(String blurred) {
                            this.blurred = blurred;
                        }

                        public Object getSharing() {
                            return sharing;
                        }

                        public void setSharing(Object sharing) {
                            this.sharing = sharing;
                        }

                        public Object getHomepage() {
                            return homepage;
                        }

                        public void setHomepage(Object homepage) {
                            this.homepage = homepage;
                        }
                    }

                    public static class WebUrlBean {
                        /**
                         * raw : http://www.eyepetizer.net/detail.html?vid=5622
                         * forWeibo : http://wandou.im/1jat49
                         */

                        private String raw;
                        private String forWeibo;

                        public String getRaw() {
                            return raw;
                        }

                        public void setRaw(String raw) {
                            this.raw = raw;
                        }

                        public String getForWeibo() {
                            return forWeibo;
                        }

                        public void setForWeibo(String forWeibo) {
                            this.forWeibo = forWeibo;
                        }
                    }

                    public static class TagsBean {
                        /**
                         * id : 20
                         * name : 风味市集
                         * actionUrl : eyepetizer://tag/20/?title=%E9%A3%8E%E5%91%B3%E5%B8%82%E9%9B%86
                         * adTrack : null
                         * desc : 每日美食实验，带你感受味觉巅峰瞬间
                         * bgPicture : http://img.kaiyanapp.com/2c869d91d5db6ecf1c8c46af0f448719.png?imageMogr2/quality/60/format/jpg
                         * headerImage : http://img.kaiyanapp.com/5748574edf96949c04ad382c46a4a2fd.png?imageMogr2/quality/60/format/jpg
                         * tagRecType : IMPORTANT
                         * childTagList : null
                         * childTagIdList : null
                         * haveReward : false
                         * ifNewest : false
                         * newestEndTime : null
                         * communityIndex : 0
                         */

                        private int id;
                        private String name;
                        private String actionUrl;
                        private Object adTrack;
                        private String desc;
                        private String bgPicture;
                        private String headerImage;
                        private String tagRecType;
                        private Object childTagList;
                        private Object childTagIdList;
                        private boolean haveReward;
                        private boolean ifNewest;
                        private Object newestEndTime;
                        private int communityIndex;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(String actionUrl) {
                            this.actionUrl = actionUrl;
                        }

                        public Object getAdTrack() {
                            return adTrack;
                        }

                        public void setAdTrack(Object adTrack) {
                            this.adTrack = adTrack;
                        }

                        public String getDesc() {
                            return desc;
                        }

                        public void setDesc(String desc) {
                            this.desc = desc;
                        }

                        public String getBgPicture() {
                            return bgPicture;
                        }

                        public void setBgPicture(String bgPicture) {
                            this.bgPicture = bgPicture;
                        }

                        public String getHeaderImage() {
                            return headerImage;
                        }

                        public void setHeaderImage(String headerImage) {
                            this.headerImage = headerImage;
                        }

                        public String getTagRecType() {
                            return tagRecType;
                        }

                        public void setTagRecType(String tagRecType) {
                            this.tagRecType = tagRecType;
                        }

                        public Object getChildTagList() {
                            return childTagList;
                        }

                        public void setChildTagList(Object childTagList) {
                            this.childTagList = childTagList;
                        }

                        public Object getChildTagIdList() {
                            return childTagIdList;
                        }

                        public void setChildTagIdList(Object childTagIdList) {
                            this.childTagIdList = childTagIdList;
                        }

                        public boolean isHaveReward() {
                            return haveReward;
                        }

                        public void setHaveReward(boolean haveReward) {
                            this.haveReward = haveReward;
                        }

                        public boolean isIfNewest() {
                            return ifNewest;
                        }

                        public void setIfNewest(boolean ifNewest) {
                            this.ifNewest = ifNewest;
                        }

                        public Object getNewestEndTime() {
                            return newestEndTime;
                        }

                        public void setNewestEndTime(Object newestEndTime) {
                            this.newestEndTime = newestEndTime;
                        }

                        public int getCommunityIndex() {
                            return communityIndex;
                        }

                        public void setCommunityIndex(int communityIndex) {
                            this.communityIndex = communityIndex;
                        }
                    }

                    public static class PlayInfoBean {
                        /**
                         * height : 480
                         * width : 854
                         * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss","size":17648342},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=ucloud&playUrlType=url_oss","size":17648342}]
                         * name : 标清
                         * type : normal
                         * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss
                         */

                        private int height;
                        private int width;
                        private String name;
                        private String type;
                        private String url;
                        private List<UrlListBean> urlList;

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public List<UrlListBean> getUrlList() {
                            return urlList;
                        }

                        public void setUrlList(List<UrlListBean> urlList) {
                            this.urlList = urlList;
                        }

                        public static class UrlListBean {
                            /**
                             * name : aliyun
                             * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=5622&resourceType=video&editionType=normal&source=aliyun&playUrlType=url_oss
                             * size : 17648342
                             */

                            private String name;
                            private String url;
                            private int size;

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public int getSize() {
                                return size;
                            }

                            public void setSize(int size) {
                                this.size = size;
                            }
                        }
                    }
                }
            }

            public static class TagsBean{

                /**
                 * id : 751
                 * name : 超萌动物在哪里
                 * actionUrl : eyepetizer://tag/751/?title=%E8%B6%85%E8%90%8C%E5%8A%A8%E7%89%A9%E5%9C%A8%E5%93%AA%E9%87%8C
                 * adTrack : null
                 * desc : null
                 * bgPicture : http://img.kaiyanapp.com/9b3846ea47ba8916b19e4cf2b9c17e78.jpeg?imageMogr2/quality/60/format/jpg
                 * headerImage : http://img.kaiyanapp.com/9b3846ea47ba8916b19e4cf2b9c17e78.jpeg?imageMogr2/quality/60/format/jpg
                 * tagRecType : NORMAL
                 * childTagList : null
                 * childTagIdList : null
                 * haveReward : false
                 * ifNewest : false
                 * newestEndTime : null
                 * communityIndex : 0
                 */

                private int id;
                private String name;
                private String actionUrl;
                private Object adTrack;
                private Object desc;
                private String bgPicture;
                private String headerImage;
                private String tagRecType;
                private Object childTagList;
                private Object childTagIdList;
                private boolean haveReward;
                private boolean ifNewest;
                private Object newestEndTime;
                private int communityIndex;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public Object getDesc() {
                    return desc;
                }

                public void setDesc(Object desc) {
                    this.desc = desc;
                }

                public String getBgPicture() {
                    return bgPicture;
                }

                public void setBgPicture(String bgPicture) {
                    this.bgPicture = bgPicture;
                }

                public String getHeaderImage() {
                    return headerImage;
                }

                public void setHeaderImage(String headerImage) {
                    this.headerImage = headerImage;
                }

                public String getTagRecType() {
                    return tagRecType;
                }

                public void setTagRecType(String tagRecType) {
                    this.tagRecType = tagRecType;
                }

                public Object getChildTagList() {
                    return childTagList;
                }

                public void setChildTagList(Object childTagList) {
                    this.childTagList = childTagList;
                }

                public Object getChildTagIdList() {
                    return childTagIdList;
                }

                public void setChildTagIdList(Object childTagIdList) {
                    this.childTagIdList = childTagIdList;
                }

                public boolean isHaveReward() {
                    return haveReward;
                }

                public void setHaveReward(boolean haveReward) {
                    this.haveReward = haveReward;
                }

                public boolean isIfNewest() {
                    return ifNewest;
                }

                public void setIfNewest(boolean ifNewest) {
                    this.ifNewest = ifNewest;
                }

                public Object getNewestEndTime() {
                    return newestEndTime;
                }

                public void setNewestEndTime(Object newestEndTime) {
                    this.newestEndTime = newestEndTime;
                }

                public int getCommunityIndex() {
                    return communityIndex;
                }

                public void setCommunityIndex(int communityIndex) {
                    this.communityIndex = communityIndex;
                }
            }

            public static class AuthorBean{

                /**
                 * id : 2162
                 * icon : http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg
                 * name : 开眼广告精选
                 * description : 为广告人的精彩创意点赞
                 * link :
                 * latestReleaseTime : 1589331630000
                 * videoNum : 1330
                 * adTrack : null
                 * follow : {"itemType":"author","itemId":2162,"followed":false}
                 * shield : {"itemType":"author","itemId":2162,"shielded":false}
                 * approvedNotReadyVideoCount : 0
                 * ifPgc : true
                 * recSort : 0
                 * expert : false
                 */

                private int id;
                private String icon;
                private String name;
                private String description;
                private String link;
                private long latestReleaseTime;
                private int videoNum;
                private Object adTrack;
                private FollowBean follow;
                private ShieldBean shield;
                private int approvedNotReadyVideoCount;
                private boolean ifPgc;
                private int recSort;
                private boolean expert;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public long getLatestReleaseTime() {
                    return latestReleaseTime;
                }

                public void setLatestReleaseTime(long latestReleaseTime) {
                    this.latestReleaseTime = latestReleaseTime;
                }

                public int getVideoNum() {
                    return videoNum;
                }

                public void setVideoNum(int videoNum) {
                    this.videoNum = videoNum;
                }

                public Object getAdTrack() {
                    return adTrack;
                }

                public void setAdTrack(Object adTrack) {
                    this.adTrack = adTrack;
                }

                public FollowBean getFollow() {
                    return follow;
                }

                public void setFollow(FollowBean follow) {
                    this.follow = follow;
                }

                public ShieldBean getShield() {
                    return shield;
                }

                public void setShield(ShieldBean shield) {
                    this.shield = shield;
                }

                public int getApprovedNotReadyVideoCount() {
                    return approvedNotReadyVideoCount;
                }

                public void setApprovedNotReadyVideoCount(int approvedNotReadyVideoCount) {
                    this.approvedNotReadyVideoCount = approvedNotReadyVideoCount;
                }

                public boolean isIfPgc() {
                    return ifPgc;
                }

                public void setIfPgc(boolean ifPgc) {
                    this.ifPgc = ifPgc;
                }

                public int getRecSort() {
                    return recSort;
                }

                public void setRecSort(int recSort) {
                    this.recSort = recSort;
                }

                public boolean isExpert() {
                    return expert;
                }

                public void setExpert(boolean expert) {
                    this.expert = expert;
                }

                public static class FollowBean {
                    /**
                     * itemType : author
                     * itemId : 2162
                     * followed : false
                     */

                    private String itemType;
                    private int itemId;
                    private boolean followed;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isFollowed() {
                        return followed;
                    }

                    public void setFollowed(boolean followed) {
                        this.followed = followed;
                    }
                }

                public static class ShieldBean {
                    /**
                     * itemType : author
                     * itemId : 2162
                     * shielded : false
                     */

                    private String itemType;
                    private int itemId;
                    private boolean shielded;

                    public String getItemType() {
                        return itemType;
                    }

                    public void setItemType(String itemType) {
                        this.itemType = itemType;
                    }

                    public int getItemId() {
                        return itemId;
                    }

                    public void setItemId(int itemId) {
                        this.itemId = itemId;
                    }

                    public boolean isShielded() {
                        return shielded;
                    }

                    public void setShielded(boolean shielded) {
                        this.shielded = shielded;
                    }
                }
            }

            public static class CoverBean{

                /**
                 * feed : http://img.kaiyanapp.com/f2dcaf86a23cae97bd0af21b069507fb.jpeg?imageMogr2/quality/60
                 * detail : http://img.kaiyanapp.com/f2dcaf86a23cae97bd0af21b069507fb.jpeg?imageMogr2/quality/60
                 * blurred : http://img.kaiyanapp.com/984b51dd076c93b554131203fe8d9496.jpeg?imageMogr2/quality/60
                 * sharing : null
                 * homepage : null
                 */

                private String feed;
                private String detail;
                private String blurred;
                private Object sharing;
                private Object homepage;

                public String getFeed() {
                    return feed;
                }

                public void setFeed(String feed) {
                    this.feed = feed;
                }

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getBlurred() {
                    return blurred;
                }

                public void setBlurred(String blurred) {
                    this.blurred = blurred;
                }

                public Object getSharing() {
                    return sharing;
                }

                public void setSharing(Object sharing) {
                    this.sharing = sharing;
                }

                public Object getHomepage() {
                    return homepage;
                }

                public void setHomepage(Object homepage) {
                    this.homepage = homepage;
                }
            }

            public static class ConsumptionBean{

                /**
                 * collectionCount : 3797
                 * shareCount : 4457
                 * replyCount : 42
                 * realCollectionCount : 24
                 */

                private int collectionCount;
                private int shareCount;
                private int replyCount;
                private int realCollectionCount;

                public int getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(int collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getReplyCount() {
                    return replyCount;
                }

                public void setReplyCount(int replyCount) {
                    this.replyCount = replyCount;
                }

                public int getRealCollectionCount() {
                    return realCollectionCount;
                }

                public void setRealCollectionCount(int realCollectionCount) {
                    this.realCollectionCount = realCollectionCount;
                }
            }

        }

    }
}
