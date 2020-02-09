package com.eaworld.blog.exception;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Custom exception class for blog posts
 */
public class AuthorServiceException extends RuntimeException{


    /**
	 * 
	 */
	private static final long serialVersionUID = 7140022372152051988L;

	/**
     *
     */
    public AuthorServiceException() {
		super();
	}

    /**
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public AuthorServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

    /**
     *
     * @param message
     * @param cause
     */
    public AuthorServiceException(String message, Throwable cause) {
		super(message, cause);
	}

    /**
     *
     * @param message
     */
    public AuthorServiceException(String message) {
		super(message);
	}

    /**
     *
     * @param cause
     */
    public AuthorServiceException(Throwable cause) {
		super(cause);
	}

}
