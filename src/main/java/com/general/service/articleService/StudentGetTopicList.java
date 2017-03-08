package com.general.service.articleService;

import com.general.dao.ProjectEntityDAOImpl;
import com.general.dao.entity.ProjectEntity;
import com.general.dao.entity.TeamEntity;
import com.general.dto.StudentArticleDTO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by joanna on 2/20/17.
 */
public class StudentGetTopicList {
    public List<StudentArticleDTO> invoke(com.general.param.student.ArticleListParam articleListParam,
                                          ProjectEntityDAOImpl projectEntityDAO) {
        int year=articleListParam.getYear();
        List<ProjectEntity> projectEntities=projectEntityDAO.getProjectEntities(year);
        List<StudentArticleDTO> studentArticleDTOs = fillStudentArticleDTOs(projectEntities);
        return studentArticleDTOs;
    }

    private List<StudentArticleDTO> fillStudentArticleDTOs(List<ProjectEntity> projectEntities) {
        List<StudentArticleDTO> studentArticleDTOs=new LinkedList<>();
        for(Iterator<ProjectEntity> i = projectEntities.listIterator(); i.hasNext();){
            ProjectEntity projectEntity=i.next();
            StudentArticleDTO studentArticleDTO=new StudentArticleDTO();
            studentArticleDTO.setTitle(projectEntity.getTitle());
            studentArticleDTO.setMaxTeamNum(projectEntity.getTeamMax());
            studentArticleDTO.setMinMemberNum(projectEntity.getMemberMin());
            studentArticleDTO.setMaxMemberNum(projectEntity.getMemberMax());
            //get tutor name
            studentArticleDTO.setTutorName(projectEntity.getTutorByTutor().getUserByUser().getName());
            //get apply_num
            Set<TeamEntity> teamEntities = projectEntity.getTeamsById();
            int applyNum=teamEntities.size();
            studentArticleDTO.setApplyNum(applyNum);
            //TODO set can_apply
            //if passTeamNum<maxTeamNum, and it doesn't exceed the deadline in Project table, then it's ok to apply
            //hardcode it to be true
            studentArticleDTO.setCanApply(Boolean.TRUE);
            studentArticleDTOs.add(studentArticleDTO);
        }
        return studentArticleDTOs;
    }
}
