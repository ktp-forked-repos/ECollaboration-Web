package com.general.service.scoreService;

import com.general.dao.EntityDAO;
import com.general.dao.entity.*;
import com.general.dto.Advice;
import com.general.dto.File;
import com.general.dto.ScoreAdviceDTO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by joanna on 2/25/17.
 */
public class GetLeaderAdvicedScore {
    public ScoreAdviceDTO invoke(String teamToken, EntityDAO entityDAO) {
        ScoreAdviceDTO scoreAdviceDTO=new ScoreAdviceDTO();
        TeamEntity teamEntity = entityDAO.getEntity(Integer.parseInt(teamToken), TeamEntity.class);
        FinalEntity finalEntity = teamEntity.getFinalByTeam();
        if(finalEntity==null){
            fillDTOForActiveProject(scoreAdviceDTO, teamEntity);

        }else{
            fillDTOForFinishedProject(scoreAdviceDTO, teamEntity, finalEntity);
        }
        System.out.println(scoreAdviceDTO);
        return scoreAdviceDTO;
    }

    private void fillDTOForActiveProject(ScoreAdviceDTO scoreAdviceDTO, TeamEntity teamEntity) {
        //detail
        scoreAdviceDTO.setDetail("该项目未结题");
        //advice, fill it with name
        List<Advice> advices=new LinkedList<>();
        for(Iterator<TeamStudentEntity> i = teamEntity.getTeamStudentsById().iterator(); i.hasNext(); ){
            TeamStudentEntity teamStudentEntity = i.next();
            Advice advice=new Advice();
            advice.setName(teamStudentEntity.getStudentByMember().getUserByUser().getName());
            advices.add(advice);
        }
        scoreAdviceDTO.setAdvice(advices);
        //file, fill it with an empty list to avoid front-end error.
        scoreAdviceDTO.setFiles(new LinkedList<File>());
    }

    private void fillDTOForFinishedProject(ScoreAdviceDTO scoreAdviceDTO,
                                           TeamEntity teamEntity,
                                           FinalEntity finalEntity) {
        //detail
        scoreAdviceDTO.setDetail(finalEntity.getDescription());
        //advice
        List<Advice> advices=new LinkedList<>();
        for(Iterator<TeamStudentEntity> i = teamEntity.getTeamStudentsById().iterator(); i.hasNext(); ){
            TeamStudentEntity teamStudentEntity = i.next();
            Advice advice=new Advice();
            advice.setScore(Double.valueOf(teamStudentEntity.getAdviceScore()));
            advice.setContribution(Double.valueOf(teamStudentEntity.getContribution()));
            advice.setName(teamStudentEntity.getStudentByMember().getUserByUser().getName());
            advices.add(advice);
        }
        scoreAdviceDTO.setAdvice(advices);
        //files
        List<File> files=new LinkedList<>();
        for(Iterator<FinalFileEntity> i = teamEntity.getFinalFileByTeam().iterator(); i.hasNext(); ){
            FileEntity fileEntity = i.next().getFileByFile();
            File file=new File();
            file.setName(fileEntity.getRealName());
            file.setDownloadURL(fileEntity.getRestoreAt());
            files.add(file);
        }
        scoreAdviceDTO.setFiles(files);
    }
}
