package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sample")
public class Sample {

	@Id
	private String name;
	private int initial;
	private int finalval;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	public int getFinalval() {
		return finalval;
	}
	public void setFinalval(int finalval) {
		this.finalval = finalval;
	}
	
	
}
