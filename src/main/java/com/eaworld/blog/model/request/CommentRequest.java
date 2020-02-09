package com.eaworld.blog.model.request;

public class CommentRequest {
	
	private Long blogId;
	private Long commentId;
	public Long getBlogId() {
		return blogId;
	}
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
	public Long getCommentId() {
		return commentId;
	}
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

}
