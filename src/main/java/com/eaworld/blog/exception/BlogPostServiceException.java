package com.eaworld.blog.exception;

public class BlogPostServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -924208722636243193L;

	public BlogPostServiceException() {
		super();
	}

	public BlogPostServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BlogPostServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlogPostServiceException(String message) {
		super(message);
	}

	public BlogPostServiceException(Throwable cause) {
		super(cause);
	}

}
