package com.giri.sbapp.model;

import jakarta.persistence.Column;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name = "Job_Table")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int jid;

	@Column
	private String field;

	@Column
	private String applicantName;

	@Column
	private String result;

	public Job() {
		super();
	}

	public Job(int jid, String field, String applicantName, String result) {
		super();
		this.jid = jid;
		this.field = field;
		this.applicantName = applicantName;
		this.result = result;
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
