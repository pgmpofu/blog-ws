package com.eaworld.blog.dto;

import java.util.List;

import com.eaworld.blog.model.Comment;

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

	private String authorFirstName;
	private String authorLastName;
	private List<Comment> comments;

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
