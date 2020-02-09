package com.eaworld.blog.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.exception.CommentServiceException;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.repository.CommentRepository;
import com.eaworld.blog.service.CommentService;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 */
@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	public CommentDTO createComment(CommentDTO commentDTO) {
		try {
			Comment comment = new Comment();
			BeanUtils.copyProperties(commentDTO, comment);
			Comment storedComment = commentRepository.save(comment);
			CommentDTO storedDTO = new CommentDTO();
			BeanUtils.copyProperties(storedComment, storedDTO);
			return storedDTO;
		} catch (Exception ex) {
			throw new CommentServiceException(ex.getMessage(), ex.getCause());
		}
	}
}
