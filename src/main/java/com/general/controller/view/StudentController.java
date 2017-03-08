package com.general.controller.view;

import com.general.param.student.*;
import com.general.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dailybird on 17/2/7.
 * 学生端视图显示控制器
 */
@Controller
@RequestMapping(path = "/student")
public class StudentController {

    /**
     * 学生端视图文件目录
     */
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectApplicationService projectApplicationService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private PlanService planService;
    @Autowired
    private ProfileService profileService;
    /**
     * 访问学生端首页
     * @return 学生端首页
     */
    @RequestMapping(path = "/")
    public String index(){

        return "";
    }

    /**
     * 访问选题页面
     * @return 选题页面
     */
    //TODO huhang ok
    @RequestMapping(value = "/project", method = RequestMethod.GET)
    public String project(ArticleListParam articleListParam, Model model){
        //year is set to current year if not passed from front-end
        if(articleListParam.getYear()==0)
            articleListParam.setYear(2016);
        model.addAttribute("articleList", articleService.studentGetTopicList(articleListParam));
        return  "student/project";
    }
    /**
     * 访问我的小组 - 项目管理
     * @return 我的小组 - 项目管理
     */

    //TODO huhang ok
    @RequestMapping(value="/team/project",method=RequestMethod.GET)
    public String teamProject(ProjectListParam projectListParam, Model model){
        model.addAttribute("projectList", projectService.getProjectList(projectListParam));
        return   "student/team/project";
    }
    /**
     * 访问我的小组 - 队员管理
     * @return 我的小组 - 队员管理
     */
    //TODO AiGuangWei
    @RequestMapping(path = "/team/member")
    public String teamMember(Model model,
                             ProjectMemberParam projectMemberParam,
                             ConfirmCodeParam confirmCodeParam,
                             ApplicationStudentListParam applicationStudentListParam,
                             String projectToken){
        model.addAttribute("projectMember", projectService.getProjectMember(projectMemberParam, projectToken));
        model.addAttribute("confirmCode", projectService.getConfirmCode(confirmCodeParam, projectToken));
        model.addAttribute("applicantList", projectApplicationService.getApplicantList(applicationStudentListParam,
                projectToken));

        return   "student/team/member";
    }

    /**
     * 访问我的小组 - 计划管理
     * @return 我的小组 - 计划管理
     */
    //TODO huhang ok
    @RequestMapping(path = "/team/plan")
    public String teamPlan(Model model, PlanListParam planListParam, String projectToken){
        model.addAttribute("planList", planService.studentGetPlanList(planListParam, projectToken));
        return   "student/team/plan";
    }

    /**
     * 访问我的小组 - 任务管理
     * @return 我的小组 - 任务管理
     */
    //TODO huhang ok
    @RequestMapping(path = "/team/task")
    public String teamTask(Model model, TaskListParam taskListParam, String projectToken){
        model.addAttribute("planDetailList", taskService.studentGetTaskList(taskListParam, projectToken));
        return   "student/team/task";
    }
    /**
     * 访问我的小组 - 日程管理
     * @return 我的小组 - 日程管理
     */
    @RequestMapping(path = "/team/schedule")
    public String teamSchedule(){

        return   "student/team/schedule";
    }

    /**
     * 访问个人中心 - 基本信息
     * @return 个人中心 - 基本信息
     */
    //TODO AiGuangWei ok
    @RequestMapping(path = "/profile")
    public String profile(Model model, com.general.param.GlobalParam globalParam){
        model.addAttribute("profile", profileService.getProfile(globalParam));
        return   "student/profile";
    }

    /**
     * 个人中心 - 站内信
     * @return 个人中心 - 站内信
     */
    @RequestMapping(path = "/message")
    public String message(){

        return   "student/message";
    }

    /**
     * 访问个人中心 - 成绩管理
     * @return 个人中心 - 成绩管理
     */
    @RequestMapping(path = "/score")
    public String score(){

        return   "student/score";
    }

}
