package com.docker_used.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/docker")
	public String get() {
		return "welcome";
	}
}
