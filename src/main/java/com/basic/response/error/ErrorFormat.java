package com.basic.response.error;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class ErrorFormat {
    private String errorMsg = null;

    public ErrorFormat(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "ErrorFormat{" +
                "errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
