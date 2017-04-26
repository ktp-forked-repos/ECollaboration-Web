package com.general.service;

import com.general.dao.UserEntityDAOImpl;
import com.general.dao.entity.RoleEntity;
import com.general.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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
        LinkedList<String> roleList = new LinkedList<>();
        UserEntity userEntity = findByName(username);
        Set<RoleEntity> roleEntities = userEntity.getRolesByUser();
        for(RoleEntity roleEntity: roleEntities){
            roleList.add(roleEntity.getRole().toString());
        }
        return roleList;
    }


}
