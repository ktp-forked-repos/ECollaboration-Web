package com.basic;

import com.basic.response.error.ResourceErrorResponse;

/**
 * Created by dailybird on 16/12/23.
 *
 */
public class Test {
    public static void main(String args[]){
//        System.out.println(new SuccessResponse("aa").getStatusCode());
        System.out.println(new ResourceErrorResponse("aa").getResponseData());
    }

}
