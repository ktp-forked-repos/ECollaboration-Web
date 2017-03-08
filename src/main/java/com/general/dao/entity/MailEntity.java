package com.general.dao.entity;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class MailEntity {
    private Integer id;
    private String title;
    private String content;
    private Timestamp sendAt;
    private Integer sender;
    private UserEntity userBySender;
    private Set<MailFileEntity> mailFilesById;
    private Set<MailUserEntity> mailUsersById;
    private Boolean isReceived;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(Boolean received) {
        isReceived = received;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MailEntity that = (MailEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (sendAt != null ? !sendAt.equals(that.sendAt) : that.sendAt != null) return false;
        if (sender != null ? !sender.equals(that.sender) : that.sender != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (sendAt != null ? sendAt.hashCode() : 0);
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        return result;
    }

    public UserEntity getUserBySender() {
        return userBySender;
    }

    public void setUserBySender(UserEntity userBySender) {
        this.userBySender = userBySender;
    }

    public Set<MailFileEntity> getMailFilesById() {
        return mailFilesById;
    }

    public void setMailFilesById(Set<MailFileEntity> mailFilesById) {
        this.mailFilesById = mailFilesById;
    }

    public Set<MailUserEntity> getMailUsersById() {
        return mailUsersById;
    }

    public void setMailUsersById(Set<MailUserEntity> mailUsersById) {
        this.mailUsersById = mailUsersById;
    }
}
