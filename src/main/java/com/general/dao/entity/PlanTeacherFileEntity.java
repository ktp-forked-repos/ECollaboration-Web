package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class PlanTeacherFileEntity {
    private Integer file;
    private Integer plan;
    private FileEntity fileByFile;
    private PlanEntity planByPlan;

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public Integer getPlan() {
        return plan;
    }

    public void setPlan(Integer plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanTeacherFileEntity that = (PlanTeacherFileEntity) o;

        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (plan != null ? !plan.equals(that.plan) : that.plan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (plan != null ? plan.hashCode() : 0);
        return result;
    }

    public FileEntity getFileByFile() {
        return fileByFile;
    }

    public void setFileByFile(FileEntity fileByFile) {
        this.fileByFile = fileByFile;
    }

    public PlanEntity getPlanByPlan() {
        return planByPlan;
    }

    public void setPlanByPlan(PlanEntity planByPlan) {
        this.planByPlan = planByPlan;
    }
}
