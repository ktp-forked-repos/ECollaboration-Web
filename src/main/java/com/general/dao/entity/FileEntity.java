package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class FileEntity {
    private Integer id;
    private String realName;
    private String restoreAt;
    private MailFileEntity mailFileById;
    private PlanStudentFileEntity planStudentFileById;
    private PlanTeacherFileEntity planTeacherFileById;
    private TaskFileEntity taskFileById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRestoreAt() {
        return restoreAt;
    }

    public void setRestoreAt(String restoreAt) {
        this.restoreAt = restoreAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileEntity that = (FileEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (restoreAt != null ? !restoreAt.equals(that.restoreAt) : that.restoreAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (restoreAt != null ? restoreAt.hashCode() : 0);
        return result;
    }

    public MailFileEntity getMailFileById() {
        return mailFileById;
    }

    public void setMailFileById(MailFileEntity mailFileById) {
        this.mailFileById = mailFileById;
    }

    public PlanStudentFileEntity getPlanStudentFileById() {
        return planStudentFileById;
    }

    public void setPlanStudentFileById(PlanStudentFileEntity planStudentFileById) {
        this.planStudentFileById = planStudentFileById;
    }

    public PlanTeacherFileEntity getPlanTeacherFileById() {
        return planTeacherFileById;
    }

    public void setPlanTeacherFileById(PlanTeacherFileEntity planTeacherFileById) {
        this.planTeacherFileById = planTeacherFileById;
    }

    public TaskFileEntity getTaskFileById() {
        return taskFileById;
    }

    public void setTaskFileById(TaskFileEntity taskFileById) {
        this.taskFileById = taskFileById;
    }

    @javax.persistence.OneToOne
    private FinalFileEntity finalFileByFile;


    public FinalFileEntity getFinalFileByFile() {
        return finalFileByFile;
    }

    public void setFinalFileByFile(FinalFileEntity finalFileByFile) {
        this.finalFileByFile = finalFileByFile;
    }
}
