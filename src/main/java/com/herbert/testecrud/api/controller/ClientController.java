package com.herbert.testecrud.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herbert.testecrud.domain.model.repository.ClientRepository;
import com.herbert.testecrud.model.Client;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClientController {	
	
	private ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> listar() {		
		return clientRepository.findAll();
	}

}
