package com.onlineSupermarket.productService.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.onlineSupermarket.productService.bean.Product;
import com.onlineSupermarket.productService.bean.ProductSKU;
import com.onlineSupermarket.productService.service.ProductSKUService;
import com.onlineSupermarket.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductSKUService productSKUService;



    @ResponseBody
    @GetMapping("/getall")
    public List<Product> getAll(){
        QueryWrapper<Product> productWrapper = new QueryWrapper<>();
        List<Product> list = productService.list(productWrapper);

        if(list==null){
            System.out.println("?????????????");
        }else{
            for(Product p: list){
                System.out.println(p.getId());
            }
        }
        return list;
    }

    @ResponseBody
    @GetMapping("/productDetails")
    public List<ProductSKU> getProductDetails(String productId){
        QueryWrapper<ProductSKU> productSKUQueryWrapper = new QueryWrapper<>();
        productSKUQueryWrapper.lambda().eq(ProductSKU::getProductId, productId);
        List<ProductSKU> productSKUList = productSKUService.list(productSKUQueryWrapper);
        for(ProductSKU productSKU: productSKUList){
            System.out.println(productSKU.getProductSpec());
        }
        return productSKUList;
    }
}
