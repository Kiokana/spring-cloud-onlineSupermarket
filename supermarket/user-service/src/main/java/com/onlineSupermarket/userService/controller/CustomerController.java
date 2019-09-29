package com.onlineSupermarket.userService.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.onlineSupermarket.userService.bean.Customer;
import com.onlineSupermarket.userService.service.CustomerService;
import com.onlineSupermarket.userService.service.MyRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {
    /* login
     * register
     * info modify
     * */

    @Autowired
    CustomerService customerService;

    @Autowired
    MyRoleService myRoleService;


    @ResponseBody
    @GetMapping("/login")
    public String login(@PathVariable("username") String username, @PathVariable("password") String password){
        QueryWrapper<Customer> customerWrapper = new QueryWrapper<>();
        /* Encording */
        customerWrapper.lambda().eq(Customer::getUid, username).eq(Customer::getPassword, password);
        Customer customer = customerService.getOne(customerWrapper);
        if(customer == null){
            return "";
        }else{
            return customer.toString();
        }
    }

    @PostMapping(value = "/register", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String register(@RequestBody String json){
        System.out.println(json);
        JSONObject jsonObject = JSON.parseObject(json);
        String username = (String)jsonObject.get("username");
        return json;
    }


}
