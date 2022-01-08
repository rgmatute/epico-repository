package com.github.rgmatute.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.rgmatute.domain.Subscripcion;
import com.github.rgmatute.repository.SubscripcionRepository;

@Service
public class SubscripcionServices {

	@Autowired
	SubscripcionRepository subscripcionRepository;

	public List<Subscripcion> findAll() {
		return subscripcionRepository.findAll();
	}

	public Subscripcion save(Subscripcion subscripcion) {
		return subscripcionRepository.save(subscripcion);
	}

	public Subscripcion update(Subscripcion subscripcion) {
		return this.save(subscripcion);
	}

	public Subscripcion findById(String id) {
		Optional<Subscripcion> subscripcionOptional = subscripcionRepository.findById(id);

		return subscripcionOptional.isEmpty() ? null : subscripcionOptional.get();
	}

	public void delete(String id) {
		subscripcionRepository.deleteById(id);
	}

}
