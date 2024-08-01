package com.giri.sbapp.repoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.giri.sbapp.model.Job;
import com.giri.sbapp.repository.JobRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JobRepoImpl implements JobRepo {
	
	@Autowired
	EntityManager em;

	@Override
	public List<Integer> getIDList() {
		return null;
	}

	@Override
	public String save(Job job) {
		if(job != null){
			em.persist(job);
			return "Add Success";
		}else {
			return "Add Failure";
		}
		

	}

	@Override
	public Job findById(int id) {
		return em.find(Job.class, id);
	}

	@Override
	public List<Job> findAll() {
		String hql = "from Job";
		Query query = em.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public String update(Job job) {
		if(job != null) {
		em.merge(job);
		return "Update Success";
		}else {
			return "Update Failure";
		}

	}

	@Override
	public String deleteById(int id) {
		if(id != 0) {
		Job j = em.find(Job.class, id);
		em.remove(j);
		return "Delete Success";
		} else {
			return "Delete Failure";
		}

	}

}
