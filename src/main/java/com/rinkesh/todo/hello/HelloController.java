package com.rinkesh.todo.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloController
{
	@GetMapping(path = "todo")
	private String todo()
	{
		return "welcome to todo application";
	}

	@GetMapping(path = "/get-bean/{message}-{name}")
	private GetBean getBean(@PathVariable String message, @PathVariable String name)
	{
		return new GetBean("message is -> " + message, "name is  -> " + name);
	}

	@GetMapping("welcome")
	private GetBean welcome()
	{
		return new GetBean("welcome to full stack  application");
		// throw new RuntimeException("Some error is occurred the contact admin team....");
	}
}
