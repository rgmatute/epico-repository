package com.github.rgmatute.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.github.rgmatute.repository.CatalogoRepository;

@Service
public class TareasProgramadasServices {
	
	
	@Autowired
	CatalogoRepository catalogoRepository;

	//@Scheduled(cron = "0/15 * * * * *")
	public Object ActivarTareaProgramada() {
		
		long count = catalogoRepository.count();
		
		catalogoRepository.findAllByNombreIsNullAndDescripcionIsNull()
		.forEach(catalogo ->{
			System.out.println("Catalog que se va a eliminar es --> " + catalogo.getNombre() + " - y el precio es: " + catalogo.getPrecio());
			delete(catalogo.getId());
		});
		
		/*
		catalogoRepository
		.findAllByCredito(150)
		.forEach(catalog -> {
			System.out.println("Catalog que se va a eliminar es --> " + catalog.getNombre() + " - y el precio es: " + catalog.getPrecio());
			delete(catalog.getId());
		});
		*/
		
		
		/*
		catalogoRepository.findAll()
		.forEach(catalog ->{
			if(String.valueOf(catalog.getCredito()).isEmpty()) {
				delete(catalog.getId());
			}
		});
		*/
		
		System.out.println("Tarea programada para consultar los catalogs: total=" + count);
		
		HashMap<String, Object> response = new HashMap<>();
		
		response.put("mensaje", "La tarea programada ya esta lista.");
		
		return response;
	}
	
	public void delete(String id) {
		System.out.println("Elimnando catalogo con ID --> " + id);
		catalogoRepository.deleteById(id);
	}
	
	

}
