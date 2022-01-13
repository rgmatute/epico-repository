package com.github.rgmatute.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.domain.postgres.Notas;
import com.github.rgmatute.repository.postgres.NotaRepository;

@RestController
public class NotaController {

	@Autowired
	NotaRepository notaRepository;

	@GetMapping("api/postgres/notas")
	public List<Notas> findAll() {
		return notaRepository.findAll();
	}

	@PostMapping("api/postgres/notas")
	public Notas save(@RequestBody Notas nota) {
		return notaRepository.save(nota);
	}
	
	@GetMapping("api/postgres/notas/{email}")
	public List<Notas> findAllByEmail(@PathVariable String email) {
		System.out.println("email: " + email);
		return notaRepository.findAllByEmail(email);
	}

}
