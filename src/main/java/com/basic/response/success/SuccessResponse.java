package com.basic.response.success;

import com.basic.response.Response;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class SuccessResponse extends Response {

    private static final int STATUS_CODE = 200;

    public SuccessResponse(Object data) {
        super(data);
        this.statusCode = STATUS_CODE;
    }

}
