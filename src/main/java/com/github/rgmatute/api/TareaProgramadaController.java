package com.github.rgmatute.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute.services.TareasProgramadasServices;

@RestController
public class TareaProgramadaController {
	
	private final TareasProgramadasServices tareasProgramadasServices;
	
	public TareaProgramadaController(TareasProgramadasServices tareasProgramadasServices) {
		this.tareasProgramadasServices = tareasProgramadasServices;
	}
	
	@GetMapping("/api/activar-tarea")
	public Object activarTareaProgramada() {
		return tareasProgramadasServices.ActivarTareaProgramada();
	}

}
