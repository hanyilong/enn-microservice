package com.enn.microservice.common.exception.auth;


import com.enn.microservice.common.constant.CommonConstants;
import com.enn.microservice.common.exception.BaseException;

/**
 * Created by ace on 2017/9/8.
 */
public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
