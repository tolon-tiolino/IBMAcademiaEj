package com.academia.tarjeta.tarjetaCredito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.tarjeta.tarjetaCredito.constants.Constants;
import com.academia.tarjeta.tarjetaCredito.model.Cliente;

@Service
public class IHttpResponsesImpl implements IHttpResponses{
	
	@Autowired
	ICardFilters iCardFilters;
	
	@Override
	public String getTipoTarjeta(Cliente cliente) {
		String tipoTarjeta="";
		switch(cliente.getPassion().toUpperCase()) {
		case "SHOPPING":
			tipoTarjeta = iCardFilters.getTypeShopping(cliente);
			break;
		case "TRAVELS":
			tipoTarjeta =iCardFilters.getTypeTravels(cliente);
			break;
		case "HELP":
			tipoTarjeta =iCardFilters.getTypeHelp(cliente);
			break;
		case "MY BUSINESS":
			tipoTarjeta =iCardFilters.getTypeMyBusiness(cliente);
			break;
		case "SPORTS":
			tipoTarjeta =iCardFilters.getTypeSports(cliente);
			break;
		case "MY STYLE":
			tipoTarjeta =iCardFilters.getTypeMyStyle(cliente);
			break;
		default:
			tipoTarjeta = Constants.NOOPTION;
			break;
		}
		return tipoTarjeta;
	}
	
}
