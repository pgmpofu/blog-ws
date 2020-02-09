package com.eaworld.blog.model.response;

/**
 *
 * @author Patience Mpofu
 * @date 02/08/2020 REST response for blog post requests
 */

public class BlogPostResponse {

	private long id;
	private String title;
	private String blogContent;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
