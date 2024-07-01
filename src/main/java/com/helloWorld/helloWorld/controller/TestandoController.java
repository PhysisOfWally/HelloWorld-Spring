package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/busca")
public class TestandoController {
	
	@GetMapping()
	public String busca() {		
		// testando a criação de controller diferente
		return "informacao buscada no servidor";
	}
}
