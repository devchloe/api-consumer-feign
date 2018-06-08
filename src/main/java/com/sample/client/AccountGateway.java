package com.sample.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("account-service")
public interface AccountGateway {

    @GetMapping("/{id}")
    Account getById(@PathVariable("id") String accountId);
}
