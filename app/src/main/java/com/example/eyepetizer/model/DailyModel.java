package com.example.eyepetizer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyModel {
    private String nextPageUrl;
    private int count;

    @SerializedName("itemList")
    private List<itemEntity> lists;

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

    public List<itemEntity> getLists() {
        return lists;
    }

    public void setLists(List<itemEntity> lists) {
        this.lists = lists;
    }


    public static class itemEntity{
        private String type;
        private int id;

        @SerializedName("data")
        private DataEntity dataEntity;

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

        public DataEntity getDataEntity() {
            return dataEntity;
        }

        public void setDataEntity(DataEntity dataEntity) {
            this.dataEntity = dataEntity;
        }

        public static class DataEntity{
            private String dataType;
            private String text;
            @SerializedName("header")
            private Header header;
            @SerializedName("content")
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

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public class Header{
                private int id;
                private String actionUrl;
                private String icon;
                private String iconType;
                private long time;
                private boolean showHateVideo;
                private String followType;
                private String issuerName;

                private String title;
                private String description;

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
            }

            public class Content{
                private int id;
                private String type;
                @SerializedName("data")
                private Data data;

                public Data getData() {
                    return data;
                }

                public void setData(Data data) {
                    this.data = data;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public class Data{
                    private String dataType;
                    private int id;
                    private String title;
                    private String description;
                    private String url;
                    private String playUrl;
                    private String category;
                    private int duration;
                    @SerializedName("cover")
                    private CoverBean coverBean;
                    @SerializedName("consumption")
                    private Consumption consumption;

                    public Consumption getConsumption() {
                        return consumption;
                    }

                    public void setConsumption(Consumption consumption) {
                        this.consumption = consumption;
                    }

                    public int getDuration() {
                        return duration;
                    }

                    public void setDuration(int duration) {
                        this.duration = duration;
                    }

                    public CoverBean getCoverBean() {
                        return coverBean;
                    }

                    public void setCoverBean(CoverBean coverBean) {
                        this.coverBean = coverBean;
                    }

                    public String getCategory() {
                        return category;
                    }

                    public void setCategory(String category) {
                        this.category = category;
                    }

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

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getPlayUrl() {
                        return playUrl;
                    }

                    public void setPlayUrl(String playUrl) {
                        this.playUrl = playUrl;
                    }

                    public class CoverBean{

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
                    public class Consumption{

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

    }

}

