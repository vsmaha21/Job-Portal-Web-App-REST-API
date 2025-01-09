package com.learn.myjob.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.learn.myjob.model.JobPost;

@Component
public class JobService {

	Map<Integer, JobPost> map = new HashMap<>();

	public JobService() {
		map.put(1,new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
				List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));

		// Frontend Developer Job Post
		map.put(2,new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
				3, List.of("HTML", "CSS", "JavaScript", "React")));

		// Data Scientist Job Post
		map.put(3,new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
				List.of("Python", "Machine Learning", "Data Analysis")));

		// Network Engineer Job Post
		map.put(4,new JobPost(4, "Network Engineer",
				"Design and implement computer networks for efficient data communication", 5,
				List.of("Networking", "Cisco", "Routing", "Switching")));

		// Mobile App Developer Job Post
		map.put(5,new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
				List.of("iOS Development", "Android Development", "Mobile App")));

		// DevOps Engineer Job Post
		map.put(6,new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
				4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));

		// UI/UX Designer Job Post
		map.put(7,new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces", 2,
				List.of("User Experience", "User Interface Design", "Prototyping")));

		// Cybersecurity Analyst Job Post
		map.put(8,new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats", 4,
				List.of("Cybersecurity", "Network Security", "Incident Response")));

		// Full Stack Developer Job Post
		map.put(9,new JobPost(9, "Full Stack Developer", "Experience in both front-end and back-end development", 5,
				List.of("JavaScript", "Node.js", "React", "Spring", "MongoDB")));

		// Cloud Architect Job Post
		map.put(10,new JobPost(10, "Cloud Architect", "Design and implement cloud infrastructure solutions", 6,
				List.of("Cloud Computing", "AWS", "Azure", "Google Cloud")));

		// Job Post 11
		map.put(11,new JobPost(11, "Software Tester", "Ensure software quality through testing and validation", 3,
				List.of("Testing", "JUnit", "Selenium", "TestNG")));

		// Job Post 12
		map.put(12,new JobPost(12, "React Native Developer",
				"Develop cross-platform mobile applications using React Native", 2,
				List.of("React Native", "JavaScript", "Mobile App Development")));

		// Job Post 13
		map.put(13,new JobPost(13, "Business Analyst", "Analyze business processes and recommend improvements", 4,
				List.of("Business Analysis", "Requirements Gathering", "Process Modeling")));

		// Job Post 14
		map.put(14,new JobPost(14, "Embedded Systems Engineer",
				"Design and develop embedded systems for hardware applications", 5,
				List.of("Embedded Systems", "C/C++", "Microcontrollers", "RTOS")));

		// Job Post 15
		map.put(15,new JobPost(15, "Content Writer",
				"Create engaging and informative content for websites and publications", 2,
				List.of("Content Writing", "Copywriting", "SEO", "Creative Writing")));

		// Job Post 16
		map.put(16,new JobPost(16, "Business Intelligence Analyst",
				"Utilize data to provide insights and support decision-making", 4,
				List.of("Business Intelligence", "SQL", "Data Warehousing", "Tableau")));

		// Job Post 17
		map.put(17,new JobPost(17, "UX Researcher", "Conduct user research to inform the design process", 3,
				List.of("User Research", "Usability Testing", "Human-Computer Interaction")));

		// Job Post 18
		map.put(18,new JobPost(18, "Backend Developer", "Build server-side logic and databases for web applications", 4,
				List.of("Java", "Spring", "Node.js", "MongoDB")));

		// Job Post 19
		map.put(19,new JobPost(19, "Game Developer", "Create and optimize games for various platforms", 3,
				List.of("Game Development", "Unity", "C#", "3D Modeling")));

		// Job Post 20
		map.put(20,new JobPost(20, "IT Project Manager", "Lead and manage IT projects from initiation to completion", 6,
				List.of("Project Management", "Agile", "Scrum", "Risk Management")));
	}

	public List<JobPost> fetchAllJobs() {
	
		List<JobPost> jobs = new ArrayList<>( map.values());
		return jobs;
	}

	public boolean addNewJob(JobPost job) {
		return map.put(job.getPostId(),job)==null;
	}

	public Boolean update(int postId, JobPost job) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteJob(int postId) {
		// TODO Auto-generated method stub
		return map.remove(postId)!=null;
	}

	public JobPost getJob(int postId) {
		// TODO Auto-generated method stub
		return map.get(postId);
	}

}
