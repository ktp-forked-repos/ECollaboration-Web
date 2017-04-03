package com.general.service;

import com.general.dao.entity.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by joanna on 3/15/17.
 */
public interface UserService {

    UserEntity findByName(String username);
    List<String> getRoles(String username);
}
