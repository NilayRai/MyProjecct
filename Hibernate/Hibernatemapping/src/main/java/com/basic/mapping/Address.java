package com.basic.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	private String name;

	public Address(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", name=" + name + "]";
	}

	public Address() {
		super();
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
