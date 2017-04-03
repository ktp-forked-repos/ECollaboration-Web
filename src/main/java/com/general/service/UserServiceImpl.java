package com.huhang.service;

import com.huhang.dao.UserEntityDaoImpl;
import com.huhang.entity.UserRolesEntity;
import com.huhang.entity.UsersEntity;
import com.huhang.model.UserDto;
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
    UserEntityDaoImpl userEntityDao;

    public List<UserDto> findAllUsers() {
        List<UsersEntity> userEntities = userEntityDao.getAllEntities(UsersEntity.class);
        List<UserDto> userDtos=new LinkedList<>();
        for(Iterator<UsersEntity> i = userEntities.listIterator(); i.hasNext(); ){
            UsersEntity usersEntity = i.next();
            UserDto userDto=new UserDto();
            userDto.setName(usersEntity.getUsername());
            userDto.setPassword(usersEntity.getPassword());
            setRolesForUserDto(usersEntity, userDto);
            userDtos.add(userDto);
        }
        return userDtos;
    }

    private void setRolesForUserDto(UsersEntity usersEntity, UserDto userDto) {
        List<String> roles=new LinkedList<>();
        for(Iterator<UserRolesEntity> j = usersEntity.getUserRolesByUsername().iterator(); j.hasNext(); ){
            roles.add(j.next().getRole());
        }
        userDto.setRoles(roles);
    }

    public ResponseEntity findById(long id) {
        UsersEntity usersEntity = userEntityDao.getEntity(id, UsersEntity.class);
        return new ResponseEntity<UsersEntity>(usersEntity, HttpStatus.OK);
    }

    public UserDto findByName(String name) {
        UsersEntity usersEntity = userEntityDao.getUserEntity(name);
        UserDto userDto=new UserDto();
        userDto.setName(usersEntity.getUsername());
        userDto.setPassword(usersEntity.getPassword());
        setRolesForUserDto(usersEntity, userDto);
        return userDto;

    }

    public void saveUser(UsersEntity usersEntity) {
        userEntityDao.createEntity(usersEntity);
    }

    public void updateUser(UserDto userDto) {
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setUsername(userDto.getName());
        usersEntity.setPassword(userDto.getPassword());
        usersEntity.setEnabled((byte)1);
        userEntityDao.updateEntity(usersEntity);
    }

    public void deleteUserById(long id) {
        userEntityDao.deleteEntity(id, UsersEntity.class);
    }

    public boolean isUserExist(String username) {

        return findByName(username)!=null;
    }




}
