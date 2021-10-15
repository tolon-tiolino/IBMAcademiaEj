package com.academia.tarjeta.tarjetaCredito.service;

import com.academia.tarjeta.tarjetaCredito.model.Cliente;

public interface ICardFilters {

	String getTypeShopping(Cliente cliente);
	String getTypeTravels(Cliente cliente);
	String getTypeHelp(Cliente cliente);
	String getTypeMyBusiness(Cliente cliente);
	String getTypeSports(Cliente cliente);
	String getTypeMyStyle(Cliente cliente);
}
