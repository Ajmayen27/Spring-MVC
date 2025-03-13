package com.ajmayen.mvcwiththymleaf.controller;

import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    @PostMapping("/user-details")
    public ModelAndView postUserData(ModelAndView modelAndView, @RequestParam String name, @RequestParam @Nullable Integer age, @RequestParam String mail){
         modelAndView.setViewName("redirect:/user-details");
//       modelAndView.addObject("name",name);
//       modelAndView.addObject("age",age);
//       modelAndView.addObject("mail",mail);

       return modelAndView;

    }

    @GetMapping("/user-details")
    public ModelAndView viewUserData(ModelAndView modelAndView){
         modelAndView.setViewName("UserDetails");
         return modelAndView;
    }





}
