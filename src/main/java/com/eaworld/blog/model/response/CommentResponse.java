package com.eaworld.blog.model.response;

import com.eaworld.blog.model.Author;

public class CommentResponse {
	private String commentContent;
	private Author author;

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
