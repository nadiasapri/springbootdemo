package com.springbootexample.springbootdemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "car")
@EntityListeners(AuditingEntityListener.class)
public class Car {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "manufacturer", nullable = false)
	private String manufacturer;
	
	@Column(name = "name", nullable = false)
	private String name;

	public Car(int i, String manufacturer, String name) {
		// TODO Auto-generated constructor stub
	        this.manufacturer = manufacturer;
	        this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
