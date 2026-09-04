package com.kodnest.fifthhibernate;

import java.util.List;
import java.util.Objects;

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
public class KodnestStudent {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String email;
	@Column
	String phone;
	
	@OneToMany(mappedBy="kodnestStudent",cascade=CascadeType.ALL)
	List<Course>courses;

	public KodnestStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KodnestStudent(int id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public KodnestStudent(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courses, email, id, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KodnestStudent other = (KodnestStudent) obj;
		return Objects.equals(courses, other.courses) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "KodnestStudent [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", courses="
				+ courses + "]";
	}
	
	
	
}
