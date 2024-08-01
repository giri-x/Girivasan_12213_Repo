package com.giri.sbapp.service;

import java.util.List;

import com.giri.sbapp.model.Applicant;

public interface ApplicantService {
	public String addApplicant(Applicant appl);
	public Applicant getApplicant(int id);
	public List<Applicant> getAllApplicant();
	public void updateApplicant(Applicant appl);
	public String deleteApplicantId(int id);

}
