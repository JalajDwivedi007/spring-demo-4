package revision.demo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome/{name}")
	public String printMessage(@PathVariable("name") String name) {
		System.out.println("Welcome to spring boot!");
		return "Welcome this is a demo program, "+name;
	}
	@GetMapping("/")
	public void print() {
		System.out.println("Welcome to spring boot!");
		
	}
}
