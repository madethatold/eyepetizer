package com.example.eyepetizer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommentModel {

    private int count;
    private int total;
    private String nextPageUrl;
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
            @SerializedName("user")
            private UserBean user;
            private int likeCount;
            private boolean liked;
            private boolean hot;
            private String type;
            private String imageUrl;
            private boolean showParentReply;
            private boolean showConversationButton;
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

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
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
