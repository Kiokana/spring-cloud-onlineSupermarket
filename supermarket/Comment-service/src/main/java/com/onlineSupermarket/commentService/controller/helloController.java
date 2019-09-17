package com.onlineSupermarket.commentService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@Controller
public class helloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Enumeration<String> attributeNames= session.getAttributeNames();
        String ret = "";
        while(attributeNames.hasMoreElements()){
            String attr = attributeNames.nextElement();
            System.out.println(attr+session.getAttribute(attr));
            ret+=attr+" "+session.getAttribute(attr)+"\n";
        }
        System.out.print("/hello");
        session.setAttribute("qqq", "?????????????????");
        session.setAttribute("name", "Xiao");

        return "hello " + session.getId()+" " +ret;
    }
}
