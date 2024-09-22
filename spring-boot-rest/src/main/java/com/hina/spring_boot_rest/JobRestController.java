package com.hina.spring_boot_rest;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hina.spring_boot_rest.model.JobPost;
import com.hina.spring_boot_rest.service.JobService;

@RestController
//@CrossOrigin(origins="http://localhost:3000")
public class JobRestController {
	
	@Autowired
	private JobService service;
	
	@GetMapping(path="jobPosts",produces= {"application/json"})
	public List<JobPost> getAllJobs() {
		return service.getAllJobPost();
	}
	
	@GetMapping("jobPost/{postId}")
	public JobPost getJob(@PathVariable("postId") int postId) {
		return service.getJob(postId);
		
	}
	
	@PostMapping("jobPost")
	public JobPost addJob(@RequestBody JobPost jobPost) {
		service.addJobPost(jobPost);
		return service.getJob(jobPost.getPostId());
	}
	
	@PutMapping("jobPost")
	public JobPost updateJob(@RequestBody JobPost jobPost) {
		service.updateJobPost(jobPost);
		return service.getJob(jobPost.getPostId());
	}
	
	@DeleteMapping("jobPost/{postId}")
	public String deleteJob(@PathVariable int postId) {
		service.deleteJob(postId);
		return "Deleted";
		
	}
	
//	@GetMapping("load")
//	public String loadData() {
//		
//		service.load();
//		return "success";
//		
//	}
	
	@GetMapping("jobPosts/keyword/{keyword}")
	public List<JobPost> searchByKeyword(@PathVariable("keyword")String keyword){
		return service.search(keyword);
	}
	
}



