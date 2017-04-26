package com.general.controller.view;

import com.general.dto.ScoreForStudentDTO;
import com.general.param.tutor.*;
import com.general.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dailybird on 17/2/7.
 * 教师端视图显示控制器
 */

@Controller
@RequestMapping(path = "/tutor")
public class TutorController {

    /**
     * 教师端视图文件目录
     */
    @Autowired
    private ArticleService articleService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private ProfileService profileService;
    /**
     * 访问教师端首页
     * @return 教师端首页
     */
    @RequestMapping(path = "/")
    public String index(){

        return  "tutor/";
    }

    /**
     * 访问课题管理
     * @return 课题管理
     */
    //TODO huhang ok
    @RequestMapping(path = "/project")
    public String project(Model model, ArticleListParam articleListParam){
        model.addAttribute("articleList", articleService.tutorGetTopicList(articleListParam));
        return "tutor/project";
    }

    /**
     * 访问小组管理 - 查看申请
     * @return 小组管理 - 查看申请
     */
    //TODO AiGuangWei ok
    @RequestMapping(path = "/team/apply")
    public String teamProject(Model model, ApplicationListParam applicationListParam,
                              TeamListParam teamListParam,
                              String projectToken){
        model.addAttribute("applicationList", teamService.getApplyingTeamList(applicationListParam, projectToken));
        model.addAttribute("acceptedList", teamService.getAcceptedTeamList(teamListParam, projectToken));
        return   "tutor/team/apply";
    }

    /**
     * 访问小组管理 - 计划管理
     * @return 小组管理 - 计划管理
     */
    //TODO huhang ok
    @RequestMapping(path = "/team/plan")
    public String teamMember(Model model, ArticleListParam articleListParam){
        model.addAttribute("articleList", articleService.tutorGetTopicList(articleListParam));
        return "tutor/team/plan";
    }

    /**
     * 访问小组管理 - 队伍进展
     * @return 小组管理 - 队伍进展
     */
    //TODO AiGuangWei ok
    @RequestMapping(path = "/team/progress")
    public String teamTask(Model model, TeamListOverviewParam teamListOverviewParam){
        model.addAttribute("teamList", teamService.getTeamProgressList(teamListOverviewParam));
        return  "tutor/team/progress";
    }

    /**
     * 访问小组管理 - 日程管理
     * @return 小组管理 - 日程管理
     */
    @RequestMapping(path = "/team/schedule")
    public String teamPlan(){

        return   "tutor/team/" + "schedule";
    }

    /**
     * 访问小组管理 - 成绩管理
     * @return 小组管理 - 成绩管理
     */
    //TODO huhang ok
    @RequestMapping(path = "/team/score")
    public String teamSchedule(Model model, ScoreAdviceParam scoreAdviceParam,
                               ScoreForStudentParam scoreForStudentParam,
                               String teamToken){
        model.addAttribute("adviceScore", scoreService.getLeaderAdvicedScore(scoreAdviceParam, teamToken));
        model.addAttribute("scoreForStudent",scoreService.getScoreForStudent(scoreForStudentParam, teamToken));

        return "tutor/team/score";
    }

    /**
     * 访问个人中心 - 基本信息
     * @return 个人中心 - 基本信息
     */
    //TODO AiGuangWei ok
    @RequestMapping(path = "/profile")
    public String profile(Model model, com.general.param.GlobalParam globalParam){
        model.addAttribute("profile", profileService.getProfile(globalParam));
        return  "tutor/profile";
    }

    /**
     * 访问个人中心 - 站内信
     * @return 个人中心 - 站内信
     */
    @RequestMapping(path = "/message")
    public String message(){

        return  "tutor/message";
    }

}
