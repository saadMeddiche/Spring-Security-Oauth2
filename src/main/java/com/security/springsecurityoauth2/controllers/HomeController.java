package com.security.springsecurityoauth2.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Welcome to Home Page";
    }
    @GetMapping("/secured")
    public String secured(){
        return "Welcome to Secured Page";
    }

    @GetMapping("/secured/user")
    public String home(@AuthenticationPrincipal OAuth2User user){
        return "Welcome back ," + user.getAttribute("name");
    }
    @GetMapping("/secured/informations")
    public String informations(@AuthenticationPrincipal OAuth2User user){
        return user.toString();
    }




}
