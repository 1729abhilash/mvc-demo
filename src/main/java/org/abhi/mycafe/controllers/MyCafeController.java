package org.abhi.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeController {

//returnning the welcome page
    @RequestMapping("/cafe")
    public String showWelcomePage(Model model){
        //sending data to view(jsp page)
        String name="abhilash";
        model.addAttribute("myName",name);
        model.addAttribute("myWebsiteTitle","Mom's CAFe123");
   return "Welcome-page";
    }

    @RequestMapping("processOrder")
    public String processOrder(HttpServletRequest request, Model model){
        //handle the data recieved fromt he user
    String foodName=request.getParameter("foodType");

            //adding the captured value to the model
        model.addAttribute("userInputFood",foodName);
    //set the user data with the model object and send to the user

        return "process-order";
    }

}
