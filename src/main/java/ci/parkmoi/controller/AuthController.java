package ci.parkmoi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ci.parkmoi.security.jwt.JwtRequest;
import ci.parkmoi.service.AuthService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired private AuthService authService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody JwtRequest request) throws Exception {
		return authService.createAuthenticationToken(request);
	}

	@RequestMapping(value="/logout",method=RequestMethod.POST)
    public void logout() {
		authService.logout();
		return;
	}
	
	@RequestMapping(value="/refresh",method=RequestMethod.POST)
    public void refresh() {
		authService.refresh();
		return;
	}
		
	@RequestMapping(value="/principal",method=RequestMethod.POST)
    public void principal() {
		authService.principal();
		return;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register() throws Exception {
		authService.register();
		return;
	}

}

