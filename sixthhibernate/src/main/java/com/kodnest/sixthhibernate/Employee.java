package com.kodnest.sixthhibernate;

import java.util.Objects;

import javax.annotation.processing.Generated;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int eid;
	@Column
	String ename;
	@Column
	String esalary;
@ManyToOne
@JoinColumn(name="did",referencedColumnName ="id" )
	Department department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String ename, String esalary, Department department) {
		super();
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;
	}

	public Employee(String ename, String esalary) {
		super();
		this.ename = ename;
		this.esalary = esalary;
	}

	public Employee(int eid, String ename, String esalary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, eid, ename, esalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && eid == other.eid && Objects.equals(ename, other.ename)
				&& Objects.equals(esalary, other.esalary);
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", department=" + department
				+ "]";
	}

}
