package com.learn.myjob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.learn.myjob.model.JobPost;
import com.learn.myjob.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	JobService jobService;
	
	
	@ModelAttribute("jobPosts")
	public List<JobPost> jobPosts()
	{
		return jobService.fetchAllJobs();
	}
	@GetMapping({"/","home"})
	public String home() {
		
		System.out.println("In Home-->>");
		return "home.jsp";
	}
	
	@GetMapping("/viewalljobs")
	public String viewAllJobs() {
		
		System.out.println("In view-->>");
		
		
		return "viewalljobs.jsp";
	}
	
	@GetMapping("/addjob")
	public String addJob() {
		
		System.out.println("In add-->>");
		
		return "addjob.jsp";
	}
	
	@PostMapping("/handleForm")
	public String handleform(JobPost job) {
		jobService.addJob(job);
		System.out.println("In handle-->>");
		return "success.jsp";
	}

}
