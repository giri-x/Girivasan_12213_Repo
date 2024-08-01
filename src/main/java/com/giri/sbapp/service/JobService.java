package com.giri.sbapp.service;

import java.util.List;
import com.giri.sbapp.model.Job;

public interface JobService {
	public String addJob(Job job);
	public Job getJob(int id);
	public List<Job> getAllJob();
	public String updateJob(Job job);
	public String deleteJob(int id);
	
	List<Integer> getAllId();

}
