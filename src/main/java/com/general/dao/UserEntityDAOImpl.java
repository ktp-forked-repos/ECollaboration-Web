package com.general.dao;

import com.general.dao.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by joanna on 1/5/17.
 */
@Repository
public class UserEntityDAOImpl extends EntityDAOImpl {
    public UserEntity getUserEntity(String userName){
        String HQL="from UserEntity u where u.github='"+userName.toString()+"'";
        List<UserEntity> userEntities=getAllEntities(HQL ,UserEntity.class);
        if(userEntities.isEmpty()){
            return null;
        }else{
            return userEntities.get(0);
        }
    }
}
