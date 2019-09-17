package com.onlineSupermarket.service_B.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name="service-AA")
public interface TestService {
    @GetMapping("/hello")
    public String testhello();
}
