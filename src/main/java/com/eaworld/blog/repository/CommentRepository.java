package com.eaworld.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eaworld.blog.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
