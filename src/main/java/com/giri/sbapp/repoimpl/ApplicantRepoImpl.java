package com.giri.sbapp.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.giri.sbapp.model.Applicant;
import com.giri.sbapp.repository.ApplicantRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ApplicantRepoImpl implements ApplicantRepo {
	
	@Autowired
	EntityManager em;

	@Override
	public String save(Applicant appl) {
		if(appl != null) {
			em.persist(appl);
			return "Add Success";
			
		}else {
			return "Add Failure";
		}
		

	}

	@Override
	public Applicant findById(int id) {
		return em.find(Applicant.class, id);
	}

	@Override
	public List<Applicant> findAll() {
		String hql = "from Applicant";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public void update(Applicant appl) {
		em.merge(appl);

	}

	@Override
	public String deleteById(int id) {
		if(id != 0) {
		Applicant a = em.find(Applicant.class, id);
		em.remove(a);
		return "deleted";
		}
		else
		{
			return "Failed";
		}

	}

}
