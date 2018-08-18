package com.onetmany.bidirection.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private Integer empId;

	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Employer employer;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", employer=" + employer + "]";
	}

	public Employee(String employeeName, Employer employer) {
		this.employeeName = employeeName;
		this.employer = employer;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
