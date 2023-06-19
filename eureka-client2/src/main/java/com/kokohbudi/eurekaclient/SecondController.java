package com.kokohbudi.eurekaclient;

import com.kokohbudi.eurekaclient.feign.GetFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SecondController {

	@Autowired
	GetFirstService getFirstService;

	@GetMapping("/hitme")
	public String hello() {
		return getFirstService.hitFisrtController();
	}

}