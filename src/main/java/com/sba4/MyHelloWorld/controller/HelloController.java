package com.sba4.MyHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba4.MyHelloWorld.entity.Hello;

@RestController
public class HelloController {

//	@GetMapping("/hello")
//	private Hello sayHello() {
//		return new Hello("Hello World");
//	}
	
	@GetMapping("/helloworld")
	private String sayHello2() {
		return "Hello World";
	}
}
