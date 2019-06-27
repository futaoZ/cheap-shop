package com.perfect.cheapshop.cheapshop.exception;

import com.perfect.cheapshop.cheapshop.enums.ApiExceptionCode;

public class ResourceUserInfoNotCompleteException extends ApiException {
    private static final long serialVersionUID = 1L;

    public ResourceUserInfoNotCompleteException(String msg) {
        super(ApiExceptionCode.RESOURCE_USERINFO_NOT_COMPLETE.getValue(), msg);
    }
}
