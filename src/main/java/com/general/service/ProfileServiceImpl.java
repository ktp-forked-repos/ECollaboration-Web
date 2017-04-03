package com.general.service;

import com.general.Enum.EmailType;
import com.general.Enum.Gender;
import com.general.dao.EntityDAO;
import com.general.dao.entity.StudentEntity;
import com.general.dao.entity.UserEntity;
import com.general.dto.DetailedStudentProfileDTO;
import com.general.dto.ErrorDTO;
import com.general.dto.ProfileDTO;
import com.general.param.GlobalParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {
    @Qualifier("entityDAOImpl")
    @Autowired
    EntityDAO entityDAO;
    //getProfile
	public ProfileDTO getProfile(GlobalParam globalParam){
        int userId = 2;
        ProfileDTO profileDTO = new ProfileDTO();

        UserEntity userEntity = entityDAO.getEntity(userId, UserEntity.class);
        StudentEntity studentEntity = entityDAO.getEntity(userId, StudentEntity.class);

        profileDTO.setName(userEntity.getName());
        profileDTO.setStudentId(studentEntity.getStudentId());
        Integer gd = userEntity.getGender();
        if(gd==0){
            profileDTO.setGender(Gender.FEMALE);
        }else{
            profileDTO.setGender(Gender.MALE);
        }
        //System.out.println(profileDTO.getGender());
        profileDTO.setPhoneNumber(userEntity.getTelephone());
        profileDTO.setWechatAccount(userEntity.getWechat());
        profileDTO.setGithubAccount(userEntity.getGithub());
        profileDTO.setEmail(userEntity.getEmail());
        profileDTO.setEmailPassword(userEntity.getPassword());
        //convert emailtype from string in database to enum in Java code
        profileDTO.setEmailType(EmailType.valueOf(userEntity.getEmailType().toUpperCase()));
        //System.out.println(profileDTO.getEmailType());

        return profileDTO;
	}
	//putProfile
	public ErrorDTO updateProfile(String json){
		return null;
	}
	//getProfileOfStudent
	public DetailedStudentProfileDTO getStudentDetailedProfile(String json, String studentToken){
		return null;
	}
}
