package com.learn.myjob.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.myjob.model.JobPost;
import com.learn.myjob.service.JobService;

@RestController
public class JobController {
	
	@Autowired
	JobService jobService;
	
	Logger log = Logger.getLogger("JobController");
	
	//view all jobs
	@GetMapping("/viewalljobs")
	public List<JobPost> viewAllJobs() {
		log.info("Fetching ALL Available jobs");
		return jobService.fetchAllJobs();	
	}
	
	//Add new Job
	@PostMapping("/addjob")
	public JobPost addJob(@Validated @RequestBody JobPost job) {
		log.info("Adding a new Job "+job);
		jobService.addNewJob(job);
		return job;//"Job Added Successfuly";
	}
		
	//update job //pass ID and update values
	@PutMapping("/update/{postId}")
	public Boolean updateJob(@PathVariable int postId, @RequestBody JobPost job) {
		return jobService.update(postId,job);	
	}
	
	//delete job by ID
	@DeleteMapping("/delete/{postId}")
	public Boolean deletJobById(@PathVariable int postId) {
		log.info("Deleting a PostId "+postId);
		return jobService.deleteJob(postId);
	}
	
	//view job by ID
	@GetMapping("/get/{postId}")
	public JobPost getJobByID(@PathVariable int postId) {
		log.info("Fetching a job with postId " +postId );
		return jobService.getJob(postId);
	 	
	}	

}
