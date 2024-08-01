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


import com.giri.sbapp.model.Job;

import com.giri.sbapp.serviceimpl.JobServiceImpl;

@RestController
@RequestMapping("/job")
@CrossOrigin("*")
public class JobController {
	@Autowired
	JobServiceImpl service;

	@PostMapping
	public String insertJob(@RequestBody Job job) {
		
		String msg="";
		try {
			service.addJob(job);
			msg="addSuccess";
			
		}catch(Exception e) {
			
			msg="addFailure";
		}
		return msg;
	}
		
		@GetMapping("{jid}")
		public Job getJobById (@PathVariable("jid") int id) {
			return service.getJob(id);
		}
		@GetMapping("/all")
		public List<Job> getJobs () {
			return service.getAllJob();
		}
		
		@PutMapping
		public String updateJob(@RequestBody Job job) {
			
			String msg="";
			try {
				service.updateJob(job);
				msg="updateSuccess";
				
			}catch(Exception e) {
				
				msg="updateFailure";
			}
			return msg;
		}
		
		@DeleteMapping("{jid}")
		public String deleteJobById(@PathVariable("jid") int id) {
			String msg="";
			try {
				service.deleteJob(id);
				msg="deleteSuccess";
				
			}catch(Exception e) {
				
				msg="deleteFailure";
			}
			return msg;
			
			
		}
		
		@GetMapping("/idlist")
		public List<Integer> getIDList(){
			return service.getAllId();
		}


}
