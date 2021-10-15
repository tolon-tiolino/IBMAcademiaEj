package com.academia.tarjeta.tarjetaCredito.service;

import org.springframework.stereotype.Service;

import com.academia.tarjeta.tarjetaCredito.constants.Constants;
import com.academia.tarjeta.tarjetaCredito.model.Cliente;

@Service
public class ICardFiltersImpl implements ICardFilters{
	
	@Override
	public String getTypeShopping(Cliente cliente) {
		String tipoTarjeta = "";
		if(cliente.getAge() >= 18 && cliente.getAge() <= 23 && cliente.getMonthSalary() >= 7000) {
			tipoTarjeta = "Options: " + Constants.TARJETAS[0] + ", " + Constants.TARJETAS[1];
		}else if((cliente.getMonthSalary() >= 7000 && cliente.getMonthSalary() <= 14999)) {
			if(cliente.getAge() >= 24 && cliente.getAge() <= 32) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0] + ", " + Constants.TARJETAS[2] + ", " + Constants.TARJETAS[1] + ", " + Constants.TARJETAS[3] + ", " + Constants.TARJETAS[4] + ", " + Constants.TARJETAS[5] + ", " + Constants.TARJETAS[6];
			}else if(cliente.getAge() >= 33 && cliente.getAge() <= 75){
				tipoTarjeta = "Options: " + Constants.TARJETAS[2] + ", " + Constants.TARJETAS[3] + ", " + Constants.TARJETAS[4] + ", " + Constants.TARJETAS[5] + ", " + Constants.TARJETAS[6];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 15000 && cliente.getMonthSalary() <= 34999) {
			if(cliente.getAge() >= 24 && cliente.getAge() <= 32) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[7] + ", " + Constants.TARJETAS[1] + ", " + Constants.TARJETAS[3] + ", " + Constants.TARJETAS[4] + ", " + Constants.TARJETAS[5] + ", " + Constants.TARJETAS[6];
			}else if(cliente.getAge() >= 33 && cliente.getAge() <= 75){
				tipoTarjeta = "Options: " + Constants.TARJETAS[7] + ", " + Constants.TARJETAS[3] + ", " + Constants.TARJETAS[4] + ", " + Constants.TARJETAS[5] + ", " + Constants.TARJETAS[6];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 35000 && cliente.getMonthSalary() <= 49999) {
			if(cliente.getAge() >= 24 && cliente.getAge() <= 75) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[8] + ", " + Constants.TARJETAS[3] + ", " + Constants.TARJETAS[4] + ", " + Constants.TARJETAS[5] + ", " + Constants.TARJETAS[6];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 50000) {
			if(cliente.getAge() >= 24 && cliente.getAge() <= 75) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[8];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else {
			tipoTarjeta = Constants.NOOPTION;
		}
		return tipoTarjeta;
	}
	
