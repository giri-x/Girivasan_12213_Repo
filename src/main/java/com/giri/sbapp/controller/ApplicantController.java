package com.giri.sbapp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giri.sbapp.model.Applicant;
import com.giri.sbapp.serviceimpl.ApplicantServiceImpl;


@RestController
@RequestMapping("/applicant")
@CrossOrigin("*")
public class ApplicantController {
	
	
	@Autowired
	ApplicantServiceImpl service;

	@PostMapping
	public String insertApplicant(@RequestBody Applicant appl) {
		
		String msg="";
		try {
			service.addApplicant(appl);
			msg+="add Sucess";
			
		}catch(Exception e) {
			
			msg+="add Failure";
		}
		return msg;
	}
		
		@GetMapping("{id}")
		public Applicant getApplicantById (@PathVariable("id") int id) {
			return service.getApplicant(id);
		}
		@GetMapping("/all")
		public List<Applicant> getApplicants () {
			return service.getAllApplicant();
		}
		
		@PutMapping
		public String updateApplicant(@RequestBody Applicant appl) {
			
			String msg="";
			try {
				service.updateApplicant(appl);
				msg+="update Success";
				
			}catch(Exception e) {
				
				msg+="update Failure";
			}
			return msg;
		}
		
		@DeleteMapping("{id}")
		public String deleteApplicantById(@PathVariable("id") int id) {
			String msg="";
			try {
				service.deleteApplicantId(id);
				msg+="deleteSuccess";
				
			}catch(Exception e) {
				
				msg+="deleteFailure";
			}
			return msg;
			
			
		}

}
