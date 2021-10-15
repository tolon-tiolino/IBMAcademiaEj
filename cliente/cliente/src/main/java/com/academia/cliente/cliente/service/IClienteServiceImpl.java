package com.academia.cliente.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.cliente.cliente.feign.IClienteFeign;
import com.academia.cliente.cliente.model.Cliente;

@Service
public class IClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteFeign clienteFeign;
	
	@Override
	public String getCardType(Cliente cliente) {
		return clienteFeign.getResponsePost(cliente);
	}

}
