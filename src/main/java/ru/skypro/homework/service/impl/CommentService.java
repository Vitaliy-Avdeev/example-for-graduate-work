package ru.skypro.homework.service.impl;


import org.springframework.stereotype.Service;

import ru.skypro.homework.dto.CommentDto;
import ru.skypro.homework.dto.CommentsDto;
import ru.skypro.homework.dto.CreateOrUpdateCommentDto;


@Service
public class CommentService {
    public CommentsDto getComments(Integer id) {
        return null;
    }

    public CommentDto addComment(Integer id, CreateOrUpdateCommentDto createCommentDto) {
        return null;
    }

    public void deleteComment(Integer commentId) {
    }

    public CommentDto updateComment(Integer commentId, CommentDto commentDto) {
        return null;
    }
}
