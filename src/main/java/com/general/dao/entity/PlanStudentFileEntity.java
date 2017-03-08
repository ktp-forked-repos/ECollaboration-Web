package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class PlanStudentFileEntity {
    private Integer file;
    private Integer planTeam;
    private FileEntity fileByFile;
    private PlanTeamEntity planTeamByPlanTeam;

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public Integer getPlanTeam() {
        return planTeam;
    }

    public void setPlanTeam(Integer planTeam) {
        this.planTeam = planTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanStudentFileEntity that = (PlanStudentFileEntity) o;

        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (planTeam != null ? !planTeam.equals(that.planTeam) : that.planTeam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (planTeam != null ? planTeam.hashCode() : 0);
        return result;
    }

    public FileEntity getFileByFile() {
        return fileByFile;
    }

    public void setFileByFile(FileEntity fileByFile) {
        this.fileByFile = fileByFile;
    }

    public PlanTeamEntity getPlanTeamByPlanTeam() {
        return planTeamByPlanTeam;
    }

    public void setPlanTeamByPlanTeam(PlanTeamEntity planTeamByPlanTeam) {
        this.planTeamByPlanTeam = planTeamByPlanTeam;
    }
}
