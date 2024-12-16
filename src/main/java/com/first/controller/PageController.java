package com.first.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/about")
    public String about(){
        System.out.println("Rendering about page");
        return "about";
    }


    @RequestMapping("/service")
    public String service(){
        System.out.println("Rendering service page");
        return "services";
    }



}

