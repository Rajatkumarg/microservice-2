package com.rajat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.entity.Address;
import com.rajat.service.impl.AddressServiceImpl;

@RestController
@RequestMapping("address/")
public class AddressController {

	@Autowired
	AddressServiceImpl service;
	
	@GetMapping("getAddress/{roll}")
	public List<Address> getAddress(@PathVariable int roll) {
		
		List<Address> addresses = service.getAddress(roll);
		
		return addresses;
	}
	
	@PostMapping("saveAddress/{address}")
	public List<Address> saveAddress(@PathVariable List<Address> address) {
		
		List<Address> addresses = service.saveAddress(address);
		
		return addresses;
	}
	
}
