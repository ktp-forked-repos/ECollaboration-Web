package com.basic.response;

/**
 * Created by dailybird on 16/12/23.
 *
 */
abstract public class Response {

    // 由 Action 层返回的格式化后的数据
    protected Object data = null;
    protected int statusCode;

    /**
     * Constructor
     * @param data
     */
    public Response(Object data) {
        this.data = data;
    }

    /**
     * Get HTTP status code.
     * @return
     */
    public int getStatusCode(){
        return this.statusCode;
    }

    /**
     * Get Status data.
     * @return
     */
    public Object getResponseData(){
        return this.data;
    }

    public void send(){
        // TODO: 根据 Spring MVC 的写法输出 API 数据（ 携带 Header ）
    }

    public void rendor(){
        // TODO: 根据结果渲染视图

    }
}
