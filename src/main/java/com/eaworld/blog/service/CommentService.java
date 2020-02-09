package com.eaworld.blog.service;

import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.CommentDTO;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Service class for processing comments
 */
@Service
public interface CommentService {

    /**
     *
     * @param commentDTO
     * @return create comment data transfer object
     */
    CommentDTO createComment(CommentDTO commentDTO);
}
