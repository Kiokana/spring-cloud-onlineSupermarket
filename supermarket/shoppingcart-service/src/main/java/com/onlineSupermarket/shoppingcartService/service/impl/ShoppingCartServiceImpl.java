package com.onlineSupermarket.shoppingcartService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineSupermarket.shoppingcartService.bean.ShoppingCart;
import com.onlineSupermarket.shoppingcartService.mapper.ShoppingCartMapper;
import com.onlineSupermarket.shoppingcartService.service.ShoppingCartService;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
