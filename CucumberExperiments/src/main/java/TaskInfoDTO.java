package main.java;

import java.util.Date;

public class TaskInfoDTO {
//task name as "name", start date as "date1", end date as "date2", efforts as 10
	private String taskName;
	private Date startDate;
	private Date endDate;
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
