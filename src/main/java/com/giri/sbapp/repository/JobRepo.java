package com.giri.sbapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.giri.sbapp.model.Job;
@Repository
public interface JobRepo  {
	@Query("select jid from Job")
	public List<Integer> getIDList();

	public String save(Job job);

	public Job findById(int id);

	public List<Job> findAll();

	public String update(Job job);

	public String deleteById(int id);

}
