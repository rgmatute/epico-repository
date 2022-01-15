package com.github.rgmatute.api;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.Utils.EpicoUtils;

@RestController
public class AccountController {
	
	@PostMapping("/api/authenticate")
	public Object authenticate(@RequestParam String username, @RequestParam String password) {
		
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		HashMap<String, Object> token = new HashMap<>();
		
		String bearerToke = EpicoUtils.getJWT(username, "123");
		
		token.put("token", bearerToke);
		
		return token;
	}
	
	@GetMapping("/open-api/test")
	public Object test() {

		HashMap<String, Object> token = new HashMap<>();
		
		token.put("message", "Prueba de open-api");
		
		return token;
	}

}
