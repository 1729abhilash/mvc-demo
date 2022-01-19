package org.abhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sister")
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String makeup(){
        return "here hes my make up";
    }

    @ResponseBody
    @RequestMapping("/books")
    public String getBooks(){
        return "Math book";
    }
}
