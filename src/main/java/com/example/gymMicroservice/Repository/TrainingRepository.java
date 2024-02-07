package com.example.gymMicroservice.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gymMicroservice.Entity.Trainee;
import com.example.gymMicroservice.Entity.Trainer;
import com.example.gymMicroservice.Entity.Training;


@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{

	 List<Training> findByTrainerUserUserName(String username);
	 
	
}