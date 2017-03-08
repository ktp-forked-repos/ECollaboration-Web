package com.general.dao.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class NoticeEntity {
    private Integer id;
    private Integer sender;
    private String title;
    private String content;
    private Timestamp sendAt;
    private Boolean isChecked;
    private UserEntity userBySender;
    private Set<NoticeUserEntity> noticeUsersById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getSendAt() {
        return sendAt;
    }

    public void setSendAt(Timestamp sendAt) {
        this.sendAt = sendAt;
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean checked) {
        isChecked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeEntity that = (NoticeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sender != null ? !sender.equals(that.sender) : that.sender != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (sendAt != null ? !sendAt.equals(that.sendAt) : that.sendAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (sendAt != null ? sendAt.hashCode() : 0);
        return result;
    }

    public UserEntity getUserBySender() {
        return userBySender;
    }

    public void setUserBySender(UserEntity userBySender) {
        this.userBySender = userBySender;
    }

    public Set<NoticeUserEntity> getNoticeUsersById() {
        return noticeUsersById;
    }

    public void setNoticeUsersById(Set<NoticeUserEntity> noticeUsersById) {
        this.noticeUsersById = noticeUsersById;
    }
}
