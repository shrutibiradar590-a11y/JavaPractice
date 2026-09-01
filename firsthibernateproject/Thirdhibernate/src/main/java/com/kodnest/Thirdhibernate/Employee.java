package com.kodnest.Thirdhibernate;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
	@Table(name = "employee")
	public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private double salary;

	    @Column(nullable = false)
	    private String designation;

	    @Column
	    private String department;

	    // Getters and Setters
	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }
	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }
	    public String getDesignation() { return designation; }
	    public void setDesignation(String designation) {
	    this.designation = designation; }
	    public String getDepartment() { return department; }
	    public void setDepartment(String department) {
	    this.department = department; }
	}


