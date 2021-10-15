package com.academia.cliente.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.academia.cliente.cliente.model.Cliente;
import com.academia.cliente.cliente.service.IClienteService;
import com.academia.cliente.cliente.constants.Constants;

@RestController
public class ClienteRestController {
	
	@Autowired
	IClienteService clienteService;
	
	@PostMapping(Constants.POSTROUTE)
	public String getCardType(@RequestBody Cliente cliente) {
		return clienteService.getCardType(cliente);
	}

}
