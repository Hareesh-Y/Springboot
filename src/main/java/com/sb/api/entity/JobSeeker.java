package com.sb.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private long Id;
	private String Name;
	private String[] skills;
	private String[] projectsDone;
	private String plansAboutAi;
	private double expectedCTC;
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String[] getProjectsDone() {
		return projectsDone;
	}
	public void setProjectsDone(String[] projectsDone) {
		this.projectsDone = projectsDone;
	}
	public String getPlansAboutAi() {
		return plansAboutAi;
	}
	public void setPlansAboutAi(String plansAboutAi) {
		this.plansAboutAi = plansAboutAi;
	}
	public double getExpectedCTC() {
		return expectedCTC;
	}
	public void setExpectedCTC(double expectedCTC) {
		this.expectedCTC = expectedCTC;
	}
	
	public JobSeeker(long id, String name, String[] skills, String[] projectsDone, String plansAboutAi,
			double expectedCTC) {
		super();
		Id = id;
		Name = name;
		this.skills = skills;
		this.projectsDone = projectsDone;
		this.plansAboutAi = plansAboutAi;
		this.expectedCTC = expectedCTC;
	}
	
	public JobSeeker() {}

}
