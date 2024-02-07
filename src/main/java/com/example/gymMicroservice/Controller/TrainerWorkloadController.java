package com.example.gymMicroservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gymMicroservice.Service.TrainerWorkloadService;
import com.example.gymMicroservice.dto.TrainingWorkloadRequest;
import com.example.gymMicroservice.dto.TrainingWorkloadResponse;

@RestController
@RequestMapping("/trainer")
public class TrainerWorkloadController {
	
	@Autowired
    private TrainerWorkloadService trainerWorkloadService;

    @PostMapping("/workload")
    public ResponseEntity<TrainingWorkloadResponse> calculateTrainerWorkload(@RequestBody TrainingWorkloadRequest request) {
    	TrainingWorkloadResponse response = trainerWorkloadService.calculateTrainerWorkload(request);
        return ResponseEntity.ok(response);
    }

}
