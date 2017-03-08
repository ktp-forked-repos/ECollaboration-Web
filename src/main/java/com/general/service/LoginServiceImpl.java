package com.general.service;

import com.general.dto.LoginDTO;
import com.general.dto.UserParam;
import com.general.dao.UserEntityDAOImpl;
import com.general.dao.entity.AccessEntity;
import com.general.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by joanna on 1/4/17.
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserEntityDAOImpl userEntityDAO;

    @Override
    public LoginDTO doLogin(UserParam userParam, String accessToken) {
        System.out.println("doLogin");
        if(!accessToken.equals("-1")){
            return new LoginDTO(accessToken,true);
        }
        UserEntity userEntity=userEntityDAO.getUserEntity(userParam.getUsername());
        if(userEntity==null){
            //no such user with this userName
            System.out.println("no such user with this userName");
            return new LoginDTO(null,false);
        }
        if((userParam.getUsername().equals(userEntity.getGithub()))&&(userParam.getPassword().equals(userEntity.getPassword()))){
            //username and password is correct
            System.out.println("username and password is correct");
            AccessEntity accessEntity=new AccessEntity();
            Integer userId=userEntity.getId();
            accessEntity.setUserByUserId(userEntity);
            accessToken=String.valueOf(userEntityDAO.createEntity(accessEntity));
            return new LoginDTO(accessToken,true);
        }else{
            //password is incorrect
            return new LoginDTO(null,false);
        }
    }
}
