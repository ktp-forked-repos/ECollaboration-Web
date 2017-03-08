package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class TutorEntity {
    private Integer user;
    private String homePage;
    private Set<ProjectEntity> projectsByUser;
    private UserEntity userByUser;

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TutorEntity that = (TutorEntity) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (homePage != null ? !homePage.equals(that.homePage) : that.homePage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (homePage != null ? homePage.hashCode() : 0);
        return result;
    }

    public Set<ProjectEntity> getProjectsByUser() {
        return projectsByUser;
    }

    public void setProjectsByUser(Set<ProjectEntity> projectsByUser) {
        this.projectsByUser = projectsByUser;
    }

    public UserEntity getUserByUser() {
        return userByUser;
    }

    public void setUserByUser(UserEntity userByUser) {
        this.userByUser = userByUser;
    }
}
