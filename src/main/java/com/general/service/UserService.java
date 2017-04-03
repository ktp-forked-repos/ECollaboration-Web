package com.huhang.service;

import com.huhang.entity.UsersEntity;
import com.huhang.model.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by joanna on 3/15/17.
 */
public interface UserService {
    ResponseEntity findById(long id);

    UserDto findByName(String name);

    void saveUser(UsersEntity usersEntity);

    void updateUser(UserDto userDto);

    void deleteUserById(long id);

    List<UserDto> findAllUsers();

    //void deleteAllUsers();

    public boolean isUserExist(String username);

}
