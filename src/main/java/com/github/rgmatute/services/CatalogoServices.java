package com.github.rgmatute.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.rgmatute.domain.Catalogo;
import com.github.rgmatute.repository.CatalogoRepository;

@Service
public class CatalogoServices {
	
	@Autowired
	CatalogoRepository catalogoRepository;
	
	
	public List<Catalogo> findAll() {
		return catalogoRepository.findAll();
	}

}
