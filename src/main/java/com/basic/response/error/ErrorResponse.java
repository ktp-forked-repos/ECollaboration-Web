package com.basic.response.error;

import com.basic.response.Response;

/**
 * Created by dailybird on 16/12/23.
 *
 */
abstract public class ErrorResponse extends Response {

    private static final int STATUS_CODE = 500;

    /**
     * Constructor
     * @param errorMsg
     */
    public ErrorResponse(String errorMsg) {
        // TODO: 由于错误回复的格式确定，可以统一在 ErrorFormat 类中定义。
        super(new ErrorFormat(errorMsg));
        this.statusCode = STATUS_CODE;
    }

}
