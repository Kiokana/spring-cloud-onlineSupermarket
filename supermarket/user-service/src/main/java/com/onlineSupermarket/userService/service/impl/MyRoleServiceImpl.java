package com.onlineSupermarket.userService.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineSupermarket.userService.bean.MyRole;
import com.onlineSupermarket.userService.mapper.MyRoleMapper;
import com.onlineSupermarket.userService.service.MyRoleService;
import org.springframework.stereotype.Service;

@Service
public class MyRoleServiceImpl extends ServiceImpl<MyRoleMapper, MyRole> implements MyRoleService {
}
