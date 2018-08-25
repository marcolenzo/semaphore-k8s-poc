package eu.marcolenzo.greeter.greeterservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet() {
		return "Hello!";
	}

}
