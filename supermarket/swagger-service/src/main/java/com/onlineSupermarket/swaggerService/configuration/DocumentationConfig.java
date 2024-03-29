package com.onlineSupermarket.swaggerService.configuration;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


@EnableSwagger2
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Value(value = "${swagger.enabled}")
    Boolean swaggerEnabled;

    @Autowired
    ZuulProperties properties;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(swaggerEnabled).select()
                .apis(RequestHandlerSelectors.basePackage("com.onlineSupermarket.swaggerService"))
                .paths(PathSelectors.any()).build().pathMapping("/");
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("OnlineSupermarket Swagger Document")
                .description("API Document")
                .contact(new Contact("xsheyyy", "https://github.com/xsheyyy/spring-cloud-onlineSupermarket", "1872102572@qq.com"))
                .version("1.0.0")
                .termsOfServiceUrl("https://github.com/xsheyyy/spring-cloud-onlineSupermarket")
                .build();
    }


    @Override
    public List<SwaggerResource> get(){
        List resources = new ArrayList<>();
        properties.getRoutes().values().stream()
                .forEach(route ->
                        System.out.println(route.getServiceId().toString()+" "+route.getPath()));


        resources.add(swaggerResource("swagger-gateway", "/v2/api-docs","1.0"));

        properties.getRoutes().values().stream()
                .forEach(route -> resources
                .add(swaggerResource(route.getServiceId(), route.getPath().replace("**", "v2/api-docs"), "1.0")));


        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version){
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