	@Override
	public String getTypeTravels(Cliente cliente) {
		String tipoTarjeta = "";
		if(cliente.getMonthSalary() >= 12000 && cliente.getMonthSalary() <= 29999 && (cliente.getAge() >= 18 && cliente.getAge() <= 75)) {
			tipoTarjeta = "Options: " + Constants.TARJETAS[9];
		}else if((cliente.getMonthSalary() >= 30000 && cliente.getMonthSalary() <= 34999)) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 23) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[9];
			}else if(cliente.getAge() >= 24 && cliente.getAge() <= 75){
				tipoTarjeta = "Options: " + Constants.TARJETAS[9] + ", " + Constants.TARJETAS[8];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 35000 && cliente.getMonthSalary() <= 49999) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 23) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[9];
			}else if(cliente.getAge() >= 24 && cliente.getAge() <= 75){
				tipoTarjeta = "Options: " + Constants.TARJETAS[9] + ", " + Constants.TARJETAS[8];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 50000) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 22) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[9];
			}else if(cliente.getAge() >= 23 && cliente.getAge() <= 75) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[8];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else {
			tipoTarjeta = Constants.NOOPTION;
		}
		return tipoTarjeta;
	}
	
	@Override
	public String getTypeHelp(Cliente cliente) {
		String tipoTarjeta = "";
		if(cliente.getMonthSalary() >= 12000 && (cliente.getAge() >= 18 && cliente.getAge() <= 75)) {
			tipoTarjeta = "Options: " + Constants.TARJETAS[10] + ", " + Constants.TARJETAS[11];
		}else {
			tipoTarjeta = Constants.NOOPTION;
		}
		return tipoTarjeta;
	}
	
	@Override
	public String getTypeMyBusiness(Cliente cliente) {
		String tipoTarjeta = "";
		if(cliente.getMonthSalary() >= 7000 && (cliente.getAge() >= 18 && cliente.getAge() <= 75)) {
			tipoTarjeta = "Options: " + Constants.TARJETAS[3] + ", " + Constants.TARJETAS[4]+ ", " + Constants.TARJETAS[5]+ ", " + Constants.TARJETAS[6];
		}else {
			tipoTarjeta = Constants.NOOPTION;
		}
		return tipoTarjeta;
	}
	
	@Override
	public String getTypeSports(Cliente cliente) {
		String tipoTarjeta = "";
		if(cliente.getMonthSalary() >= 7000 &&  cliente.getMonthSalary() <= 34999 && (cliente.getAge() >= 18 && cliente.getAge() <= 75)) {
			tipoTarjeta = "Options: " + Constants.TARJETAS[12] + ", " + Constants.TARJETAS[13]+ ", " + Constants.TARJETAS[14]+ ", " + Constants.TARJETAS[15]+ ", " + Constants.TARJETAS[16];
		}else if(cliente.getMonthSalary() >= 35000 && (cliente.getAge() >= 18 && cliente.getAge() <= 75)) {
			tipoTarjeta = "Options: " + Constants.TARJETAS[17];
		}else {
			tipoTarjeta = Constants.NOOPTION;
		}
		return tipoTarjeta;
	}
	
	@Override
	public String getTypeMyStyle(Cliente cliente) {
		String tipoTarjeta = "";
		if(cliente.getMonthSalary() >= 7000 && cliente.getMonthSalary() <= 14999) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 32) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0]+ ", " + Constants.TARJETAS[1];
			}else if((cliente.getAge() >= 33 && cliente.getAge() <= 75)) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if((cliente.getMonthSalary() >= 15000 && cliente.getMonthSalary() <= 29999)) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 23) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0]+ ", " + Constants.TARJETAS[1];
			}else if(cliente.getAge() >= 24 && cliente.getAge() <= 32){
				tipoTarjeta = "Options: " + Constants.TARJETAS[0] + ", " + Constants.TARJETAS[7]+ ", " + Constants.TARJETAS[1];
			}else if(cliente.getAge() >= 33 && cliente.getAge() <= 75){
				tipoTarjeta = "Options: " + Constants.TARJETAS[7];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 30000 && cliente.getMonthSalary() <= 34999) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 23) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0]+ ", " + Constants.TARJETAS[1];
			}else if(cliente.getAge() >= 24 && cliente.getAge() <= 32){
				tipoTarjeta = "Options: " + Constants.TARJETAS[0] + ", " + Constants.TARJETAS[8]+ ", " + Constants.TARJETAS[1];
			}else if(cliente.getAge() >= 33 && cliente.getAge() <= 75){
				tipoTarjeta = "Options: " + Constants.TARJETAS[8];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else if(cliente.getMonthSalary() >= 35000) {
			if(cliente.getAge() >= 18 && cliente.getAge() <= 23) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0];
			}else if(cliente.getAge() >= 24 && cliente.getAge() <= 75) {
				tipoTarjeta = "Options: " + Constants.TARJETAS[0]+ ", " + Constants.TARJETAS[8];
			}else {
				tipoTarjeta = Constants.NOOPTION;
			}
		}else {
			tipoTarjeta = Constants.NOOPTION;
		}
		return tipoTarjeta;
	}
	

}
