package com.github.rgmatute.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.domain.Catalogo;
import com.github.rgmatute.services.CatalogoServices;

@RestController
public class CatalogoController {
	
	@Autowired
	CatalogoServices catalogoServices;
	
	@GetMapping("/api/catalogos")
	public List<Catalogo> findAll() {
		return catalogoServices.findAll();
	}
	
	@PostMapping("/api/catalogos")
	public Catalogo save(@RequestBody Catalogo catalogo) {
		return catalogoServices.save(catalogo);
	}
	
	@GetMapping("/api/catalogos/{id}")
	public Catalogo findById(String id) {
		return catalogoServices.findById(id);
	}
	
	@DeleteMapping("/api/catalogos/{id}")
	public void delete(String id) {
		catalogoServices.delete(id);
	}

}
