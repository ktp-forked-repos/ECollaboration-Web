package com.general.dao.entity;

import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class UserEntity {
    private Integer id;
    private String github;
    private String wechat;
    private String telephone;
    private String email;
    private String emailPwd;
    private String emailType;
    private Integer role;
    private String password;
    private Set<AccessEntity> accessesById;
    private Set<MailEntity> mailsById;
    private Set<MailUserEntity> mailUsersById;
    private Set<NoticeEntity> noticesById;
    private Set<NoticeUserEntity> noticeUsersById;
    private Set<ScheduleEntity> schedulesById;
    private Set<ScheduleUserEntity> scheduleUsersById;
    private StudentEntity studentById;
    private TutorEntity tutorById;
    private RoleEntity roleByRole;
    private String name;
    private Integer gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailPwd() {
        return emailPwd;
    }

    public void setEmailPwd(String emailPwd) {
        this.emailPwd = emailPwd;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (github != null ? !github.equals(that.github) : that.github != null) return false;
        if (wechat != null ? !wechat.equals(that.wechat) : that.wechat != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (emailPwd != null ? !emailPwd.equals(that.emailPwd) : that.emailPwd != null) return false;
        if (emailType != null ? !emailType.equals(that.emailType) : that.emailType != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }*/

/*    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (github != null ? github.hashCode() : 0);
        result = 31 * result + (wechat != null ? wechat.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (emailPwd != null ? emailPwd.hashCode() : 0);
        result = 31 * result + (emailType != null ? emailType.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }*/

    public Set<AccessEntity> getAccessesById() {
        return accessesById;
    }

    public void setAccessesById(Set<AccessEntity> accessesById) {
        this.accessesById = accessesById;
    }

    public Set<MailEntity> getMailsById() {
        return mailsById;
    }

    public void setMailsById(Set<MailEntity> mailsById) {
        this.mailsById = mailsById;
    }

    public Set<MailUserEntity> getMailUsersById() {
        return mailUsersById;
    }

    public void setMailUsersById(Set<MailUserEntity> mailUsersById) {
        this.mailUsersById = mailUsersById;
    }

    public Set<NoticeEntity> getNoticesById() {
        return noticesById;
    }

    public void setNoticesById(Set<NoticeEntity> noticesById) {
        this.noticesById = noticesById;
    }

    public Set<NoticeUserEntity> getNoticeUsersById() {
        return noticeUsersById;
    }

    public void setNoticeUsersById(Set<NoticeUserEntity> noticeUsersById) {
        this.noticeUsersById = noticeUsersById;
    }

    public Set<ScheduleEntity> getSchedulesById() {
        return schedulesById;
    }

    public void setSchedulesById(Set<ScheduleEntity> schedulesById) {
        this.schedulesById = schedulesById;
    }

    public Set<ScheduleUserEntity> getScheduleUsersById() {
        return scheduleUsersById;
    }

    public void setScheduleUsersById(Set<ScheduleUserEntity> scheduleUsersById) {
        this.scheduleUsersById = scheduleUsersById;
    }

    public StudentEntity getStudentById() {
        return studentById;
    }

    public void setStudentById(StudentEntity studentById) {
        this.studentById = studentById;
    }

    public TutorEntity getTutorById() {
        return tutorById;
    }

    public void setTutorById(TutorEntity tutorById) {
        this.tutorById = tutorById;
    }

    public RoleEntity getRoleByRole() {
        return roleByRole;
    }

    public void setRoleByRole(RoleEntity roleByRole) {
        this.roleByRole = roleByRole;
    }
}
