package com.post_hub.iam_service.utils;

import com.post_hub.iam_service.model.constans.ApiConstants;

public class ApiUtils {

    public static String getMethodName() {
        try {
            return Thread.currentThread().getStackTrace()[1].getMethodName();
        } catch (Exception cause) {
            return ApiConstants.UNDEFINED;
        }
    }
}
