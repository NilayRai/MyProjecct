package com.onetone.bidirection.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class AnewStudent {
	@Id
	@GeneratedValue
	private int sId;
	@Column
	private String nsname;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "asid")
	private AnewAddress naddress;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getNsname() {
		return nsname;
	}

	public void setNsname(String nsname) {
		this.nsname = nsname;
	}

	public AnewAddress getNaddress() {
		return naddress;
	}

	public void setNaddress(AnewAddress naddress) {
		this.naddress = naddress;
	}

	@Override
	public String toString() {
		return "NewStudent [sId=" + sId + ", nsname=" + nsname + ", naddress=" + naddress + "]";
	}

	public AnewStudent(String nsname, AnewAddress naddress) {
		super();
		this.nsname = nsname;
		this.naddress = naddress;
	}

	public AnewStudent() {
		super();
	}

}
