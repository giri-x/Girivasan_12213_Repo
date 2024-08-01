package com.giri.sbapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.giri.sbapp.model.Job;

@SpringBootTest
class JobServiceImplTest {
	
	@Autowired
	JobServiceImpl jsi;
	
//	@Test
//	void testAddJob() {
//		Job jb = new Job(0,"Java","Joshua","Pass");
//		assertEquals("Success", jsi.addJob(jb));
//	}

//	@Test
//	void testGetJob() {
//		assertNotNull(jsi.getJob(5));
//	}
//
	@Test
	void testGetAllJob() {
		assertNotNull(jsi.getAllJob());
	}
//
//	@Test
//	void testUpdateJob() {
//		Job jb = new Job(0,"Java","Nadan","Pass");
//		assertEquals("Success", jsi.updateJob(jb));
//	}

//	@Test
//	void testDeleteJob() {
//		assertEquals("Deleted", jsi.deleteJob(4));
//	}


}
