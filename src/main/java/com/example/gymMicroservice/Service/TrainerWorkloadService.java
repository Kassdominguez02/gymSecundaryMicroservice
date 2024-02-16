package com.example.gymMicroservice.Service;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.example.gymMicroservice.Entity.Training;
import com.example.gymMicroservice.Repository.TrainingRepository;
import com.example.gymMicroservice.dto.ActionType;
import com.example.gymMicroservice.dto.TrainingRequestDto;
import com.example.gymMicroservice.dto.TrainingWorkloadRequest;
import com.example.gymMicroservice.dto.TrainingWorkloadResponse;

@Service
public class TrainerWorkloadService {
	
	private static final Logger logger = Logger.getLogger(TrainerWorkloadService.class.getName());
	
	@Autowired
    private TrainingRepository trainingRepository;  
	
	
	


    public TrainingWorkloadResponse calculateTrainerWorkload(TrainingWorkloadRequest trainingDto) {
    	
    	
    	
        // Implementa la lógica para calcular el resumen mensual del entrenador
        String trainerUsername = trainingDto.getUsername();
        String trainerFirstName = trainingDto.getFirstName();
        String trainerLastName = trainingDto.getLastName();
        boolean trainerStatus = trainingDto.isActive();

        // Obtén la información de los entrenamientos del repository
        List<Training> trainings = trainingRepository.findByTrainerUserUserName(trainerUsername);

        // resumen mensual
        List<Integer> years = new ArrayList<>();
        List<String> months = new ArrayList<>();
        double trainingSummaryDuration = 0.0;

        // Calcular el resumen mensual
        for (Training training : trainings) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(training.getTrainingDate());

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1; // Los meses en Calendar van de 0 a 11

            if (!years.contains(year)) {
                years.add(year);
            }

            String monthString = getMonthString(month);
            if (!months.contains(monthString)) {
                months.add(monthString);
            }

            trainingSummaryDuration += training.getTrainingDuration();
        }


        return new TrainingWorkloadResponse(trainerUsername, trainerFirstName, trainerLastName, trainerStatus,
                years, months, trainingSummaryDuration);
    }
    
    
    private String getMonthString(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }
	
	
}
