package com.song.controller;

import com.song.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by lenovo on 2017/10/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/admin_login")
    public ModelAndView login(@RequestParam String userName,@RequestParam String userPsd) throws Exception{
        ModelAndView mvn = new ModelAndView();
        Map<String, String> loginMap = userService.login(userName, userPsd);
        if (loginMap == null || loginMap.isEmpty()){
            mvn.setViewName("redirect:/view/adminDemo/login");
        }else{
            if ("success".equals(loginMap.get("status"))){
                mvn.setViewName("redirect:/view/adminDemo/index");
            }else{
                mvn.setViewName("redirect:/view/adminDemo/login");
            }
        }
        return mvn;
    }
}
