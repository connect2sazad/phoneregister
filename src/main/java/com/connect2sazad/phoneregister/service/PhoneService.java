package com.connect2sazad.phoneregister.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.connect2sazad.phoneregister.entity.Phone;

@Service
public class PhoneService {
	
	private List<Phone> phones = new ArrayList<>(Arrays.asList(
			new Phone("avni", "Avni", "7750010279"),
			new Phone("sazad", "Sazad", "8763438208")
		));
	
	public List<Phone> getAllPhones() {
		return phones;
	}
	
	public Phone getPhone(String id) {
		return phones.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addPhone(Phone phone) {
		phones.add(phone);
	}
	
	public void udpatePhone(String id, Phone phone) {
		for (int i = 0; i < phones.size(); i++) {
			Phone p = phones.get(i);
			if(p.getId().equals(id)) {
				phones.set(i, p);
				return;
			} 
		}
	}
}
