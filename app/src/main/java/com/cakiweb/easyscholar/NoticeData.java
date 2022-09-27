package com.cakiweb.easyscholar;

public class NoticeData {
    String noticeTitle;
    String noticeDescription;
    String noticeTime;
    public NoticeData(String noticeTitle,String noticeDescription,String noticeTime){
        this.noticeDescription=noticeDescription;
        this.noticeTime=noticeTime;
        this.noticeTitle=noticeTitle;
    }

    public String getNoticeDescription() {
        return noticeDescription;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeDescription(String noticeDescription) {
        this.noticeDescription = noticeDescription;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }
}

