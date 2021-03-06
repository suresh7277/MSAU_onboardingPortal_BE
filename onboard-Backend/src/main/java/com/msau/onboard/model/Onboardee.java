package com.msau.onboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="onboardees")
public class Onboardee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="name")
	private String name;
	@Column(name ="emailId")
	private String email;
	@Column(name ="demandId")
	private String demandId;
	@Column(name ="JoiningData")
	private String joiningDate;
	@Column(name ="JobRole")
	private String jobRole;
	@Column(name ="Job_Location")
	private String jobLocation;
	@Column(name ="DOB")
	private String DOB;
	@Column(name ="contact")
	private String contact;
	@Column(name ="adress")	
	private String adress;
	@Column(name ="BGC_status")
	private String bgcStatus;
	@Column(name ="onboarding_status")
	private String onboardingStatus;
	@Column(name ="MsHiringManager")
	private String MsHiringManager;
	@Column(name ="Experience")
	private String Experience;
	@Column(name ="Degree")
	private String Degree;
	@Column(name ="Skills")
	private String skills;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Onboardee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDemandId() {
		return demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBgcStatus() {
		return bgcStatus;
	}

	public void setBgcStatus(String bgcStatus) {
		this.bgcStatus = bgcStatus;
	}

	public String getOnboardingStatus() {
		return onboardingStatus;
	}

	public void setOnboardingStatus(String onboardingStatus) {
		this.onboardingStatus = onboardingStatus;
	}

	public String getMsHiringManager() {
		return MsHiringManager;
	}

	public void setMsHiringManager(String msHiringManager) {
		MsHiringManager = msHiringManager;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public Onboardee(String name, String email, String demandId, String joiningDate, String jobRole, String jobLocation,
			String dOB, String contact, String adress, String bgcStatus, String onboardingStatus,
			String msHiringManager, String experience, String degree,String skills) {
		super();
		this.name = name;
		this.email = email;
		this.demandId = demandId;
		this.joiningDate = joiningDate;
		this.jobRole = jobRole;
		this.jobLocation = jobLocation;
		DOB = dOB;
		this.contact = contact;
		this.adress = adress;
		this.bgcStatus = bgcStatus;
		this.onboardingStatus = onboardingStatus;
		MsHiringManager = msHiringManager;
		Experience = experience;
		Degree = degree;
		skills = skills;
	}
	
	
	
	

}
