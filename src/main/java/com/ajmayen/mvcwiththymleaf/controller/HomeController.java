package com.ajmayen.mvcwiththymleaf.controller;

import com.ajmayen.mvcwiththymleaf.model.User;
import com.ajmayen.mvcwiththymleaf.service.UserService;
import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/home")
    public ModelAndView getHomePage(ModelAndView modelAndView){
       modelAndView.setViewName("HomePage");
       modelAndView.addObject("name","Ajmayen");
       return modelAndView;
    }


    @PostMapping("/submit")
    public ModelAndView postUserData(ModelAndView modelAndView, RedirectAttributes redirectAttributes, @ModelAttribute User user){
        userService.addUser(user);
        redirectAttributes.addFlashAttribute("success","User Logged in successfully");

        modelAndView.setViewName("redirect:/home");
//        modelAndView.addObject("name",name);
//        modelAndView.addObject("age",age);
//        modelAndView.addObject("mail",mail);
//
//        modelAndView.setViewName("UserDetails");
       return modelAndView;

    }


    @GetMapping("/user-details")
    public ModelAndView viewUserData(ModelAndView modelAndView){
         modelAndView.setViewName("UserDetails");
        List<User> userList = userService.getAllUser();
        modelAndView.addObject("userList",userList);
         return modelAndView;
    }





}
