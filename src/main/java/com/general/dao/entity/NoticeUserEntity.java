package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class NoticeUserEntity {
    private Integer notice;
    private Integer user;
    private NoticeEntity noticeByNotice;
    private UserEntity userByUser;

    public Integer getNotice() {
        return notice;
    }

    public void setNotice(Integer notice) {
        this.notice = notice;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeUserEntity that = (NoticeUserEntity) o;

        if (notice != null ? !notice.equals(that.notice) : that.notice != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = notice != null ? notice.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    public NoticeEntity getNoticeByNotice() {
        return noticeByNotice;
    }

    public void setNoticeByNotice(NoticeEntity noticeByNotice) {
        this.noticeByNotice = noticeByNotice;
    }

    public UserEntity getUserByUser() {
        return userByUser;
    }

    public void setUserByUser(UserEntity userByUser) {
        this.userByUser = userByUser;
    }
}
