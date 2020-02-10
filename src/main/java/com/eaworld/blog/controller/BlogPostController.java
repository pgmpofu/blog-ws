package com.eaworld.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.model.request.BlogPostRequest;
import com.eaworld.blog.model.request.CommentRequest;
import com.eaworld.blog.model.response.BlogPostResponse;
import com.eaworld.blog.service.CommentService;
import com.eaworld.blog.service.impl.BlogPostServiceImpl;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020 Controller for processing blog posts
 */
@RestController
@RequestMapping("/posts")
public class BlogPostController {

    @Autowired
    BlogPostServiceImpl blogPostService;

    @Autowired
    CommentService commentService;

    private static final String DEFAULT_PAGE_SIZE = "0";

    /**
     *
     * @param blogPostRequest
     * @return the created blog post
     */
    @PostMapping("create")
    public BlogPostResponse createBlogPost(@RequestBody BlogPostRequest blogPostRequest) {
    	BlogPostResponse blogPostResponse = new BlogPostResponse();
        BlogPostDTO blogPostDTO = new BlogPostDTO();
        BeanUtils.copyProperties(blogPostRequest, blogPostDTO);
        BlogPostDTO createdDTO = blogPostService.createBlogPost(blogPostDTO);
        BeanUtils.copyProperties(createdDTO, blogPostResponse);
        return blogPostResponse;

    }

    /**
     *
     * @param id
     * @return the requested blog post
     */
    @GetMapping("/{id}")
    public BlogPostResponse getBlogPostById(@PathVariable Long id) {
    	BlogPostResponse blogPostResponse = new BlogPostResponse();
        BlogPostDTO blogPostDTO = blogPostService.getBlogPost(id);
        BeanUtils.copyProperties(blogPostDTO, blogPostResponse);
        return blogPostResponse;
    }

    /**
     *
     * @param page - default is 0 for small data sets, otherwise use 1
     * @param limit - number of records we expect to receive
     * @return
     */
    @GetMapping
    public List<BlogPostResponse> getBlogPosts(@RequestParam(value = "page", defaultValue = DEFAULT_PAGE_SIZE) int page,
            @RequestParam(value = "limit", defaultValue = "25") int limit) {
        List<BlogPostResponse> blogPostResponses = new ArrayList<>();
        List<BlogPostDTO> blogPostDTOs = blogPostService.getBlogPosts(page, limit);
        blogPostDTOs.stream().map((blogPostDTO) -> {
        	BlogPostResponse blogPostResponse = new BlogPostResponse();
            BeanUtils.copyProperties(blogPostDTO, blogPostResponse);
            return blogPostResponse;
        }).forEachOrdered((blogPostResponse) -> {
            blogPostResponses.add(blogPostResponse);
        });
        return blogPostResponses;
    }

    /**
     *
     * @param blogPostId
     * @param commentRequest
     * @return an updated blog post with the new comments
     */
    @PutMapping("/{blogPostId}/comments/create")
    public BlogPostResponse createComment(@PathVariable Long blogPostId, @RequestBody CommentRequest commentRequest) {
    	BlogPostResponse blogPostResponse = new BlogPostResponse();
        BlogPostDTO blogPostDTO = blogPostService.getBlogPost(blogPostId);

        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setAuthorFirstName(commentRequest.getAuthorFirstName());
        commentDTO.setAuthorLastName(commentRequest.getAuthorLastName());
        commentDTO.setCommentContent(commentRequest.getCommentContent());
        CommentDTO storedDTO = commentService.createComment(commentDTO);

        Comment storedComment = new Comment();
        BeanUtils.copyProperties(storedDTO, storedComment);
        blogPostDTO.getComments().add(storedComment);
        BlogPostDTO updatedDTO = blogPostService.updateBlogPost(blogPostDTO);
        BeanUtils.copyProperties(updatedDTO, blogPostResponse);
        return blogPostResponse;
    }
}
