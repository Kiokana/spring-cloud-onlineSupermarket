package com.onlineSupermarket.swaggerService.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
//@Configuration
public class SwaggerConfig {
//    @Value(value = "${swagger.enable}")
//    Boolean swaggerEnabled;
//
//    @Bean
//    public Docket createRestApi (){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                .enable(swaggerEnabled).select()
//                .apis(RequestHandlerSelectors.basePackage())
//    }
}
