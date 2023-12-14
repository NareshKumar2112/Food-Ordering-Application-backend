package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	private String email;
	private String result;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResult() {
		return result;
	}
	public void setOption(String Result) {
		this.result = result;
	}
}
