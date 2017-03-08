package com.general.dao.entity;

import com.general.Enum.RepetitionEnum;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class ScheduleEntity {
    private Integer id;
    private String title;
    private Timestamp beginAt;
    private Timestamp endAt;
    private RepetitionEnum repetition;
    private String detail;
    private Integer creator;
    private UserEntity userByCreator;
    private Set<ScheduleUserEntity> scheduleUsersById;

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

    public Timestamp getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Timestamp beginAt) {
        this.beginAt = beginAt;
    }

    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    public RepetitionEnum getRepetition() {
        return repetition;
    }

    public void setRepetition(RepetitionEnum repetition) {
        this.repetition = repetition;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity that = (ScheduleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (beginAt != null ? !beginAt.equals(that.beginAt) : that.beginAt != null) return false;
        if (endAt != null ? !endAt.equals(that.endAt) : that.endAt != null) return false;
        if (repetition != that.repetition) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (beginAt != null ? beginAt.hashCode() : 0);
        result = 31 * result + (endAt != null ? endAt.hashCode() : 0);
        result = 31 * result + (repetition != null ? repetition.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        return result;
    }

    public UserEntity getUserByCreator() {
        return userByCreator;
    }

    public void setUserByCreator(UserEntity userByCreator) {
        this.userByCreator = userByCreator;
    }

    public Set<ScheduleUserEntity> getScheduleUsersById() {
        return scheduleUsersById;
    }

    public void setScheduleUsersById(Set<ScheduleUserEntity> scheduleUsersById) {
        this.scheduleUsersById = scheduleUsersById;
    }
}
