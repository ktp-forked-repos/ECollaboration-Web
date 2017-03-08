package com.general.dao.entity;

import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by joanna on 1/5/17.
 */
public class TeamEntity {
    private Integer id;
    private String name;
    private Timestamp applyAt;
    private Timestamp passAt;
    private Timestamp failAt;
    private Timestamp createAt;
    private Integer leader;
    private Integer project;
    private Set<PlanTeamEntity> planTeamsById;
    private Set<TaskEntity> tasksById;
    private StudentEntity studentByLeader;
    private ProjectEntity projectByProject;
    private Set<TeamScoreEntity> teamScoresById;
    private Set<TeamStudentEntity> teamStudentsById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getApplyAt() {
        return applyAt;
    }

    public void setApplyAt(Timestamp applyAt) {
        this.applyAt = applyAt;
    }

    public Timestamp getPassAt() {
        return passAt;
    }

    public void setPassAt(Timestamp passAt) {
        this.passAt = passAt;
    }

    public Timestamp getFailAt() {
        return failAt;
    }

    public void setFailAt(Timestamp failAt) {
        this.failAt = failAt;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Integer getLeader() {
        return leader;
    }

    public void setLeader(Integer leader) {
        this.leader = leader;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamEntity that = (TeamEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (applyAt != null ? !applyAt.equals(that.applyAt) : that.applyAt != null) return false;
        if (passAt != null ? !passAt.equals(that.passAt) : that.passAt != null) return false;
        if (failAt != null ? !failAt.equals(that.failAt) : that.failAt != null) return false;
        if (createAt != null ? !createAt.equals(that.createAt) : that.createAt != null) return false;
        if (leader != null ? !leader.equals(that.leader) : that.leader != null) return false;
        if (project != null ? !project.equals(that.project) : that.project != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (applyAt != null ? applyAt.hashCode() : 0);
        result = 31 * result + (passAt != null ? passAt.hashCode() : 0);
        result = 31 * result + (failAt != null ? failAt.hashCode() : 0);
        result = 31 * result + (createAt != null ? createAt.hashCode() : 0);
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }

    public Set<PlanTeamEntity> getPlanTeamsById() {
        return planTeamsById;
    }

    public void setPlanTeamsById(Set<PlanTeamEntity> planTeamsById) {
        this.planTeamsById = planTeamsById;
    }

    public Set<TaskEntity> getTasksById() {
        return tasksById;
    }

    public void setTasksById(Set<TaskEntity> tasksById) {
        this.tasksById = tasksById;
    }

    public StudentEntity getStudentByLeader() {
        return studentByLeader;
    }

    public void setStudentByLeader(StudentEntity studentByLeader) {
        this.studentByLeader = studentByLeader;
    }

    public ProjectEntity getProjectByProject() {
        return projectByProject;
    }

    public void setProjectByProject(ProjectEntity projectByProject) {
        this.projectByProject = projectByProject;
    }

    public Set<TeamScoreEntity> getTeamScoresById() {
        return teamScoresById;
    }

    public void setTeamScoresById(Set<TeamScoreEntity> teamScoresById) {
        this.teamScoresById = teamScoresById;
    }

    public Set<TeamStudentEntity> getTeamStudentsById() {
        return teamStudentsById;
    }

    public void setTeamStudentsById(Set<TeamStudentEntity> teamStudentsById) {
        this.teamStudentsById = teamStudentsById;
    }

    @OneToOne
    private FinalEntity finalByTeam;

    public FinalEntity getFinalByTeam() {
        return finalByTeam;
    }

    public void setFinalByTeam(FinalEntity finalByTeam) {
        this.finalByTeam = finalByTeam;
    }

    @javax.persistence.OneToMany
    private Set<FinalFileEntity> FinalFileByTeam;

    public Set<FinalFileEntity> getFinalFileByTeam() {
        return FinalFileByTeam;
    }

    public void setFinalFileByTeam(Set<FinalFileEntity> finalFileByTeam) {
        FinalFileByTeam = finalFileByTeam;
    }
}
