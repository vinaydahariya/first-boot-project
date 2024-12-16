package com.first.controller;

import com.first.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String loginPage(){
        System.out.println("This is login page");
        boolean isLogin = loginService.doLogin();
        if(isLogin){
            return "Success_login";
        }else{
            return "login";
        }

    }
}
