package com.maven.CriteriaAPI;

public class Student {
	private int id;
	private String name;
	private double perc;
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
	public Student() {
		super();
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
}
