package com.example.eyepetizer.model;

import java.util.List;

public class FollowModel {

    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
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
        /**
         * type : autoPlayFollowCard
         * data : {"dataType":"FollowCard","header":{"id":194799,"actionUrl":"eyepetizer://pgc/detail/3451/?title=%E7%9B%B4%E5%87%BB%E5%BD%93%E4%B8%8B&userType=PGC&tabIndex=1","labelList":null,"icon":"http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","time":1589907804000,"showHateVideo":false,"followType":"author","tagId":0,"tagName":null,"issuerName":"直击当下","topShow":false},"content":{"type":"video","data":{"dataType":"VideoBeanForClient","id":194799,"title":"硬核哈迷必看！这些关于哈利波特的问题你能回答么？","description":"本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From \nBuzzFeedVideo","library":"DEFAULT","tags":[{"id":743,"name":"记录精选","actionUrl":"eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":534,"name":"人文","actionUrl":"eyepetizer://tag/534/?title=%E4%BA%BA%E6%96%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/5d6ee9241a0e2196bc1754b35f6f15e5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/16b60131c2bc0885683ce7ee6ac75b52.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null,"desc":"告诉他们为什么与众不同","bgPicture":"http://img.kaiyanapp.com/c3984cad49455e01637347e0c8f6a37d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/fd76dab1411e07f0dcf45309720134f9.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"video","slogan":null,"provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"记录","author":{"id":3451,"icon":"http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg","name":"直击当下","description":"直击当下是一个追踪现实、记录当下的纪实平台，我们直击真人真事，将镜头对准社会焦点。","link":"","latestReleaseTime":1589907804000,"videoNum":338,"adTrack":null,"follow":{"itemType":"author","itemId":3451,"followed":false},"shield":{"itemType":"author","itemId":3451,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b5fa1c9ec0d924b2781b47fe157b67f3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":654,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=194799","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194799&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589907804000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":48129543},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":48129543}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"硬核哈迷必看！这些关于哈利波特的问题你能回答么？","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1589907804000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From \nBuzzFeedVideo","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1},"adTrack":[]}
         * tag : null
         * id : 194799
         * adIndex : -1
         */

        private String type;
        private DataBeanX data;
        private Object tag;
        private int id;
        private int adIndex;

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

        public static class DataBeanX {
            /**
             * dataType : FollowCard
             * header : {"id":194799,"actionUrl":"eyepetizer://pgc/detail/3451/?title=%E7%9B%B4%E5%87%BB%E5%BD%93%E4%B8%8B&userType=PGC&tabIndex=1","labelList":null,"icon":"http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","time":1589907804000,"showHateVideo":false,"followType":"author","tagId":0,"tagName":null,"issuerName":"直击当下","topShow":false}
             * content : {"type":"video","data":{"dataType":"VideoBeanForClient","id":194799,"title":"硬核哈迷必看！这些关于哈利波特的问题你能回答么？","description":"本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From \nBuzzFeedVideo","library":"DEFAULT","tags":[{"id":743,"name":"记录精选","actionUrl":"eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":534,"name":"人文","actionUrl":"eyepetizer://tag/534/?title=%E4%BA%BA%E6%96%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/5d6ee9241a0e2196bc1754b35f6f15e5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/16b60131c2bc0885683ce7ee6ac75b52.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null,"desc":"告诉他们为什么与众不同","bgPicture":"http://img.kaiyanapp.com/c3984cad49455e01637347e0c8f6a37d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/fd76dab1411e07f0dcf45309720134f9.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"video","slogan":null,"provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"记录","author":{"id":3451,"icon":"http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg","name":"直击当下","description":"直击当下是一个追踪现实、记录当下的纪实平台，我们直击真人真事，将镜头对准社会焦点。","link":"","latestReleaseTime":1589907804000,"videoNum":338,"adTrack":null,"follow":{"itemType":"author","itemId":3451,"followed":false},"shield":{"itemType":"author","itemId":3451,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b5fa1c9ec0d924b2781b47fe157b67f3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":654,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=194799","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194799&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589907804000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":48129543},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":48129543}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"硬核哈迷必看！这些关于哈利波特的问题你能回答么？","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1589907804000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From \nBuzzFeedVideo","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null},"tag":null,"id":0,"adIndex":-1}
             * adTrack : []
             */

            private String dataType;
            private HeaderBean header;
            private ContentBean content;

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

            public static class HeaderBean {
                /**
                 * id : 194799
                 * actionUrl : eyepetizer://pgc/detail/3451/?title=%E7%9B%B4%E5%87%BB%E5%BD%93%E4%B8%8B&userType=PGC&tabIndex=1
                 * labelList : null
                 * icon : http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg
                 * iconType : round
                 * time : 1589907804000
                 * showHateVideo : false
                 * followType : author
                 * tagId : 0
                 * tagName : null
                 * issuerName : 直击当下
                 * topShow : false
                 */

