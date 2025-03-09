package com.sb.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.api.entity.JobSeeker;
import com.sb.api.repo.JobSeekerRepo;

@Service
public class JobSeekerServiceImpl implements JobSeekerService{
	
	@Autowired
	private JobSeekerRepo jobSeekerRepo;
	
	@Override
	public JobSeeker postJobSeeker(JobSeeker jobSeeker) {
		return jobSeekerRepo.save(jobSeeker);
	}

	@Override
	public List<JobSeeker> getAllJobSeekers() {
		return jobSeekerRepo.findAll();
	}

	@Override
	public Optional<JobSeeker> getJobSeekerById(long Id) {
		return jobSeekerRepo.findById(Id);
	}

	@Override
	public String updateJobSeeker(long Id,JobSeeker jobSeeker) {
		
		Optional<JobSeeker> getJobSeeker = jobSeekerRepo.findById(Id);
		
		if(getJobSeeker.isPresent()) {
			
			JobSeeker existingjobSeeker = getJobSeeker.get();
			
			existingjobSeeker.setName(jobSeeker.getName());
			existingjobSeeker.setSkills(jobSeeker.getSkills());
			existingjobSeeker.setProjectsDone(jobSeeker.getProjectsDone());
			existingjobSeeker.setPlansAboutAi(jobSeeker.getPlansAboutAi());
			existingjobSeeker.setExpectedCTC(jobSeeker.getExpectedCTC());	
			
			jobSeekerRepo.save(existingjobSeeker);
			
			return "jobseeker updated successfully";
			
		}	
		return "job seeker not found with id"+" "+Id;
	}

	@Override
	public String deleteJobSeeker(long Id) {
		
		Optional<JobSeeker> JobSeekerToBeDeleted = jobSeekerRepo.findById(Id);
		
		if(JobSeekerToBeDeleted.isPresent()) {
			jobSeekerRepo.deleteById(Id);
			return "Job seeker deleted successfully";
		}
	return "job seeker not found with id"+" "+Id;
	}

}
