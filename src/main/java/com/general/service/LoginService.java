package com.general.service;

import com.general.dto.LoginDTO;
import com.general.dto.UserParam;

/**
 * Created by joanna on 1/4/17.
 */
public interface LoginService {
    public LoginDTO doLogin(UserParam userParam, String accessToken);
}
