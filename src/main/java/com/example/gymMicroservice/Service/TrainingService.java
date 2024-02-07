package com.example.gymMicroservice.Service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gymMicroservice.Entity.Trainee;
import com.example.gymMicroservice.Entity.Trainer;
import com.example.gymMicroservice.Entity.Training;
import com.example.gymMicroservice.Entity.TrainingType;

import com.example.gymMicroservice.Exception.TrainingNotFoundException;

import com.example.gymMicroservice.Repository.TrainingRepository;
import com.example.gymMicroservice.dto.TrainingWorkloadRequest;

import jakarta.transaction.Transactional;

import java.util.logging.Logger;

@Service
public class TrainingService {
	
	
private static final Logger logger = Logger.getLogger(TrainingService.class.getName());
	   
	

	
	private TrainingRepository trainingRepository;

	@Autowired
	public TrainingService(TrainingRepository trainingRepository) {
		
		this.trainingRepository = trainingRepository;
	}
	
	
	
	private void addTraining(Training training) {
        
        trainingRepository.save(training); 
        }
	
	private void deleteTraining(Training training) {
        
        Long trainingIdToDelete = training.getIdTraining();

        // Elimina el entrenamiento de la base de datos
        trainingRepository.deleteById(trainingIdToDelete);

        
    }
	
	
	
	
}

