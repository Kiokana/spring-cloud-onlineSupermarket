package com.onlineSupermarket.service_B.controller;

import com.onlineSupermarket.service_B.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {
    @Autowired
    private TestService testService;

    @ResponseBody
    @GetMapping("/testhello")
    public String testhello(){
        return testService.testhello()+" world";
    }
}
