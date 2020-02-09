package com.eaworld.blog.model.request;

import java.util.List;

import javax.persistence.OneToMany;

import com.eaworld.blog.model.Comment;

/**
 *
 * @author Patience Mpofu
 * @date 02/08/2020 REST Request for blog posts
 */

public class BlogPostRequest {


	private String id;
	private String title;
	private String blogContent;
	private String authorFirstName;
	private String authorLastName;
	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	private List<Comment> comments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

}
