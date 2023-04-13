package com.controller;

import com.dao.AddressDao;
import com.dao.CountryDao;

public class AddressController {

	private AddressDao addressDao;
	private CountryDao countryDao;
	
	public AddressController(CountryDao countryDao)
	{
		this.countryDao = countryDao;
	}
	
	public AddressDao getAddressDao() {
		return addressDao;
	}

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}
	
	public CountryDao getCountrydao() {
		return countryDao;
	}
	
//	public void setCountrydao(CountryDao countrydao) {
//		this.countryDao = countrydao;
//	}
	
	
	
	
}
