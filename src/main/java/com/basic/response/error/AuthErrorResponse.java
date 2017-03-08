package com.basic.response.error;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class AuthErrorResponse extends ErrorResponse {

    private static final int STATUS_CODE = 401;

    public AuthErrorResponse(String errorMsg) {
        super(errorMsg);
        this.statusCode = STATUS_CODE;
    }
}
