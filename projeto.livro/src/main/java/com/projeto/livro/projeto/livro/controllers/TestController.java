package com.projeto.livro.projeto.livro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teste")
public class TestController {

    @GetMapping("/get")
    public ResponseEntity<String> teste(){
	return new ResponseEntity<String>("Teste",HttpStatus.OK);
    }
    
}
