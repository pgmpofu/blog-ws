package com.eaworld.blog.service;

import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.CommentDTO;

@Service
public interface CommentService {
	CommentDTO createComment(CommentDTO commentDTO);
}
