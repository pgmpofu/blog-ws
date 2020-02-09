package com.eaworld.blog.exception;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Custom exception class for comments
 */
public class CommentServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -924208722636243193L;

    /**
     *
     */
    public CommentServiceException() {
		super();
	}

    /**
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public CommentServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

    /**
     *
     * @param message
     * @param cause
     */
    public CommentServiceException(String message, Throwable cause) {
		super(message, cause);
	}

    /**
     *
     * @param message
     */
    public CommentServiceException(String message) {
		super(message);
	}

    /**
     *
     * @param cause
     */
    public CommentServiceException(Throwable cause) {
		super(cause);
	}

}
