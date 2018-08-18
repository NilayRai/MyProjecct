package com.onetone.bidirection.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class AnewAddress {
	@Id
	@GeneratedValue
	private int aId;
	private String name;
	@OneToOne(mappedBy = "naddress")
	private AnewStudent anstudent;

	public AnewAddress(String name) {

		this.name = name;
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
