package com.general.service;

import com.general.dao.UserEntityDAOImpl;
import com.general.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by joanna on 3/15/17.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserEntityDAOImpl userEntityDAO;


    public UserEntity findByName(String username) {
        return userEntityDAO.getUserEntity(username);
    }

    @Override
    public List<String> getRoles(String username) {
        String role = findByName(username).getRoleByRole().getRole().toString();
        LinkedList<String> roleList = new LinkedList<>();
        roleList.add(role);
        return roleList;
    }


}
