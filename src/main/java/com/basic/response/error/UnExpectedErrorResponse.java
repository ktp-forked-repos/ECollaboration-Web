package com.basic.response.error;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class UnExpectedErrorResponse extends ErrorResponse {

    private static final int STATUS_CODE = 500;

    public UnExpectedErrorResponse(String errorMsg) {
        super(errorMsg);
        this.statusCode = STATUS_CODE;
    }
}
