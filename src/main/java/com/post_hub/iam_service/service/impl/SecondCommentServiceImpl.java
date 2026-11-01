package com.post_hub.iam_service.service.impl;

import com.post_hub.iam_service.service.CommentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service("advancedCommentService")
public class SecondCommentServiceImpl implements CommentService {

    private final List<String> comments = new ArrayList<String>();

    @Override
    public void createComment(String commentContent) {
        String advancedComment = "[" + LocalDateTime.now() + "] " + commentContent.toLowerCase();
        comments.add(advancedComment);
        System.out.println("Advanced Comment created: " + advancedComment);
    }
}
