package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String hello() {
		return "welcome, a basic spring boot project deployed in aws ec2 with jenkins";
	}
}
