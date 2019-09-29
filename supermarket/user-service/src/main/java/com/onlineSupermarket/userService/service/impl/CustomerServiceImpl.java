package com.onlineSupermarket.userService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineSupermarket.userService.bean.Customer;
import com.onlineSupermarket.userService.mapper.CustomerMapper;
import com.onlineSupermarket.userService.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {
}
