package com.general.param.student;

//getTask
public class TaskListParam extends GlobalParam {

	private String projectToken;
	private String owner;
	private String deadline;
	private int isFinished;

	public String getProjectToken() {
		return projectToken;
	}

	public void setProjectToken(String projectToken) {
		this.projectToken = projectToken;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public int getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(int isFinished) {
		this.isFinished = isFinished;
	}

    @Override
    public String toString() {
        return "TaskListParam{" +
                "projectToken='" + projectToken + '\'' +
                ", owner='" + owner + '\'' +
                ", deadline='" + deadline + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }
}
