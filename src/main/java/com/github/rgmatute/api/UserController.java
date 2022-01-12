package com.github.rgmatute.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.domain.postgres.User;
import com.github.rgmatute.repository.postgres.UserRepository;

@RestController
public class UserController {
	
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@PostMapping("/api/postgres/users")
	public User save(@RequestBody User user) {
		System.out.println("user: " + user);
		return this.userRepository.save(user);
	}
	
	@GetMapping("/api/postgres/users")
	public List<User> findAll(){
		return this.userRepository.findAll();
	}
	
	@GetMapping("/api/postgres/users/{id}")
	public User findOneById(@PathVariable Long id) throws Exception {
		Optional<User> userOptional = this.userRepository.findById(id);
		if(userOptional.isEmpty()) {
			throw new Exception("El usuario no existe.");
		}
		return userOptional.get();
	}
	
	@DeleteMapping("/api/postgres/users/{id}")
	public void delete(@PathVariable Long id) {
		this.userRepository.deleteById(id);
	}
	
	

}
