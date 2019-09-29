package com.onlineSupermarket.serviceC.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.security.Principal;

@RestController
@EnableSwagger2
@Api("service-C")
public class AuthTestController {

    Logger logger = LoggerFactory.getLogger(AuthTestController.class);

    @ApiOperation("getProductById")
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id){
        return "product Id: " + id;
    }



    @ApiOperation("getOrderById")
    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id){
        return "order id: " + id;
    }


    @ApiOperation("getPrinciple")
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
