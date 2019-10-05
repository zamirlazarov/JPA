package com.johnbryce.user.repo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

	private long id;
	private String name;
	private String education;
	private String gender;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, String education, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.education = education;
		this.gender = gender;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	@Column
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", education=" + education + ", gender=" + gender + "]";
	}

}
