package com.msau.onboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msau.onboard.exception.ResourceNotFoundException;
import com.msau.onboard.model.Onboardee;
import com.msau.onboard.repository.OnboardeeRepository;

@CrossOrigin
@RestController
@RequestMapping("/")
public class OnboardeeController {
	
	@Autowired
	private OnboardeeRepository onboardeeRepository;
	
	//listing onboardees
	@GetMapping("/onboardees")
	public List<Onboardee> getAllOnboardee(){
		return onboardeeRepository.findAll();
	}
	
	//create onboardee
	@PostMapping("/onboardees")
	public Onboardee createOnboardee(@RequestBody Onboardee onboardee){
		return onboardeeRepository.save(onboardee);
	}
	//find onboardee by id
	@GetMapping("/onboardees/{id}")
	public ResponseEntity<Onboardee> getOnboardeeById(@PathVariable Long id) {
		Onboardee onboardee = onboardeeRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Onboardee not found with id "+ id ));
		return ResponseEntity.ok(onboardee);
	}
	
	//update onboradee
	@PutMapping("/onboardees/{id}")
	public ResponseEntity<Onboardee> updateOnboardee(@PathVariable Long id,@RequestBody Onboardee onboardeeDetails){
		Onboardee onboardee = onboardeeRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Onboardee not found with id "+ id ));
		onboardee.setId(onboardeeDetails.getId());
		onboardee.setName(onboardeeDetails.getName());
		onboardee.setEmail(onboardeeDetails.getEmail() );
		onboardee.setBgcStatus(onboardeeDetails.getBgcStatus() );
		onboardee.setAdress(onboardeeDetails.getAdress() );
		onboardee.setContact(onboardeeDetails.getContact() );
		onboardee.setDegree(onboardeeDetails.getDegree() );
		onboardee.setDemandId(onboardeeDetails.getDemandId() );
		onboardee.setDOB(onboardeeDetails.getDOB() );
		onboardee.setExperience(onboardeeDetails.getExperience() );
		onboardee.setJobLocation(onboardeeDetails.getJobLocation() );
		onboardee.setJobRole(onboardeeDetails.getJobRole() );
		onboardee.setJoiningDate(onboardeeDetails.getJoiningDate());
		onboardee.setMsHiringManager(onboardeeDetails.getMsHiringManager() );
		onboardee.setOnboardingStatus(onboardeeDetails.getOnboardingStatus() );
		onboardee.setSkills(onboardeeDetails.getSkills() );
		
		
		Onboardee updatedOnboardee = onboardeeRepository.save(onboardee);
		return ResponseEntity.ok(updatedOnboardee);
	}
	
	//delete onboardee
	@DeleteMapping("/onboardees/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteOnboardee(@PathVariable Long id){
		Onboardee onboardee = onboardeeRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Onboardee not found with id "+ id ));
		onboardeeRepository.delete(onboardee);
		Map<String,Boolean> status = new HashMap<>();
		status.put("Deletd", Boolean.TRUE);
		return ResponseEntity.ok(status);
	}
	
	
	
	
	
	
	

}
