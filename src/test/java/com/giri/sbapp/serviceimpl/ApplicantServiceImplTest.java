package com.giri.sbapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.giri.sbapp.model.Applicant;
@SpringBootTest
class ApplicantServiceImplTest {

	@Autowired
	ApplicantServiceImpl asi;
//
//	@Test
//	void testAddApplicant() {
//		Applicant ap = new Applicant(0,"23 years","Java",null,null);
//		assertEquals("Success", asi.addApplicant(ap));
//		
//	}

	
	
	
//	@Test
//	void testGetApplicant() {
//		assertNotNull(asi.getApplicant(3));
//	}
//
	@Test
	void testGetAllApplicant() {
		assertNotNull(asi.getAllApplicant());
	}
//
//	@Test
//	void testUpdateApplicant() {
//		Applicant ap = new Applicant(0,"23 years","Java",null,null);
//		assertEquals("Success", asi.addApplicant(ap));
//	}

//	@Test
//	void testDeleteApplicantId() {
//		assertEquals("deleted", asi.deleteApplicantId(25));
//	}

}
