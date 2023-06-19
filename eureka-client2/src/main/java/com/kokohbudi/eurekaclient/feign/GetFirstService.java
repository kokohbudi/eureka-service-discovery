package com.kokohbudi.eurekaclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="first-service")
public interface GetFirstService {
    @GetMapping("hitme")
    public String hitFisrtController();
}
