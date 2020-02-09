package com.eaworld.blog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.eaworld.blog.model.Comment;


/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 */
@Repository
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long>{

}
