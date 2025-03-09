package com.sb.api.service;

import java.util.List;
import java.util.Optional;

import com.sb.api.entity.JobSeeker;

public interface JobSeekerService {
	
	public JobSeeker postJobSeeker(JobSeeker jobSeeker);
	public List<JobSeeker> getAllJobSeekers();
	public Optional<JobSeeker> getJobSeekerById(long Id);
	public String updateJobSeeker(long Id,JobSeeker jobSeeker);
	public String deleteJobSeeker(long Id);
}
