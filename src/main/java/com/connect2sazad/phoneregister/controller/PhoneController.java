package com.connect2sazad.phoneregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.connect2sazad.phoneregister.entity.Phone;
import com.connect2sazad.phoneregister.service.PhoneService;

@RestController
public class PhoneController {
	
	@Autowired
	private PhoneService phoneService;
	
	@RequestMapping("/phones")
	public List<Phone> getAllPhones() {
		return phoneService.getAllPhones();
	}
	
	@GetMapping("/phones/{id}")
	public Phone getPhone(@PathVariable String id) {
		return phoneService.getPhone(id);
	}
	
	@PostMapping("/phones")
	public void addPhone(@RequestBody Phone phone) {
		phoneService.addPhone(phone);
	}
	
	@PutMapping("/phones/{id}")
	public void updatePhone(@RequestBody Phone phone, @PathVariable String id) {
		phoneService.udpatePhone(id, phone);
	}
	
}
