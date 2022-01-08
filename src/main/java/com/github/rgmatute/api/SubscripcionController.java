package com.github.rgmatute.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.domain.Subscripcion;
import com.github.rgmatute.services.SubscripcionServices;

@RestController
public class SubscripcionController {

	@Autowired
	SubscripcionServices subscripcionServices;

	@GetMapping("/api/subscripcion")
	public List<Subscripcion> findAll() {
		return subscripcionServices.findAll();
	}

	@PostMapping("/api/subscripcion")
	public Subscripcion save(@RequestBody Subscripcion subscripcion) {
		return subscripcionServices.save(subscripcion);
	}

	@GetMapping("/api/subscripcion/{id}")
	public Subscripcion findById(String id) {
		return subscripcionServices.findById(id);
	}

	@DeleteMapping("/api/subscripcion/{id}")
	public void delete(String id) {
		subscripcionServices.delete(id);
	}

}
