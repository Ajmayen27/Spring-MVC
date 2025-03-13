package com.ajmayen.mvcwiththymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping("/home")
    public ModelAndView getHomePage(ModelAndView modelAndView){
       modelAndView.setViewName("HomePage");
       modelAndView.addObject("name","Sabrina");
       return modelAndView;
    }


    @RequestMapping("/user-details")
    public ModelAndView getAnotherHomePage(ModelAndView modelAndView, @RequestParam String name,@RequestParam int age,@RequestParam String mail){
       modelAndView.setViewName("UserDetails");
       modelAndView.addObject("name",name);
       modelAndView.addObject("age",age);
       modelAndView.addObject("mail",mail);

       return modelAndView;
    }



}
