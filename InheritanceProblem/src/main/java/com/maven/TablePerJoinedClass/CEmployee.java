package com.maven.TablePerJoinedClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CEmpJoin")
@PrimaryKeyJoinColumn(name = "eid")
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
