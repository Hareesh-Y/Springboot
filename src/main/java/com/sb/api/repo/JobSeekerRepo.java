package com.sb.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.api.entity.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker ,Long>{

}
