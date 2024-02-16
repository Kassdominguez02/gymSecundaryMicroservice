package com.example.gymMicroservice.dto;

import java.time.LocalDate;
import java.util.Date;

public class TrainingWorkloadRequest {
	
	private String username;
	private String firstName;
    private String lastName;
    private boolean isActive;
    private Date trainingDate;
    private int trainingDuration;
    private String actionType;
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getTrainingDate() {
		return trainingDate;
	}
	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}
	public int getTrainingDuration() {
		return trainingDuration;
	}
	public void setTrainingDuration(int trainingDuration) {
		this.trainingDuration = trainingDuration;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
    
    
    
    
}
