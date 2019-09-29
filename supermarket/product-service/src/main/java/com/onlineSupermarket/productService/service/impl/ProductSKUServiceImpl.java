package com.onlineSupermarket.productService.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineSupermarket.productService.bean.Product;
import com.onlineSupermarket.productService.bean.ProductSKU;
import com.onlineSupermarket.productService.mapper.ProductMapper;
import com.onlineSupermarket.productService.mapper.ProductSKUMapper;
import com.onlineSupermarket.productService.service.ProductSKUService;
import com.onlineSupermarket.productService.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductSKUServiceImpl extends ServiceImpl<ProductSKUMapper, ProductSKU> implements ProductSKUService {
}
