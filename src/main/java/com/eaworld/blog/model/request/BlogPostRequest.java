package com.eaworld.blog.model.request;

/**
 *
 * @author Patience Mpofu
 * @date 02/08/2020 REST Request for blog posts
 */

public class BlogPostRequest {


	private String id;
	private String title;
	private String blogContent;

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
