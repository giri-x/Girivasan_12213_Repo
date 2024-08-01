package com.giri.sbapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.giri.sbapp.model.Applicant;
import com.giri.sbapp.repository.ApplicantRepo;
import com.giri.sbapp.service.ApplicantService;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	
	ApplicantRepo repo;
	
	

	public ApplicantServiceImpl(ApplicantRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addApplicant(Applicant appl) {
		return(repo.save(appl));

	}

	@Override
	public Applicant getApplicant(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Applicant> getAllApplicant() {
		return repo.findAll();
	}

	@Override
	public void updateApplicant(Applicant appl) {
		repo.update(appl);

	}

	@Override
	public String deleteApplicantId(int id) {
		return(repo.deleteById(id));

	}

}
