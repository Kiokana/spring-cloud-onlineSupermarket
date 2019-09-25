package com.onlineSupermarket.authService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@RequestMapping("/oauth")
public class helloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        return "hello "+httpSession.getId();
    }
}
