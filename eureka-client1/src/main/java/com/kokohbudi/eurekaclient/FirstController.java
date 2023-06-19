package com.kokohbudi.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

	@GetMapping("/hitme")
	public String hello() {
		return "hello I'm first service";
	}

}