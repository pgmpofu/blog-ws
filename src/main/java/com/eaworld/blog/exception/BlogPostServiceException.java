package com.eaworld.blog.exception;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Custom exception class for blog posts
 */
public class BlogPostServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -924208722636243193L;

    /**
     *
     */
    public BlogPostServiceException() {
		super();
	}

    /**
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public BlogPostServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

    /**
     *
     * @param message
     * @param cause
     */
    public BlogPostServiceException(String message, Throwable cause) {
		super(message, cause);
	}

    /**
     *
     * @param message
     */
    public BlogPostServiceException(String message) {
		super(message);
	}

    /**
     *
     * @param cause
     */
    public BlogPostServiceException(Throwable cause) {
		super(cause);
	}

}
