package com.maven.TablePerHierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Contract Emp")
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
