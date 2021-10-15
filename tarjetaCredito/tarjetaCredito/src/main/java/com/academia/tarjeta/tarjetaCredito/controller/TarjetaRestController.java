package com.academia.tarjeta.tarjetaCredito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.tarjeta.tarjetaCredito.model.Cliente;
import com.academia.tarjeta.tarjetaCredito.service.IHttpResponses;
import com.academia.tarjeta.tarjetaCredito.constants.Constants;

@RestController
@RequestMapping(Constants.SERVERROUTE)
public class TarjetaRestController {
	
	@Autowired
	IHttpResponses httpResponses;
	
	@PostMapping(Constants.POSTROUTE)
	public String tipoTarjeta(@RequestBody Cliente cliente) {
		return httpResponses.getTipoTarjeta(cliente);
	}

}
