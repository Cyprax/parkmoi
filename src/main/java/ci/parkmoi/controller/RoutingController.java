package ci.parkmoi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping("/app")
public class RoutingController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome dear User</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome dear Admin</h1>");
	}
}
