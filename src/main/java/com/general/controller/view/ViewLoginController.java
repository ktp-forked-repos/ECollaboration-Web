package com.general.controller.view;

import com.general.dto.UserParam;
import com.general.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dailybird on 17/2/7.
 * 登录控制器
 */
@Controller
@RequestMapping(path = "/")
public class ViewLoginController {

    /**
     * 登录业务模块
     */
    @Autowired
    private LoginService loginService;

    /**
     * 访问登录页面
     * @return 登录页面
     */

    @RequestMapping(value = "login")
    public String login(UserParam userParam,
                        @RequestHeader("access-token") String accessToken,
                        Model model){
        //how to login without UserName and password ?
        model.addAttribute("login", loginService.doLogin(userParam,accessToken));
        return "/common/login";
    }
    /**
     * 退出登录
     * @return 登录页面
     */
    @RequestMapping(path = "/logout")
    public String logout(){
        // TODO: 退出登录：撤销 cookie 和 session，2017.2.10, 2017.2.12

        return "redirect:/login";
    }

    /**
     * POST 登录验证
     * @param loginParams 登录所提交参数
     * @return
     */
    @RequestMapping(path = "/authenticate", method = RequestMethod.POST)
    public Object authenticate(com.general.param.LoginParam loginParams){
        // TODO: 完成登录验证过程 17/2/10 17/2/12
        //this.loginService.authenticate(loginParams.getUsername(), loginParams.getPassword());
        return null;
    }


}
