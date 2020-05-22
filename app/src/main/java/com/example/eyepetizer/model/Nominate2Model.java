package com.example.eyepetizer.model;

import java.util.List;

public class Nominate2Model {


    private int count;
    private int total;
    private String nextPageUrl;
    private List<ItemListBeanX> itemList;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
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
            private List<ItemListBean> itemList;
            private Header header;
            private Content content;

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

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public static class ItemListBean {

                private String type;
                private DataBean data;
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
                     * dataType : SquareContentCard
                     * title : 主题创作广场
                     * subTitle : 发布你的作品和日常
                     * bgPicture : http://img.kaiyanapp.com/04eef7e9f3b14a597bd04a8d81a4c8f3.png?imageMogr2/quality/60/format/jpg
                     * actionUrl : eyepetizer://community/tagSquare?tabIndex=0
                     */

                    private String dataType;
                    private String title;
                    private String subTitle;
                    private String bgPicture;
                    private String actionUrl;

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
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

                    public String getBgPicture() {
                        return bgPicture;
                    }

                    public void setBgPicture(String bgPicture) {
                        this.bgPicture = bgPicture;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }
                }
            }

            public static class Header {

                private int id;
                private String actionUrl;
                private String icon;
                private String iconType;
                private long time;
                private boolean showHateVideo;
                private String followType;
                private String issuerName;
                private boolean topShow;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
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

                public String getFollowType() {
                    return followType;
                }

                public void setFollowType(String followType) {
                    this.followType = followType;
                }

                public String getIssuerName() {
                    return issuerName;
                }

                public void setIssuerName(String issuerName) {
                    this.issuerName = issuerName;
                }

                public boolean isTopShow() {
                    return topShow;
                }

                public void setTopShow(boolean topShow) {
                    this.topShow = topShow;
                }
            }

            public static class Content {

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
                    private long uid;
                    private long createTime;
                    private long updateTime;
                    private long selectedTime;
                    private String checkStatus;
                    private String area;
                    private String city;
                    private double longitude;
                    private double latitude;
                    private String validateStatus;
                    private String validateResult;
                    private int width;
                    private int height;
                    private boolean addWatermark;
                    private String url;
                    private long releaseTime;

                    private ConsumptionBean consumption;
                    private RecentOnceReplyBean recentOnceReply;
                    private List<TagsBean> tags;
                    private List<String> urls;
                    private OwnerBean owner;
                    private CoverBean cover;

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

                    public long getUid() {
                        return uid;
                    }

                    public void setUid(long uid) {
                        this.uid = uid;
                    }

                    public long getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(long createTime) {
                        this.createTime = createTime;
                    }

                    public long getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(long updateTime) {
                        this.updateTime = updateTime;
                    }

                    public long getSelectedTime() {
                        return selectedTime;
                    }

                    public void setSelectedTime(long selectedTime) {
                        this.selectedTime = selectedTime;
                    }

                    public String getCheckStatus() {
                        return checkStatus;
                    }

                    public void setCheckStatus(String checkStatus) {
                        this.checkStatus = checkStatus;
                    }

                    public String getArea() {
                        return area;
                    }

                    public void setArea(String area) {
                        this.area = area;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public double getLongitude() {
                        return longitude;
                    }

                    public void setLongitude(double longitude) {
                        this.longitude = longitude;
                    }

                    public double getLatitude() {
                        return latitude;
                    }

                    public void setLatitude(double latitude) {
                        this.latitude = latitude;
                    }

                    public String getValidateStatus() {
                        return validateStatus;
                    }

                    public void setValidateStatus(String validateStatus) {
                        this.validateStatus = validateStatus;
                    }

                    public String getValidateResult() {
                        return validateResult;
                    }

                    public void setValidateResult(String validateResult) {
                        this.validateResult = validateResult;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public boolean isAddWatermark() {
                        return addWatermark;
                    }

                    public void setAddWatermark(boolean addWatermark) {
                        this.addWatermark = addWatermark;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public long getReleaseTime() {
                        return releaseTime;
                    }

                    public void setReleaseTime(long releaseTime) {
                        this.releaseTime = releaseTime;
                    }

                    public ConsumptionBean getConsumption() {
                        return consumption;
                    }

                    public void setConsumption(ConsumptionBean consumption) {
                        this.consumption = consumption;
                    }

                    public RecentOnceReplyBean getRecentOnceReply() {
                        return recentOnceReply;
                    }

                    public void setRecentOnceReply(RecentOnceReplyBean recentOnceReply) {
                        this.recentOnceReply = recentOnceReply;
                    }

                    public List<TagsBean> getTags() {
                        return tags;
                    }

                    public void setTags(List<TagsBean> tags) {
                        this.tags = tags;
                    }

                    public List<String> getUrls() {
                        return urls;
                    }

                    public void setUrls(List<String> urls) {
                        this.urls = urls;
                    }

                    public OwnerBean getOwner() {
                        return owner;
                    }

                    public void setOwner(OwnerBean owner) {
                        this.owner = owner;
                    }

                    public CoverBean getCover() {
                        return cover;
                    }

                    public void setCover(CoverBean cover) {
                        this.cover = cover;
                    }

                    public static class ConsumptionBean {
                        /**
                         * collectionCount : 98
                         * shareCount : 0
                         * replyCount : 1
                         * realCollectionCount : 0
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

                    public static class OwnerBean {
                        /**
                         * uid : 301390205
                         * nickname : DH个人摄影
                         * avatar : http://img.kaiyanapp.com/dfefa0ca504ec14412ec01c68787958f.jpeg?imageMogr2/quality/60/format/jpg
                         * userType : NORMAL
                         * ifPgc : false
                         * description : 独立摄影师  坐标西安 寻觅合作model 擅长 风光 建筑 夜景人像
                         * area : null
                         * gender : male
                         * registDate : 1520574378000
                         * releaseDate : 1589555067000
                         * cover : null
                         * actionUrl : eyepetizer://pgc/detail/301390205/?title=DH%E4%B8%AA%E4%BA%BA%E6%91%84%E5%BD%B1&userType=NORMAL&tabIndex=0
                         * followed : false
                         * limitVideoOpen : false
                         * library : BLOCK
                         * birthday : 0
                         * country : null
                         * city : null
                         * university : null
                         * job : null
                         * expert : true
                         */

                        private int uid;
                        private String nickname;
                        private String avatar;
                        private String userType;
                        private boolean ifPgc;
                        private String description;
                        private String gender;
                        private long registDate;
                        private long releaseDate;
                        private String cover;
                        private String actionUrl;
                        private boolean followed;
                        private boolean limitVideoOpen;
                        private String library;
                        private long birthday;
                        private boolean expert;

                        public int getUid() {
                            return uid;
                        }

                        public void setUid(int uid) {
                            this.uid = uid;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }

                        public String getAvatar() {
                            return avatar;
                        }

                        public void setAvatar(String avatar) {
                            this.avatar = avatar;
                        }

                        public String getUserType() {
                            return userType;
                        }

                        public void setUserType(String userType) {
                            this.userType = userType;
                        }

                        public boolean isIfPgc() {
                            return ifPgc;
                        }

                        public void setIfPgc(boolean ifPgc) {
                            this.ifPgc = ifPgc;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public String getGender() {
                            return gender;
                        }

                        public void setGender(String gender) {
                            this.gender = gender;
                        }

                        public long getRegistDate() {
                            return registDate;
                        }

                        public void setRegistDate(long registDate) {
                            this.registDate = registDate;
                        }

                        public long getReleaseDate() {
                            return releaseDate;
                        }

                        public void setReleaseDate(long releaseDate) {
                            this.releaseDate = releaseDate;
                        }

                        public String getCover() {
                            return cover;
                        }

                        public void setCover(String cover) {
                            this.cover = cover;
                        }

                        public String getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(String actionUrl) {
                            this.actionUrl = actionUrl;
                        }

                        public boolean isFollowed() {
                            return followed;
                        }

                        public void setFollowed(boolean followed) {
                            this.followed = followed;
                        }

                        public boolean isLimitVideoOpen() {
                            return limitVideoOpen;
                        }

                        public void setLimitVideoOpen(boolean limitVideoOpen) {
                            this.limitVideoOpen = limitVideoOpen;
                        }

                        public String getLibrary() {
                            return library;
                        }

                        public void setLibrary(String library) {
                            this.library = library;
                        }

                        public long getBirthday() {
                            return birthday;
                        }

                        public void setBirthday(int birthday) {
                            this.birthday = birthday;
                        }

                        public boolean isExpert() {
                            return expert;
                        }

                        public void setExpert(boolean expert) {
                            this.expert = expert;
                        }
                    }

                    public static class CoverBean {
                        /**
                         * feed : http://img.kaiyanapp.com/3660522038acfc2661371e1250c42886.png?imageMogr2/quality/60/format/jpg
                         * detail : http://img.kaiyanapp.com/3660522038acfc2661371e1250c42886.png?imageMogr2/quality/60/format/jpg
                         * blurred : null
                         * sharing : null
                         * homepage : null
                         */

                        private String feed;
                        private String detail;

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
                    }

                    public static class RecentOnceReplyBean {
                        /**
                         * dataType : SimpleHotReplyCard
                         * message : 赞
                         * nickname : 156****4111
                         * actionUrl : eyepetizer://pgc/detail/301331466/?title=156****4111&userType=NORMAL&tabIndex=0
                         * contentType : null
                         */

                        private String dataType;
                        private String message;
                        private String nickname;
                        private String actionUrl;

                        public String getDataType() {
                            return dataType;
                        }

                        public void setDataType(String dataType) {
                            this.dataType = dataType;
                        }

                        public String getMessage() {
                            return message;
                        }

                        public void setMessage(String message) {
                            this.message = message;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }

                        public String getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(String actionUrl) {
                            this.actionUrl = actionUrl;
                        }
                    }

                    public static class TagsBean {
                        /**
                         * id : 930
                         * name : 摄影师日常
                         * actionUrl : eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8
                         * adTrack : null
                         * desc : 透过镜头，我看到了更加真实的世界
                         * bgPicture : http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg
                         * headerImage : http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg
                         * tagRecType : NORMAL
                         * childTagList : null
                         * childTagIdList : null
                         * haveReward : false
                         * ifNewest : false
                         * newestEndTime : null
                         * communityIndex : 2
                         */

                        private int id;
                        private String name;
                        private String actionUrl;
                        private String desc;
                        private String bgPicture;
                        private String headerImage;
                        private String tagRecType;
                        private boolean haveReward;
                        private boolean ifNewest;
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

                        public int getCommunityIndex() {
                            return communityIndex;
                        }

                        public void setCommunityIndex(int communityIndex) {
                            this.communityIndex = communityIndex;
                        }
                    }
                }
            }
        }
    }
}
