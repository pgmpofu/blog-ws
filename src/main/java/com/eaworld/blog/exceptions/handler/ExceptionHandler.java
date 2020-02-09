package com.eaworld.blog.exceptions.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.eaworld.blog.exception.BlogPostServiceException;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Handler for custom exceptions;
 */
@ControllerAdvice
public class ExceptionHandler {
	
    /**
     *
     * @param ex
     * @param req
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {BlogPostServiceException.class})
	public ResponseEntity<Object> handleException(BlogPostServiceException ex, WebRequest req) {
		return new ResponseEntity<>(ex.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
