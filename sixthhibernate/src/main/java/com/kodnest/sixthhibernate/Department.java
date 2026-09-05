package com.kodnest.sixthhibernate;

import java.util.List;
import java.util.Objects;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String dname;
	@Column
	String location;
	@OneToMany(mappedBy = "department",cascade=CascadeType.ALL)
	List<Employee>employees;

	public Department() {
		super();
	}

	public Department(String dname, String location, List<Employee> employees) {
		super();
		this.dname = dname;
		this.location = location;
		this.employees = employees;
	}

	public Department(String dname, String location) {
		super();
		this.dname = dname;
		this.location = location;
	}

	public Department(int id, String dname, String location, List<Employee> employees) {
		super();
		this.id = id;
		this.dname = dname;
		this.location = location;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dname, employees, id, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(dname, other.dname) && Objects.equals(employees, other.employees) && id == other.id
				&& Objects.equals(location, other.location);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", location=" + location + ", employees=" + employees
				+ "]";
	}

	
	
	
}
