package com.general.dao.entity;

/**
 * Created by joanna on 2/24/17.
 */
public class FinalFileEntity {
    private Integer file;
    private Integer team;

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FinalFileEntity that = (FinalFileEntity) o;

        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (team != null ? team.hashCode() : 0);
        return result;
    }

    @javax.persistence.OneToOne
    private FileEntity fileByFile;

    public FileEntity getFileByFile() {
        return fileByFile;
    }

    public void setFileByFile(FileEntity fileByFile) {
        this.fileByFile = fileByFile;
    }

    @javax.persistence.ManyToOne
    private TeamEntity teamByTeam;

    public TeamEntity getTeamByTeam() {
        return teamByTeam;
    }

    public void setTeamByTeam(TeamEntity teamByTeam) {
        this.teamByTeam = teamByTeam;
    }
}
