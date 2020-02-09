package com.eaworld.blog.model.response;

import java.util.List;

import com.eaworld.blog.model.Comment;

/**
 *
 * @author Patience Mpofu
 * @date 02/08/2020 REST response for blog post requests
 */

public class BlogPostResponse {

	private long id;
	private String title;
	private String blogContent;
	private List<Comment> comments;

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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
