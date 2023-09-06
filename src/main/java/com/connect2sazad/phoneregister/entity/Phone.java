package com.connect2sazad.phoneregister.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Phone {

	@Id
	private String id;
	private String name;
	private String number;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + ", number=" + number + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
