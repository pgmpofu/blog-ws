package com.eaworld.blog.builder;

import java.util.ArrayList;
import java.util.List;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.model.Comment;

public class TestDataFactory {

	public static BlogPost createABlogPost() {
		BlogPost blogPost = new BlogPost();
		blogPost.setId(1L);
		blogPost.setAuthorFirstName("Jonah");
		blogPost.setAuthorLastName("Fish");
		blogPost.setTitle("Test Title");
		blogPost.setBlogContent("This is a test blog");
		return blogPost;
	}
	
	public static BlogPostDTO createABlogPostDTO() {
		BlogPostDTO blogPostDTO = new BlogPostDTO();
		blogPostDTO.setId(1L);
		blogPostDTO.setAuthorFirstName("Jonah");
		blogPostDTO.setAuthorLastName("Fish");
		blogPostDTO.setTitle("Test Title");
		blogPostDTO.setBlogContent("This is a test blog");
		return blogPostDTO;
	}
	
	public static  List<BlogPost> createBlogPosts() {
		List<BlogPost> blogPosts= new ArrayList<>();
		BlogPost aBlogPost = new BlogPost();
		aBlogPost.setId(1L);
		aBlogPost.setAuthorFirstName("Jonah");
		aBlogPost.setAuthorLastName("Fish");
		aBlogPost.setTitle("Test Title");
		aBlogPost.setBlogContent("This is a test blog");
		blogPosts.add(aBlogPost);
		
		BlogPost bBlogPost = new BlogPost();
		bBlogPost.setId(2L);
		bBlogPost.setAuthorFirstName("Janine");
		bBlogPost.setAuthorLastName("Fisher");
		bBlogPost.setTitle("Test Title for Janine");
		bBlogPost.setBlogContent("This is a test blog for Janine");
		blogPosts.add(bBlogPost);
		
		BlogPost cBlogPost = new BlogPost();
		cBlogPost.setId(3L);
		cBlogPost.setAuthorFirstName("Blanca");
		cBlogPost.setAuthorLastName("Star");
		cBlogPost.setTitle("Test STAR technique");
		cBlogPost.setBlogContent("This is a test blog for Blanca");
		blogPosts.add(cBlogPost);
		
		return blogPosts;
	}
	
	public static Comment createAComment() {
		Comment comment = new Comment();
		comment.setAuthorFirstName("Test");
		comment.setAuthorLastName("Testing");
		comment.setCommentContent("This is just a test content thing");
		return comment;
	}
	
	public static CommentDTO createACommentDTO() {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setAuthorFirstName("Test");
		commentDTO.setAuthorLastName("Testing");
		commentDTO.setCommentContent("This is just a test content thing");
		return commentDTO;
	}
}
