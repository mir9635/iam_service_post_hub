package com.post_hub.iam_service.model.request.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest implements Serializable {

    private String title;
    private String content;
    private Integer likes;
}
