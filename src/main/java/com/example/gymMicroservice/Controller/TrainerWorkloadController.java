package com.example.gymMicroservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gymMicroservice.Entity.Training;
import com.example.gymMicroservice.Service.TrainerWorkloadService;
import com.example.gymMicroservice.Service.TrainingService;
import com.example.gymMicroservice.dto.DeleteTrainingRequestDTO;
import com.example.gymMicroservice.dto.DeleteTrainingResponseDTO;
import com.example.gymMicroservice.dto.TrainingWorkloadRequest;
import com.example.gymMicroservice.dto.TrainingWorkloadResponse;

@RestController
@RequestMapping("/trainer")
public class TrainerWorkloadController {
	
	@Autowired
    private TrainerWorkloadService trainerWorkloadService;
	
	@Autowired
    TrainingService trainingService;

    @PostMapping("/workload")
    public ResponseEntity<TrainingWorkloadResponse> calculateTrainerWorkload(@RequestBody TrainingWorkloadRequest request) {
    	TrainingWorkloadResponse response = trainerWorkloadService.calculateTrainerWorkload(request);
    	
        return ResponseEntity.ok(response);
    }
    
   /** @DeleteMapping("/{id}")
    public DeleteTrainingResponseDTO deleteTraining(@PathVariable("id") Long id) {
    	
    	// Registro de mensajes de depuración
        System.out.println("receiving request to delete training. Training ID: {}"+ id);
        
        Training training = trainingService.deleteTraining(id);
        return new DeleteTrainingResponseDTO("OK", training);
    }**/
    
    /**
 // Este método maneja las solicitudes de eliminación de entrenamiento recibidas a través de la cola JMS
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteTrainingFromQueue(@RequestBody DeleteTrainingRequestDTO request) {
        try {
            Training training = trainingService.deleteTraining(request.getTrainingId());
            return ResponseEntity.ok("Training with ID " + request.getTrainingId() + " deleted successfully");
        } catch (Exception e) {
            // Manejo de errores
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting training: " + e.getMessage());
        }
    }
**/
}
