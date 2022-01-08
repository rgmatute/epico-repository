package com.github.rgmatute.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.domain.Catalogo;
import com.github.rgmatute.services.CatalogoServices;

@RestController
public class CatalogoController {
	
	@Autowired
	CatalogoServices catalogoServices;
	
	@GetMapping("/catalogos")
	public List<Catalogo> findAll() {
		return catalogoServices.findAll();
	}

}
