package com.eaworld.blog.dto;

import java.util.List;

import com.eaworld.blog.model.BlogPost;

public class AuthorDTO {

	public AuthorDTO() {
		
	}

	private String firstName;
	private String lastName;
	private List<BlogPost> blogPosts;

	public AuthorDTO(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<BlogPost> getBlogPosts() {
		return blogPosts;
	}

	public void setBlogPosts(List<BlogPost> blogPosts) {
		this.blogPosts = blogPosts;
	}

}
