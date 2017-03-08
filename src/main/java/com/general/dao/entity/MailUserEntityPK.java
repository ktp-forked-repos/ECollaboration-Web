package com.general.dao.entity;

import java.io.Serializable;

/**
 * Created by joanna on 1/5/17.
 */
public class MailUserEntityPK implements Serializable {
    private Integer user;
    private Integer mail;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getMail() {
        return mail;
    }

    public void setMail(Integer mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MailUserEntityPK that = (MailUserEntityPK) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }
}
