package com.example.eyepetizer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FindMoreModel {
    private int count;
    private List<ItemListBeanX> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ItemListBeanX> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBeanX> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBeanX {

        private String type;
        private DataBeanX data;

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

        public static class DataBeanX {

            private String dataType;
            private int count;
            private int id;
            private String icon;
            private String image;
            private String title;
            private String type;
            private String actionUrl;
            private String text;
            private List<ItemListBean> itemList;
            private Header header;
            private String description;
            private String library;
            private ConsumptionBean consumption;
            private String resourceType;
            private ProviderBean provider;
            private String category;
            private AuthorBean author;
            private CoverBean cover;
            private String playUrl;
            private int duration;
            private WebUrlBean webUrl;
            private long releaseTime;
            private boolean ad;
            private boolean ifLimitVideo;
            private int searchWeight;
            private int idx;
            private long date;
            private String descriptionEditor;
            private boolean collected;
            private boolean reallyCollected;
            private boolean played;
            private List<TagsBean> tags;
            private List<PlayInfoBean> playInfo;

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(String actionUrl) {
                this.actionUrl = actionUrl;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public Header getHeader() {
                return header;
            }

            public void setHeader(Header header) {
                this.header = header;
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

            public boolean isAd() {
                return ad;
            }

            public void setAd(boolean ad) {
                this.ad = ad;
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

            public int getIdx() {
                return idx;
            }

            public void setIdx(int idx) {
                this.idx = idx;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
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

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public void setPlayed(boolean played) {
                this.played = played;
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

            public static class ItemListBean {

                private String type;
                private DataBean data;
                private int id;

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

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public static class DataBean {

                    private String dataType;
                    private int id;
                    private String title;
                    private String description;
                    private String image;
                    private String actionUrl;
                    private boolean shade;
                    private HeaderBean header;
                    private boolean autoPlay;

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

                    public String getImage() {
                        return image;
                    }

                    public void setImage(String image) {
                        this.image = image;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }

                    public boolean isShade() {
                        return shade;
                    }

                    public void setShade(boolean shade) {
                        this.shade = shade;
                    }

                    public HeaderBean getHeader() {
                        return header;
                    }

                    public void setHeader(HeaderBean header) {
                        this.header = header;
                    }

                    public boolean isAutoPlay() {
                        return autoPlay;
                    }

                    public void setAutoPlay(boolean autoPlay) {
                        this.autoPlay = autoPlay;
                    }

                    public static class HeaderBean {

                        private int id;
                        private String title;
                        private String font;
                        private String subTitle;
                        private String subTitleFont;
                        private String textAlign;
                        private String cover;
                        private String label;
                        private String actionUrl;
                        private String rightText;
                        private String icon;
                        private String description;

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

                        public String getFont() {
                            return font;
                        }

                        public void setFont(String font) {
                            this.font = font;
                        }

                        public String getSubTitle() {
                            return subTitle;
                        }

                        public void setSubTitle(String subTitle) {
                            this.subTitle = subTitle;
                        }

                        public String getSubTitleFont() {
                            return subTitleFont;
                        }

                        public void setSubTitleFont(String subTitleFont) {
                            this.subTitleFont = subTitleFont;
                        }

                        public String getTextAlign() {
                            return textAlign;
                        }

                        public void setTextAlign(String textAlign) {
                            this.textAlign = textAlign;
                        }

                        public String getCover() {
                            return cover;
                        }

                        public void setCover(String cover) {
                            this.cover = cover;
                        }

                        public String getLabel() {
                            return label;
                        }

                        public void setLabel(String label) {
                            this.label = label;
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

                        public String getIcon() {
                            return icon;
                        }

                        public void setIcon(String icon) {
                            this.icon = icon;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }
                    }
                }
            }

            public static class Header{

                private int id;
                private String title;
                private String font;
                private String subTitle;
                private String textAlign;
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

                public String getFont() {
                    return font;
                }

                public void setFont(String font) {
                    this.font = font;
                }

                public String getTextAlign() {
                    return textAlign;
                }

                public String getSubTitle() {
                    return subTitle;
                }

                public void setSubTitle(String subTitle) {
                    this.subTitle = subTitle;
                }

                public void setTextAlign(String textAlign) {
                    this.textAlign = textAlign;
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

            public static class ConsumptionBean {

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

                @SerializedName("id")
                private int idX;
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

                public int getIdX() {
                    return idX;
                }

                public void setIdX(int idX) {
                    this.idX = idX;
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
                     * itemId : 2164
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
                     * itemId : 2164
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

                private String feed;
                private String detail;
                private String blurred;
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

                public String getHomepage() {
                    return homepage;
                }

                public void setHomepage(String homepage) {
                    this.homepage = homepage;
                }
            }

            public static class WebUrlBean {

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

                @SerializedName("id")
                private int idX;
                private String name;
                @SerializedName("actionUrl")
                private String actionUrlX;
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

                public int getIdX() {
                    return idX;
                }

                public void setIdX(int idX) {
                    this.idX = idX;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getActionUrlX() {
                    return actionUrlX;
                }

                public void setActionUrlX(String actionUrlX) {
                    this.actionUrlX = actionUrlX;
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
                 * height : 720
                 * width : 1280
                 * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194523&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":42959681},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194523&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":42959681}]
                 * name : 高清
                 * type : high
                 * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194523&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss
                 */

                private int height;
                private int width;
                private String name;
                @SerializedName("type")
                private String typeX;
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

                public String getTypeX() {
                    return typeX;
                }

                public void setTypeX(String typeX) {
                    this.typeX = typeX;
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
                     * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194523&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss
                     * size : 42959681
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