                private int id;
                private String actionUrl;
                private Object labelList;
                private String icon;
                private String iconType;
                private long time;
                private boolean showHateVideo;
                private String followType;
                private int tagId;
                private Object tagName;
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

                public Object getLabelList() {
                    return labelList;
                }

                public void setLabelList(Object labelList) {
                    this.labelList = labelList;
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

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public Object getTagName() {
                    return tagName;
                }

                public void setTagName(Object tagName) {
                    this.tagName = tagName;
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

            public static class ContentBean {
                /**
                 * type : video
                 * data : {"dataType":"VideoBeanForClient","id":194799,"title":"硬核哈迷必看！这些关于哈利波特的问题你能回答么？","description":"本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From \nBuzzFeedVideo","library":"DEFAULT","tags":[{"id":743,"name":"记录精选","actionUrl":"eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":534,"name":"人文","actionUrl":"eyepetizer://tag/534/?title=%E4%BA%BA%E6%96%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/5d6ee9241a0e2196bc1754b35f6f15e5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/16b60131c2bc0885683ce7ee6ac75b52.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null,"desc":"告诉他们为什么与众不同","bgPicture":"http://img.kaiyanapp.com/c3984cad49455e01637347e0c8f6a37d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/fd76dab1411e07f0dcf45309720134f9.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}],"consumption":{"collectionCount":0,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"video","slogan":null,"provider":{"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"},"category":"记录","author":{"id":3451,"icon":"http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg","name":"直击当下","description":"直击当下是一个追踪现实、记录当下的纪实平台，我们直击真人真事，将镜头对准社会焦点。","link":"","latestReleaseTime":1589907804000,"videoNum":338,"adTrack":null,"follow":{"itemType":"author","itemId":3451,"followed":false},"shield":{"itemType":"author","itemId":3451,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false},"cover":{"feed":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b5fa1c9ec0d924b2781b47fe157b67f3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"},"playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss","thumbPlayUrl":null,"duration":654,"webUrl":{"raw":"http://www.eyepetizer.net/detail.html?vid=194799","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194799&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"},"releaseTime":1589907804000,"playInfo":[{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":48129543},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":48129543}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}],"campaign":null,"waterMarks":null,"ad":false,"adTrack":[],"type":"NORMAL","titlePgc":null,"descriptionPgc":null,"remark":"硬核哈迷必看！这些关于哈利波特的问题你能回答么？","ifLimitVideo":false,"searchWeight":0,"brandWebsiteInfo":null,"idx":0,"shareAdTrack":null,"favoriteAdTrack":null,"webAdTrack":null,"date":1589907804000,"promotion":null,"label":null,"labelList":[],"descriptionEditor":"本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From \nBuzzFeedVideo","collected":false,"reallyCollected":false,"played":false,"subtitles":[],"lastViewTime":null,"playlists":null,"src":null,"recallSource":null}
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
                     * id : 194799
                     * title : 硬核哈迷必看！这些关于哈利波特的问题你能回答么？
                     * description : 本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From
                     BuzzFeedVideo
                     * library : DEFAULT
                     * tags : [{"id":743,"name":"记录精选","actionUrl":"eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"IMPORTANT","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":534,"name":"人文","actionUrl":"eyepetizer://tag/534/?title=%E4%BA%BA%E6%96%87","adTrack":null,"desc":null,"bgPicture":"http://img.kaiyanapp.com/5d6ee9241a0e2196bc1754b35f6f15e5.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/16b60131c2bc0885683ce7ee6ac75b52.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0},{"id":24,"name":"记录","actionUrl":"eyepetizer://tag/24/?title=%E8%AE%B0%E5%BD%95","adTrack":null,"desc":"告诉他们为什么与众不同","bgPicture":"http://img.kaiyanapp.com/c3984cad49455e01637347e0c8f6a37d.jpeg?imageMogr2/quality/100","headerImage":"http://img.kaiyanapp.com/fd76dab1411e07f0dcf45309720134f9.jpeg?imageMogr2/quality/100","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":0}]
                     * consumption : {"collectionCount":0,"shareCount":0,"replyCount":0,"realCollectionCount":0}
                     * resourceType : video
                     * slogan : null
                     * provider : {"name":"YouTube","alias":"youtube","icon":"http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png"}
                     * category : 记录
                     * author : {"id":3451,"icon":"http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg","name":"直击当下","description":"直击当下是一个追踪现实、记录当下的纪实平台，我们直击真人真事，将镜头对准社会焦点。","link":"","latestReleaseTime":1589907804000,"videoNum":338,"adTrack":null,"follow":{"itemType":"author","itemId":3451,"followed":false},"shield":{"itemType":"author","itemId":3451,"shielded":false},"approvedNotReadyVideoCount":0,"ifPgc":true,"recSort":0,"expert":false}
                     * cover : {"feed":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg","blurred":"http://img.kaiyanapp.com/b5fa1c9ec0d924b2781b47fe157b67f3.jpeg?imageMogr2/quality/60/format/jpg","sharing":null,"homepage":"http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim"}
                     * playUrl : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=default&source=aliyun&playUrlType=url_oss
                     * thumbPlayUrl : null
                     * duration : 654
                     * webUrl : {"raw":"http://www.eyepetizer.net/detail.html?vid=194799","forWeibo":"http://www.eyepetizer.net/detail.html?vid=194799&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0"}
                     * releaseTime : 1589907804000
                     * playInfo : [{"height":720,"width":1280,"urlList":[{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":48129543},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":48129543}],"name":"高清","type":"high","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss"}]
                     * campaign : null
                     * waterMarks : null
                     * ad : false
                     * adTrack : []
                     * type : NORMAL
                     * titlePgc : null
                     * descriptionPgc : null
                     * remark : 硬核哈迷必看！这些关于哈利波特的问题你能回答么？
                     * ifLimitVideo : false
                     * searchWeight : 0
                     * brandWebsiteInfo : null
                     * idx : 0
                     * shareAdTrack : null
                     * favoriteAdTrack : null
                     * webAdTrack : null
                     * date : 1589907804000
                     * promotion : null
                     * label : null
                     * labelList : []
                     * descriptionEditor : 本视频邀请了几位硬核哈迷来挑战关于「哈利波特」最难的问题，你能答对几道题？From
                     BuzzFeedVideo
                     * collected : false
                     * reallyCollected : false
                     * played : false
                     * subtitles : []
                     * lastViewTime : null
                     * playlists : null
                     * src : null
                     * recallSource : null
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
                    private Object src;
                    private Object recallSource;
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

                    public Object getSrc() {
                        return src;
                    }

                    public void setSrc(Object src) {
                        this.src = src;
                    }

                    public Object getRecallSource() {
                        return recallSource;
                    }

                    public void setRecallSource(Object recallSource) {
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
                         * collectionCount : 0
                         * shareCount : 0
                         * replyCount : 0
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

                    public static class ProviderBean {
                        /**
                         * name : YouTube
                         * alias : youtube
                         * icon : http://img.kaiyanapp.com/fa20228bc5b921e837156923a58713f6.png
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
                         * id : 3451
                         * icon : http://img.kaiyanapp.com/dd692dae17fadf756b828d4e94a9d341.jpeg?imageMogr2/quality/60/format/jpg
                         * name : 直击当下
                         * description : 直击当下是一个追踪现实、记录当下的纪实平台，我们直击真人真事，将镜头对准社会焦点。
                         * link :
                         * latestReleaseTime : 1589907804000
                         * videoNum : 338
                         * adTrack : null
                         * follow : {"itemType":"author","itemId":3451,"followed":false}
                         * shield : {"itemType":"author","itemId":3451,"shielded":false}
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
                             * itemId : 3451
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
                             * itemId : 3451
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
                         * feed : http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg
                         * detail : http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageMogr2/quality/60/format/jpg
                         * blurred : http://img.kaiyanapp.com/b5fa1c9ec0d924b2781b47fe157b67f3.jpeg?imageMogr2/quality/60/format/jpg
                         * sharing : null
                         * homepage : http://img.kaiyanapp.com/af5ea6e2f681b3b05f717eed7e40b6a2.jpeg?imageView2/1/w/720/h/560/format/jpg/q/75|watermark/1/image/aHR0cDovL2ltZy5rYWl5YW5hcHAuY29tL2JsYWNrXzMwLnBuZw==/dissolve/100/gravity/Center/dx/0/dy/0|imageslim
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
                         * raw : http://www.eyepetizer.net/detail.html?vid=194799
                         * forWeibo : http://www.eyepetizer.net/detail.html?vid=194799&resourceType=video&utm_campaign=routine&utm_medium=share&utm_source=weibo&uid=0
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
                         * id : 743
                         * name : 记录精选
                         * actionUrl : eyepetizer://tag/743/?title=%E8%AE%B0%E5%BD%95%E7%B2%BE%E9%80%89
                         * adTrack : null
                         * desc : null
                         * bgPicture : http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg
                         * headerImage : http://img.kaiyanapp.com/a082f44b88e78daaf19fa4e1a2faaa5a.jpeg?imageMogr2/quality/60/format/jpg
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
                         * urlList : [{"name":"aliyun","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss","size":48129543},{"name":"ucloud","url":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=ucloud&playUrlType=url_oss","size":48129543}]
                         * name : 高清
                         * type : high
                         * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss
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
                             * url : http://baobab.kaiyanapp.com/api/v1/playUrl?vid=194799&resourceType=video&editionType=high&source=aliyun&playUrlType=url_oss
                             * size : 48129543
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
