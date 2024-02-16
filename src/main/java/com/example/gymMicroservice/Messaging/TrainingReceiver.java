package com.example.gymMicroservice.Messaging;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.gymMicroservice.Entity.Training;
import com.example.gymMicroservice.Service.TrainingService;
import com.example.gymMicroservice.dto.DeleteTrainingRequestDTO;


@Component
public class TrainingReceiver {
	
	private static final Logger logger = Logger.getLogger(TrainingReceiver.class.getName());

    @Autowired
    TrainingService trainingService;
	
	
	 @JmsListener(destination = "DeleteQueue")
	    public void deleteTrainingReceiver(DeleteTrainingRequestDTO request) {
		 
		 logger.info("Received training message");
		 logger.info("Training id: " + request.getTrainingId());
	        Training training = trainingService.deleteTraining(request.getTrainingId());
	        logger.info("Training with ID " + request.getTrainingId() + " deleted successfully");

	    }
}
