package com.comments.service;

import com.comments.entity.Comments;

import java.util.List;
import java.util.Optional;

public interface ICommentService {

    Comments getCommentsById(long id);

    List<Comments> getAllComments();

}
