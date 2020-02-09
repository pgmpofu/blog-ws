package com.eaworld.blog.model.request;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 */
public class CommentRequest {
	private long blogId;
	private String commentContent;
	private String authorFirstName;
	private String authorLastName;

    /**
     *
     * @return comment content
     */
    public String getCommentContent() {
		return commentContent;
	}

    /**
     *
     * @param commentContent
     */
    public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

    /**
     *
     * @return
     */
    public String getAuthorFirstName() {
		return authorFirstName;
	}

    /**
     *
     * @param authorFirstName
     */
    public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

    /**
     *
     * @return
     */
    public String getAuthorLastName() {
		return authorLastName;
	}

    /**
     *
     * @param authorLastName
     */
    public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

    /**
     *
     * @return
     */
    public long getBlogId() {
		return blogId;
	}

    /**
     *
     * @param blogId
     */
    public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

}
