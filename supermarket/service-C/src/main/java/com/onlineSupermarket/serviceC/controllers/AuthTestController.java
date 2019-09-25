package com.onlineSupermarket.serviceC.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
@RestController
public class AuthTestController {

    Logger logger = LoggerFactory.getLogger(AuthTestController.class);

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id){
        return "product Id: " + id;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id){
        return "order id: " + id;
    }

    @GetMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication, Principal principal, Authentication authentication){
        try {
            logger.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
            logger.info(oAuth2Authentication.toString());
            logger.info("principal.toString() " + principal.toString());
            logger.info("principal.getName() " + principal.getName());
            logger.info("authentication: " + authentication.getAuthorities().toString());
        }catch (Exception e){

        }
        return oAuth2Authentication;
    }

}
