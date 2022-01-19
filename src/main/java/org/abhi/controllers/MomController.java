package org.abhi.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

    @ResponseBody
    @RequestMapping("/sugar")
    public String giveSugar(){
        return "give it to you";
    }

    @RequestMapping("/home.com")
public String welcome(){
        return "Welcome";
}
}
