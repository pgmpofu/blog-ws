package com.eaworld.blog.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentRequest {
	Long blogId;
	Long commentId;

}
