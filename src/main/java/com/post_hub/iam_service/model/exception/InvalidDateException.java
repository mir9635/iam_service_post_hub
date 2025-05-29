package com.post_hub.iam_service.model.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class InvalidDateException extends RuntimeException {

    public InvalidDateException(String message) {
        super(message);
    }

}
