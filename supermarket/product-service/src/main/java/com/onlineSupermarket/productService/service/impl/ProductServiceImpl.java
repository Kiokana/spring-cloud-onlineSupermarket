package com.onlineSupermarket.productService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineSupermarket.productService.bean.Product;
import com.onlineSupermarket.productService.mapper.ProductMapper;
import com.onlineSupermarket.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
