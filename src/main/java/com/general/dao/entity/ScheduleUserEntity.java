package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class ScheduleUserEntity {
    private Integer user;
    private Integer schedule;
    private UserEntity userByUser;
    private ScheduleEntity scheduleBySchedule;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleUserEntity that = (ScheduleUserEntity) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (schedule != null ? !schedule.equals(that.schedule) : that.schedule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (schedule != null ? schedule.hashCode() : 0);
        return result;
    }

    public UserEntity getUserByUser() {
        return userByUser;
    }

    public void setUserByUser(UserEntity userByUser) {
        this.userByUser = userByUser;
    }

    public ScheduleEntity getScheduleBySchedule() {
        return scheduleBySchedule;
    }

    public void setScheduleBySchedule(ScheduleEntity scheduleBySchedule) {
        this.scheduleBySchedule = scheduleBySchedule;
    }
}
