package com.example.eyepetizer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NominateModel {
    private String nextPageUrl;
    private int count;
    @SerializedName("itemList")
    private List<ItemEntity> lists;

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ItemEntity> getLists() {
        return lists;
    }

    public void setLists(List<ItemEntity> lists) {
        this.lists = lists;
    }

    public static class ItemEntity{
        private String type;
        @SerializedName("data")
        private DataEntity dataEntity;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataEntity getDataEntity() {
            return dataEntity;
        }

        public void setDataEntity(DataEntity dataEntity) {
            this.dataEntity = dataEntity;
        }

        public static class DataEntity{
            private String dataType;
            private String type;
            private String text;
            private String actionUrl;
            private int count;
            private String title;
            private String description;
            private String playUrl;
            @SerializedName("header")
            private Header header;
            @SerializedName("content")
            private Content content;
            @SerializedName("tags")
            private TagsBean tagsBean;
            @SerializedName("author")
            private AuthorBean authorBean;
            @SerializedName("cover")
            private CoverBean coverBean;
            @SerializedName("playInfo")
            private List<PlayInfoBean> playInfoBeans;
            @SerializedName("itemList")
            private List<ItemBean> itemBeans;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(String actionUrl) {
                this.actionUrl = actionUrl;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
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

            public String getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(String playUrl) {
                this.playUrl = playUrl;
            }

            public Header getHeader() {
                return header;
            }

            public void setHeader(Header header) {
                this.header = header;
            }

            public Content getContent() {
                return content;
            }

            public void setContent(Content content) {
                this.content = content;
            }

            public TagsBean getTagsBean() {
                return tagsBean;
            }

            public void setTagsBean(TagsBean tagsBean) {
                this.tagsBean = tagsBean;
            }

            public AuthorBean getAuthorBean() {
                return authorBean;
            }

            public void setAuthorBean(AuthorBean authorBean) {
                this.authorBean = authorBean;
            }

            public CoverBean getCoverBean() {
                return coverBean;
            }

            public void setCoverBean(CoverBean coverBean) {
                this.coverBean = coverBean;
            }

            public List<PlayInfoBean> getPlayInfoBeans() {
                return playInfoBeans;
            }

            public void setPlayInfoBeans(List<PlayInfoBean> playInfoBeans) {
                this.playInfoBeans = playInfoBeans;
            }

            public List<ItemBean> getItemBeans() {
                return itemBeans;
            }

            public void setItemBeans(List<ItemBean> itemBeans) {
                this.itemBeans = itemBeans;
            }

            public static class Header{
                private int id;
                private String title;
                private String subTitle;
                private String actionUrl;
                private String rightText;


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

                public String getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(String subTitle) {
                    this.subTitle = subTitle;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public String getRightText() {
                    return rightText;
                }

                public void setRightText(String rightText) {
                    this.rightText = rightText;
                }
            }
            public static class Content{

                private String type;
                private int id;
                @SerializedName("data")
                private DataBean dataBean;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public DataBean getDataBean() {
                    return dataBean;
                }

                public void setDataBean(DataBean dataBean) {
                    this.dataBean = dataBean;
                }

                public static class DataBean{
                    private String dataType;
                    private int id;
                    private String title;
                    private String description;
                    private ProviderBean provider;
                    private String category;
                    private AuthorBean author;
                    private CoverBean cover;
                    private String playUrl;
                    private int duration;
                    private long releaseTime;
                    private long date;
                    private List<PlayInfoBean> playInfo;

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

                    public int getDuration() {
                        return duration;
                    }

                    public void setDuration(int duration) {
                        this.duration = duration;
                    }

                    public long getReleaseTime() {
                        return releaseTime;
                    }

                    public void setReleaseTime(long releaseTime) {
                        this.releaseTime = releaseTime;
                    }

                    public long getDate() {
                        return date;
                    }

                    public void setDate(long date) {
                        this.date = date;
                    }

                    public List<PlayInfoBean> getPlayInfo() {
                        return playInfo;
                    }

                    public void setPlayInfo(List<PlayInfoBean> playInfo) {
                        this.playInfo = playInfo;
                    }


                    public static class ProviderBean {

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

                        private int id;
                        private String icon;
                        private String name;
                        private String description;
                        private String link;
                        private long latestReleaseTime;
                        private int videoNum;

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
                    }

                    public static class CoverBean {

                        private String feed;
                        private String detail;
                        private String blurred;

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

                    }

                    public static class PlayInfoBean {

                        private int height;
                        private int width;
                        private String name;
                        private String type;
                        private String url;

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
                    }
                }


            }
            public static class TagsBean {


                private int id;
                private String name;
                private String actionUrl;
                private String bgPicture;
                private String headerImage;
                private String tagRecType;

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

            }
            public static class AuthorBean{

                private int id;
                private String icon;
                private String name;
                private String description;

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
            }
            public static class CoverBean{

                private String feed;
                private String detail;
                private String blurred;

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
            }
            public static class PlayInfoBean{

                private int height;
                private int width;
                private String name;
                private String type;
                private String url;

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
            }
            public static class ItemBean{

                private String type;
                private DataBeanX data;
                private int id;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public DataBeanX getData() {
                    return data;
                }

                public void setData(DataBeanX data) {
                    this.data = data;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public static class DataBeanX {
                    /**
                     * dataType : FollowCard
                     * header : {"id":193991,"title":"疫情期间，如何在家用 5 天拍出一支广告","font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":"eyepetizer://pgc/detail/2162/?title=%E5%BC%80%E7%9C%BC%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89&userType=PGC&tabIndex=1","labelList":null,"rightText":null,"icon":"http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg","iconType":"round","description":null,"time":1589158821000,"showHateVideo":false}
                     * content : {"type":"video","data":{"dataType":"VideoBeanForClient","id":193991,"title":"疫情期间，如何在家用 5 天拍出一支广告","description":"广告人们，疫情期间该如何拍广告呢？这支短片记录了国外一支团队在家拍了一支看起来还不错的广告，得到了客户的点赞。果然人的执行力都是被逼出来的。From Connor Martin","library":"DAILY","tags":[{"id":1155,"name":"关于新型冠状病毒","actionUrl":"eyepetizer://tag/1155/?title=%E5%85%B3%E4%BA%8E%E6%96%B0%E5%9E%8B%E5%86%A0%E7%8A%B6%E7%97%85%E6%AF%92","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":"为广告人的精彩创意点赞","bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":542,"shareCount":217,"replyCount":4,"realCollectionCount":192},"resourceType":"video","slogan":null,"provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"广告","author":{"id":2162,"icon":"http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg","name":"开眼广告精选","description":"为广告人的精彩创意点赞","link":"","latestReleaseTime":1589158821000,"videoNum":1328,"adTrack":null,"follow":{"itemType":"author","itemId":2162,"followed":false},"shield":{"itemType":"author","itemId":2162,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/90ee723135e01df65419c4a9b43347ac.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":134,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=193991","forWeibo":"http://www.eyepetizer.net/detail.html?vid=193991&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589158821000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":15773495},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":15773495}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1589158800000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"广告人们，疫情期间该如何拍广告呢？这支短片记录了国外一支团队在家拍了一支看起来还不错的广告，得到了客户的点赞。果然人的执行力都是被逼出来的。From Connor Martin","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null},"tag":null,"id":0,"adIndex":-1}
                     * adTrack : []
                     */

                    private String dataType;
                    private HeaderBean header;
                    private ContentBean content;
                    private List<?> adTrack;

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
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

                    public List<?> getAdTrack() {
                        return adTrack;
                    }

                    public void setAdTrack(List<?> adTrack) {
                        this.adTrack = adTrack;
                    }

                    public static class HeaderBean {
                        /**
                         * id : 193991
                         * title : 疫情期间，如何在家用 5 天拍出一支广告
                         * font : null
                         * subTitle : null
                         * subTitleFont : null
                         * textAlign : left
                         * cover : null
                         * label : null
                         * actionUrl : eyepetizer://pgc/detail/2162/?title=%E5%BC%80%E7%9C%BC%E5%B9%BF%E5%91%8A%E7%B2%BE%E9%80%89&userType=PGC&tabIndex=1
                         * labelList : null
                         * rightText : null
                         * icon : http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg
                         * iconType : round
                         * description : null
                         * time : 1589158821000
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
                        private Object description;
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

                        public Object getDescription() {
                            return description;
                        }

                        public void setDescription(Object description) {
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

                    public static class ContentBean {
                        /**
                         * type : video
                         * data : {"dataType":"VideoBeanForClient","id":193991,"title":"疫情期间，如何在家用 5 天拍出一支广告","description":"广告人们，疫情期间该如何拍广告呢？这支短片记录了国外一支团队在家拍了一支看起来还不错的广告，得到了客户的点赞。果然人的执行力都是被逼出来的。From Connor Martin","library":"DAILY","tags":[{"id":1155,"name":"关于新型冠状病毒","actionUrl":"eyepetizer://tag/1155/?title=%E5%85%B3%E4%BA%8E%E6%96%B0%E5%9E%8B%E5%86%A0%E7%8A%B6%E7%97%85%E6%AF%92","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":"为广告人的精彩创意点赞","bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":542,"shareCount":217,"replyCount":4,"realCollectionCount":192},"resourceType":"video","slogan":null,"provider":{"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"},"category":"广告","author":{"id":2162,"icon":"http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg","name":"开眼广告精选","description":"为广告人的精彩创意点赞","link":"","latestReleaseTime":1589158821000,"videoNum":1328,"adTrack":null,"follow":{"itemType":"author","itemId":2162,"followed":false},"shield":{"itemType":"author","itemId":2162,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/90ee723135e01df65419c4a9b43347ac.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":134,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=193991","forWeibo":"http://www.eyepetizer.net/detail.html?vid=193991&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589158821000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":15773495},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":15773495}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":null,"ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1589158800000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"广告人们，疫情期间该如何拍广告呢？这支短片记录了国外一支团队在家拍了一支看起来还不错的广告，得到了客户的点赞。果然人的执行力都是被逼出来的。From Connor Martin","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null}
                         * tag : null
                         * id : 0
                         * adIndex : -1
                         */

                        private String type;
                        private DataBean data;
                        private Object tag;
                        private int id;
                        private int adIndex;

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

                        public static class DataBean {
                            /**
                             * dataType : VideoBeanForClient
                             * id : 193991
                             * title : 疫情期间，如何在家用 5 天拍出一支广告
                             * description : 广告人们，疫情期间该如何拍广告呢？这支短片记录了国外一支团队在家拍了一支看起来还不错的广告，得到了客户的点赞。果然人的执行力都是被逼出来的。From Connor Martin
                             * library : DAILY
                             * tags : [{"id":1155,"name":"关于新型冠状病毒","actionUrl":"eyepetizer://tag/1155/?title=%E5%85%B3%E4%BA%8E%E6%96%B0%E5%9E%8B%E5%86%A0%E7%8A%B6%E7%97%85%E6%AF%92","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":758,"name":"欧美广告","actionUrl":"eyepetizer://tag/758/?title=%E6%AC%A7%E7%BE%8E%E5%B9%BF%E5%91%8A","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/4347ee94f8ae98a86f2913db3b8638f3.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/8494d3626c41f8e8cb6316767cc0f573.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":16,"name":"广告","actionUrl":"eyepetizer://tag/16/?title=%E5%B9%BF%E5%91%8A","adTrack":null,"desc":"为广告人的精彩创意点赞","bgPicture":"http://img.kaiyanapp.com/e41e74fe73882b552de00d95d56748d2.jpeg?imageMogr2/quality/60","headerImage":"http://img.kaiyanapp.com/3054658dbd559ac42c4c282e9cab7a32.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}]
                             * consumption : {"collectionCount":542,"shareCount":217,"replyCount":4,"realCollectionCount":192}
                             * resourceType : video
                             * slogan : null
                             * provider : {"name":"Vimeo","alias":"vimeo","icon":"http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png"}
                             * category : 广告
                             * author : {"id":2162,"icon":"http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg","name":"开眼广告精选","description":"为广告人的精彩创意点赞","link":"","latestReleaseTime":1589158821000,"videoNum":1328,"adTrack":null,"follow":{"itemType":"author","itemId":2162,"followed":false},"shield":{"itemType":"author","itemId":2162,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
                             * cover : {"feed":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/90ee723135e01df65419c4a9b43347ac.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
                             * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss
                             * thumbPlayUrl : null
                             * duration : 134
                             * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=193991","forWeibo":"http://www.eyepetizer.net/detail.html?vid=193991&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"}
                             * releaseTime : 1589158821000
                             * playInfo : [{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":15773495},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":15773495}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}]
                             * campaign : null
                             * waterMarks : null
                             * ad : false
                             * adTrack : []
                             * type : NORMAL
                             * titlePgc : null
                             * descriptionPgc : null
                             * remark : null
                             * ifLimitVideo : false
                             * searchWeight : 0
                             * brandWebsiteInfo : null
                             * idx : 0
                             * shareAdTrack : null
                             * favoriteAdTrack : null
                             * webAdTrack : null
                             * date : 1589158800000
                             * promotion : null
                             * label : null
                             * labelList : []
                             * descriptionEditor : 广告人们，疫情期间该如何拍广告呢？这支短片记录了国外一支团队在家拍了一支看起来还不错的广告，得到了客户的点赞。果然人的执行力都是被逼出来的。From Connor Martin
                             * collected : false
                             * reallyCollected : false
                             * played : false
                             * subtitles : []
                             * lastViewTime : null
                             * playlists : null
                             * src : null
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
                            private Object remark;
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
                            private Object src;
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

                            public Object getRemark() {
                                return remark;
                            }

                            public void setRemark(Object remark) {
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

                            public Object getSrc() {
                                return src;
                            }

                            public void setSrc(Object src) {
                                this.src = src;
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
                                 * collectionCount : 542
                                 * shareCount : 217
                                 * replyCount : 4
                                 * realCollectionCount : 192
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
                                 * name : Vimeo
                                 * alias : vimeo
                                 * icon : http://img.kaiyanapp.com/c3ad630be461cbb081649c9e21d6cbe3.png
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
                                 * id : 2162
                                 * icon : http://img.kaiyanapp.com/98beab66d3885a139b54f21e91817c4f.jpeg
                                 * name : 开眼广告精选
                                 * description : 为广告人的精彩创意点赞
                                 * link :
                                 * latestReleaseTime : 1589158821000
                                 * videoNum : 1328
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

                            public static class CoverBean {
                                /**
                                 * feed : http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg
                                 * detail : http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageMogr2/quality/60/format/jpg
                                 * blurred : http://img.kaiyanapp.com/90ee723135e01df65419c4a9b43347ac.jpeg?imageMogr2/quality/60/format/jpg
                                 * sharing : null
                                 * homepage : http://img.kaiyanapp.com/c9e0d5eef7b137e9d2fd65fbadba4162.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
                                 */

                                private String feed;
                                private String detail;
                                private String blurred;
                                private Object sharing;
                                private String homepage;

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

                                public String getHomepage() {
                                    return homepage;
                                }

                                public void setHomepage(String homepage) {
                                    this.homepage = homepage;
                                }
                            }

                            public static class WebUrlBean {
                                /**
                                 * raw : http://www.eyepetizer.net/detail.html?vid=193991
                                 * forWeibo : http://www.eyepetizer.net/detail.html?vid=193991&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0
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
                                 * id : 1155
                                 * name : 关于新型冠状病毒
                                 * actionUrl : eyepetizer://tag/1155/?title=%E5%85%B3%E4%BA%8E%E6%96%B0%E5%9E%8B%E5%86%A0%E7%8A%B6%E7%97%85%E6%AF%92
                                 * adTrack : null
                                 * desc : null
                                 * bgPicture : http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg
                                 * headerImage : http://img.kaiyanapp.com/c35e2324a3595a87209ef06c2e686d40.png?imageMogr2/quality/60/format/jpg
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

                            public static class PlayInfoBean {
                                /**
                                 * height : 720
                                 * width : 1280
                                 * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":15773495},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":15773495}]
                                 * name : 高清
                                 * type : high
                                 * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss
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
                                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=193991&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss
                                     * size : 15773495
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
                }
            }

        }
    }

}
