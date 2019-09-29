package com.onlineSupermarket.orderService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineSupermarket.orderService.bean.UserOrder;
import com.onlineSupermarket.orderService.mapper.UserOrderMapper;
import com.onlineSupermarket.orderService.service.UserOrderService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements UserOrderService {
}
