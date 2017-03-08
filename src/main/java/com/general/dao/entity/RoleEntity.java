package com.general.dao.entity;

import com.general.Enum.RoleEnum;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class RoleEntity {
    private Integer id;
    private RoleEnum role;
    private Set<UserEntity> usersById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (role != that.role) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    public Set<UserEntity> getUsersById() {
        return usersById;
    }

    public void setUsersById(Set<UserEntity> usersById) {
        this.usersById = usersById;
    }
}
