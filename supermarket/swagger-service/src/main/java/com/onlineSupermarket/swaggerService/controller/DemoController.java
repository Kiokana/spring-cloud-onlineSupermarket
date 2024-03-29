package com.onlineSupermarket.swaggerService.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(tags="test tag")
public class DemoController {
   @GetMapping("/hello")
   @ApiOperation(value="demo", notes="demo notes")
   @ApiImplicitParam(name="name", value="value", example = "example")
   public String hello(String name){
       return "hi," + name + "test swagger doc";
   }
}
