package com.eaworld.blog.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.eaworld.blog.builder.TestDataFactory;
import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.exception.CommentServiceException;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.repository.CommentRepository;
import com.eaworld.blog.service.impl.CommentServiceImpl;

class CommentServiceImplTest {

	@InjectMocks
	CommentServiceImpl commentServiceImpl;

	@Mock
	CommentRepository commentRepository;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void testCreateComment() {
		when(commentRepository.save(Mockito.any(Comment.class))).thenReturn(TestDataFactory.createAComment());
		CommentDTO commentDTO = commentServiceImpl.createComment(TestDataFactory.createACommentDTO());
		assertNotNull(commentDTO);
		
	}
	
	@Test
	void testCreateComment_CommentNull() {
		when(commentRepository.save(Mockito.any(Comment.class))).thenReturn(TestDataFactory.createAComment());
		assertThrows(CommentServiceException.class, ()->commentServiceImpl.createComment(null) );
	}

}
