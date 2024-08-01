package com.giri.sbapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Job;
import com.giri.sbapp.repository.JobRepo;
import com.giri.sbapp.service.JobService;

@Service
public class JobServiceImpl implements JobService {
	
	JobRepo repo;
	
	public JobServiceImpl(JobRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addJob(Job job) {
		return(repo.save(job));

	}

	@Override
	public Job getJob(int id) {
		
		return repo.findById(id);
	}

	@Override
	public List<Job> getAllJob() {
		return repo.findAll();
	}

	@Override
	public String updateJob(Job job) {
		return(repo.update(job));

	}

	@Override
	public String deleteJob(int id) {
		return(repo.deleteById(id));

	}

	@Override
	public List<Integer> getAllId() {
		return repo.getIDList();
	}

}
