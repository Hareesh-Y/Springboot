package com.sb.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.api.entity.JobSeeker;
import com.sb.api.service.JobSeekerService;

@RestController
@RequestMapping("/Job")
public class JobSeekerController {
	
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@PostMapping("/save")
	public JobSeeker postJobSeekerContro(@RequestBody JobSeeker jobSeeker) {
		JobSeeker saveJobSeeker = jobSeekerService.postJobSeeker(jobSeeker);
		return saveJobSeeker;
	}
	
	@GetMapping("/get")
	public List<JobSeeker> getAllJobSeekersContro(){
		List<JobSeeker> allJobSeekers = jobSeekerService.getAllJobSeekers();
		return allJobSeekers;
	}
	
	@GetMapping("/get/{Id}")
	public Optional<JobSeeker> getJobSeekerByIdContro(@PathVariable long Id){
		Optional<JobSeeker> JobSeekerById = jobSeekerService.getJobSeekerById(Id);
		return JobSeekerById;
	}
	
	@PutMapping("/update/{Id}")
	public String updateJobSeekerContro(@PathVariable long Id,@RequestBody JobSeeker jobSeeker) {
		String updatedJobSeeker = jobSeekerService.updateJobSeeker(Id, jobSeeker);
		return updatedJobSeeker;
	}
	
	@DeleteMapping("/delete/{Id}")
	public String deleteJobSeeker(@PathVariable long Id) {
		String deletedJobSeeker = jobSeekerService.deleteJobSeeker(Id);
		return deletedJobSeeker;
	}
	
}
