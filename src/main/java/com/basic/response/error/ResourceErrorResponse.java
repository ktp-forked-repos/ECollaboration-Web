package com.basic.response.error;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class ResourceErrorResponse extends ErrorResponse {

    private static final int STATUS_CODE = 410;

    public ResourceErrorResponse(String errorMsg) {
        super(errorMsg);
        this.statusCode = STATUS_CODE;
    }

}
