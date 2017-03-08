package com.general.dto;

/**
 * Created by joanna on 1/4/17.
 */
public class LoginDTO {
    private String accessToken;
    private Boolean success;

    public LoginDTO() {
    }

    public LoginDTO(String accessToken, Boolean success) {
        this.accessToken = accessToken;
        this.success = success;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
