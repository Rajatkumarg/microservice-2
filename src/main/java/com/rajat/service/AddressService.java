package com.rajat.service;

import java.util.List;

import com.rajat.entity.Address;

public interface AddressService {
	public List<Address> getAddress(int roll);
	public List<Address> saveAddress(List<Address> address);
}
