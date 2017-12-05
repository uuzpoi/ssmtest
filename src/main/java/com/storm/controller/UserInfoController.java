package com.storm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.storm.model.UserModel;
import com.storm.service.UserService;

@Controller
@RequestMapping(value= "/ssm")
public class UserInfoController {

    @Resource 
    UserService userService;
    
    @RequestMapping(value="/index.do")
    public String gotoIndex(){
        
        return "UserHello";
    }
    
    @RequestMapping(value="/hello.do")
    public String getUserInfo(HttpServletRequest request, UserModel userModel,Model model){
        
        List<UserModel> userModelList=userService.getUser(userModel);
        model.addAttribute("userModelList", userModelList);
        return "success";
    }
}
