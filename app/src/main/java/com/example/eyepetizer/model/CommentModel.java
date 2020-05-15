package com.example.eyepetizer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentModel {

    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
    @SerializedName("itemList")
    private List<ItemListBean> itemList;

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

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public List<ItemListBean> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBean> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBean {

        private String type;
        @SerializedName("data")
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
            private String text;
            private String dataType;
            private long id;
            private int videoId;
            private String videoTitle;
            private int parentReplyId;
            private long rootReplyId;
            private int sequence;
            private String message;
            private String replyStatus;
            private long createTime;
            private UserBean user;
            private int likeCount;
            private boolean liked;
            private boolean hot;
            private Object userType;
            private String type;
            private Object actionUrl;
            private String imageUrl;
            private Object ugcVideoId;
            private Object parentReply;
            private boolean showParentReply;
            private boolean showConversationButton;
            private Object ugcVideoUrl;
            private Object cover;
            private boolean userBlocked;
            private String sid;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public int getVideoId() {
                return videoId;
            }

            public void setVideoId(int videoId) {
                this.videoId = videoId;
            }

            public String getVideoTitle() {
                return videoTitle;
            }

            public void setVideoTitle(String videoTitle) {
                this.videoTitle = videoTitle;
            }

            public int getParentReplyId() {
                return parentReplyId;
            }

            public void setParentReplyId(int parentReplyId) {
                this.parentReplyId = parentReplyId;
            }

            public long getRootReplyId() {
                return rootReplyId;
            }

            public void setRootReplyId(long rootReplyId) {
                this.rootReplyId = rootReplyId;
            }

            public int getSequence() {
                return sequence;
            }

            public void setSequence(int sequence) {
                this.sequence = sequence;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getReplyStatus() {
                return replyStatus;
            }

            public void setReplyStatus(String replyStatus) {
                this.replyStatus = replyStatus;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public int getLikeCount() {
                return likeCount;
            }

            public void setLikeCount(int likeCount) {
                this.likeCount = likeCount;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public boolean isHot() {
                return hot;
            }

            public void setHot(boolean hot) {
                this.hot = hot;
            }

            public Object getUserType() {
                return userType;
            }

            public void setUserType(Object userType) {
                this.userType = userType;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Object getActionUrl() {
                return actionUrl;
            }

            public void setActionUrl(Object actionUrl) {
                this.actionUrl = actionUrl;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public Object getUgcVideoId() {
                return ugcVideoId;
            }

            public void setUgcVideoId(Object ugcVideoId) {
                this.ugcVideoId = ugcVideoId;
            }

            public Object getParentReply() {
                return parentReply;
            }

            public void setParentReply(Object parentReply) {
                this.parentReply = parentReply;
            }

            public boolean isShowParentReply() {
                return showParentReply;
            }

            public void setShowParentReply(boolean showParentReply) {
                this.showParentReply = showParentReply;
            }

            public boolean isShowConversationButton() {
                return showConversationButton;
            }

            public void setShowConversationButton(boolean showConversationButton) {
                this.showConversationButton = showConversationButton;
            }

            public Object getUgcVideoUrl() {
                return ugcVideoUrl;
            }

            public void setUgcVideoUrl(Object ugcVideoUrl) {
                this.ugcVideoUrl = ugcVideoUrl;
            }

            public Object getCover() {
                return cover;
            }

            public void setCover(Object cover) {
                this.cover = cover;
            }

            public boolean isUserBlocked() {
                return userBlocked;
            }

            public void setUserBlocked(boolean userBlocked) {
                this.userBlocked = userBlocked;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public static class UserBean {
                /**
                 * uid : 303533138
                 * nickname : pursuitx
                 * avatar : http://img.kaiyanapp.com/3579277300d782b21f48f6e8240b5622.jpeg?imageMogr2/quality/60/format/jpg
                 * userType : NORMAL
                 * ifPgc : false
                 * description : Marvels’s girl. 人民有信仰，国家有力量. （ding～🌼✨这里是漫威女孩的个人分享主页，我会给大家推荐美剧，app，书籍，电影，壁纸等等.）
                 * area : null
                 * gender : female
                 * registDate : 1579167182000
                 * releaseDate : 1588610524000
                 * cover : http://img.kaiyanapp.com/302965be5cf5276119f5f06c14719440.jpeg?imageMogr2/quality/60/format/jpg
                 * actionUrl : eyepetizer://pgc/detail/303533138/?title=pursuitx&userType=NORMAL&tabIndex=0
                 * followed : false
                 * limitVideoOpen : false
                 * library : BLOCK
                 * birthday : 1057075200000
                 * country :
                 * city :
                 * university :
                 * job :
                 * expert : false
                 */

                private int uid;
                private String nickname;
                private String avatar;
                private String userType;
                private boolean ifPgc;
                private String description;
                private Object area;
                private String gender;
                private long registDate;
                private long releaseDate;
                private String cover;
                private String actionUrl;
                private boolean followed;
                private boolean limitVideoOpen;
                private String library;
                private long birthday;
                private String country;
                private String city;
                private String university;
                private String job;
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

                public Object getArea() {
                    return area;
                }

                public void setArea(Object area) {
                    this.area = area;
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

                public void setBirthday(long birthday) {
                    this.birthday = birthday;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getUniversity() {
                    return university;
                }

                public void setUniversity(String university) {
                    this.university = university;
                }

                public String getJob() {
                    return job;
                }

                public void setJob(String job) {
                    this.job = job;
                }

                public boolean isExpert() {
                    return expert;
                }

                public void setExpert(boolean expert) {
                    this.expert = expert;
                }
            }
        }
    }
}
