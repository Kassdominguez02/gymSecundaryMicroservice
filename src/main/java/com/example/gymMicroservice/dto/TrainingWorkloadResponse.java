package com.example.gymMicroservice.dto;

import java.util.List;

public class TrainingWorkloadResponse {
	
	private String username;
	private String firstName;
    private String lastName;
    private boolean trainerStatus;
    private List<Integer> years;
    private List<String> months;
    private double trainingSummaryDuration;
	
    
    public TrainingWorkloadResponse(String username, String firstName, String lastName, boolean trainerStatus,
			List<Integer> years, List<String> months, double trainingSummaryDuration) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.trainerStatus = trainerStatus;
		this.years = years;
		this.months = months;
		this.trainingSummaryDuration = trainingSummaryDuration;
	}


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


	public boolean isTrainerStatus() {
		return trainerStatus;
	}


	public void setTrainerStatus(boolean trainerStatus) {
		this.trainerStatus = trainerStatus;
	}


	public List<Integer> getYears() {
		return years;
	}


	public void setYears(List<Integer> years) {
		this.years = years;
	}


	public List<String> getMonths() {
		return months;
	}


	public void setMonths(List<String> months) {
		this.months = months;
	}


	public double getTrainingSummaryDuration() {
		return trainingSummaryDuration;
	}


	public void setTrainingSummaryDuration(double trainingSummaryDuration) {
		this.trainingSummaryDuration = trainingSummaryDuration;
	}
    
    
    
    
    

}
