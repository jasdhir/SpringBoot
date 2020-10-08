package com.jasdhir.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/getAdminHome")
    public String getAdminHome() {
        return "adminHome";
    }
    @RequestMapping("/getUserHome")
    public String getUserHome() {
        return "userHome";
    }
}

