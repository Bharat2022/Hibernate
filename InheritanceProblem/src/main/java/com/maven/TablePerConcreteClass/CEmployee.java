package com.maven.TablePerConcreteClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CEmp1")
public class CEmployee extends Employee{
	@Column
	private double Hrate;

	public double getHrate() {
		return Hrate;
	}

	public void setHrate(double hrate) {
		Hrate = hrate;
	}
	
	
}
