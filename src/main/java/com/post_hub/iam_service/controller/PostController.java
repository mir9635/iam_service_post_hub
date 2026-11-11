package com.post_hub.iam_service.controller;

import com.post_hub.iam_service.model.constans.ApiLogMessage;
import com.post_hub.iam_service.model.entity.Post;
import com.post_hub.iam_service.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("${end.point.posts}")
public class PostController {

    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    private final PostRepository postRepository;

    @GetMapping("${end.point.id}")
    public ResponseEntity<Post> getPostById(@PathVariable("id") Integer postId) {
        log.info(ApiLogMessage.POST_INFO_BY_ID.getMessage(postId));
        return postRepository.findById(postId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    log.info(ApiLogMessage.POST_INFO_BY_ID.getMessage(postId));
                    return ResponseEntity.notFound().build();
                });
    }
}
