package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsms")
    public List<String> bsms() {
        return Arrays.asList(
                "Mentalidade de Crescimento",
                "Persistência",
                "Responsabilidade Pessoal",
                "Orientação ao Futuro",
                "Comunicação",
                "Proatividade",
                "Trabalho em Equipe",
                "Orientação ao Detalhe"
        );
    }

    @GetMapping("/objetivos")
    public List<String> objetivos() {
        return Arrays.asList(
                "Estudar Spring Boot",
                "Praticar programação em Java",
                "Desenvolver um projeto pessoal"
        );
    }
}
