package com.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity (name="employee_details")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String department;
	private String designation;
	private String manager;
	private int salary;
	private int tax;
	private String date;
	public Employee(int id, String name, String department, String designation, String manager, int salary, int tax,
			String date) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.manager = manager;
		this.salary = salary;
		this.tax = tax;
		this.date = date;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
}
