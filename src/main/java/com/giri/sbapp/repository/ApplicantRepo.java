package com.giri.sbapp.repository;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.giri.sbapp.model.Applicant;



@Repository
public interface ApplicantRepo {

	String save(Applicant appl);

	Applicant findById(int id);

	List<Applicant> findAll();

	void update(Applicant appl);

	String deleteById(int id);
	

}
