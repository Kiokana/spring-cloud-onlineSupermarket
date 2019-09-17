package com.onlineSupermarket.authService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class helloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        return "hello "+httpSession.getId();
    }
}
