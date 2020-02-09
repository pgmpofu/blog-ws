package com.eaworld.blog.dto;

import com.eaworld.blog.model.BlogPost;

public class CommentDTO {

	private long id;
	private String commentContent;
	private String authorFirstName;
	private String authorLastName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

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

	public BlogPost getBlog() {
		return blog;
	}

	public void setBlog(BlogPost blog) {
		this.blog = blog;
	}

	private BlogPost blog;

}
