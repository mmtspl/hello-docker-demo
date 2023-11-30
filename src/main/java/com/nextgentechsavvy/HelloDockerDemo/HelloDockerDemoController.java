package com.nextgentechsavvy.HelloDockerDemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value="/hello-docker-demo")
public class HelloDockerDemoController {
	
	@GetMapping("test")
	public String HelloDockerDemoTest() {
		return "Sample Spring Boot Hello Docker Demo EclipseIDE Example. Thanks";
	}

}
