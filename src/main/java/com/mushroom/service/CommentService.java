package com.mushroom.service;

import com.mushroom.po.Comment;

import java.util.List;

/**
 * 博客评论的逻辑处理
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
