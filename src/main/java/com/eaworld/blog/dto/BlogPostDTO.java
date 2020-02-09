package com.eaworld.blog.dto;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Data transfer object for blog posts
 */
public class BlogPostDTO {

	private long id;
	private String title;
	private String blogContent;

    /**
     *
     * @return
     */
    public String getTitle() {
		return title;
	}

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
		this.title = title;
	}

    /**
     *
     * @return
     */
    public String getBlogContent() {
		return blogContent;
	}

    /**
     *
     * @param blogContent
     */
    public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

    /**
     *
     * @return
     */
    public long getId() {
		return id;
	}

    /**
     *
     * @param id
     */
    public void setId(long id) {
		this.id = id;
	}

}
