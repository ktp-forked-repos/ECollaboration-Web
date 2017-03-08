package com.basic.response.error;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class DBErrorResponse extends ErrorResponse{

    private static final int STATUS_CODE = 500;

    public DBErrorResponse(String errorMsg) {
        super(errorMsg);
        this.statusCode = STATUS_CODE;
    }
}
