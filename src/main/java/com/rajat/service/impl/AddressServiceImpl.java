package com.rajat.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.entity.Address;
import com.rajat.repo.AddressRepo;
import com.rajat.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressRepo repo;
	
	public List<Address> getAddress(int roll) {
		
//		Address address1 = new Address(1, "New York", "NY", 1);
//        Address address2 = new Address(2, "London", "UK", 102);
//        Address address3 = new Address(3, "Paris", "France", 1);
//        
//        List<Address> addresses = new ArrayList<Address>();
//        addresses.add(address1);
//        addresses.add(address3);
		
		List<Address> addresses = repo.findAll();
		List<Address> list = new ArrayList();
		for(Address address: addresses) {
			if(address.getRollOfStudent()==roll) {
				list.add(address);
			}
		}
        
		return list;
	}

	public List<Address> saveAddress(List<Address> address) {
		
		List<Address> adds = repo.saveAll(address);
		
		return adds;
	}

}
