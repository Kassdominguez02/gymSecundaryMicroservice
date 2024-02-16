package com.example.gymMicroservice.dto;

import com.example.gymMicroservice.Entity.Training;

public class DeleteTrainingResponseDTO {
	
	private String message;
    private Training training;
    
    
	public DeleteTrainingResponseDTO(String message, Training training) {
		super();
		this.message = message;
		this.training = training;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Training getTraining() {
		return training;
	}


	public void setTraining(Training training) {
		this.training = training;
	}
    
    

}
