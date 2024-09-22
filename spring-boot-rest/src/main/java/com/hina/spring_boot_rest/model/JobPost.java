package com.hina.spring_boot_rest.model;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Component
@Entity
public class JobPost {


	@Id
	private  Integer postId;
	private  String postProfile; 
	private  String postDesc;
	private  Integer reqExperience;
	private  List<String> postTechStack;
	
	
	public JobPost() {}
	
	public JobPost(Integer postId, String postProfile, String postDesc, Integer reqExperience,
			List<String> postTechStack) {
		super();
		this.postId = postId!=null? postId : 0;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.reqExperience = reqExperience;
		this.postTechStack = postTechStack;
	}
	public Integer getPostId() {
		return postId;
	}
	
	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostProfile() {
		return postProfile;
	}
	
	
	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}

	public String getPostDesc() {
		return postDesc;
	}
	
	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}

	public Integer getReqExperience() {
		return reqExperience;
	}
	
	public void setReqExperience(Integer reqExperience) {
		this.reqExperience = reqExperience;
	}

	public List<String> getPostTechStack() {
		return postTechStack;
	}
	
	public void setPostTechStack(List<String> postTechStack) {
		this.postTechStack = postTechStack;
	}

	@Override
	public String toString() {
		return "JobPost [postId=" + postId + ", postProfile=" + postProfile + ", postDesc=" + postDesc
				+ ", reqExperience=" + reqExperience + ", postTechStack=" + postTechStack + "]";
	}
	
	

}

