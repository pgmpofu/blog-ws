package com.eaworld.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.repository.CommentRepository;

/**
 * @author Patience Mpofu
 * @date 02/08/2020
 *
 */
@Service
public class CommentService {

	@Autowired
	CommentRepository commentRepository;

	/**
	 *
	 * @param commentId
	 * @return Id of the comment that we are searching for
	 */
	public Optional<CommentDTO> getComment(Long commentId) {
		Optional<Comment> comment = commentRepository.findById(commentId);
		Optional<CommentDTO> commentDTO = Optional.of(new CommentDTO());
		BeanUtils.copyProperties(comment, commentDTO);
		return commentDTO;
	}

	/**
	 *
	 * @param blogId - Get comments associated with the blogId
	 * @return all comments for a blog post
	 */
	public List<Comment> getComments(Long blogId) {
		return (List<Comment>) commentRepository.findAll();
	}

	public CommentDTO createComment(CommentDTO commentDTO) {
		Comment comment = new Comment();
		BeanUtils.copyProperties(commentDTO, comment);
		Comment storedComment = commentRepository.save(comment);
		CommentDTO storedCommentDTO = new CommentDTO();
		BeanUtils.copyProperties(storedComment, storedCommentDTO);
		return storedCommentDTO;
	}

}
