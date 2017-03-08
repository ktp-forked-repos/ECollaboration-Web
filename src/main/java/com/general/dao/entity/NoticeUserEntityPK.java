package com.general.dao.entity;

import java.io.Serializable;

/**
 * Created by joanna on 1/5/17.
 */
public class NoticeUserEntityPK implements Serializable {
    private Integer notice;
    private Integer user;

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

        NoticeUserEntityPK that = (NoticeUserEntityPK) o;

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
}
