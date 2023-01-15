package com.maven.TablePerHierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Parmanent Emp")
public class PEmployee extends Employee {
	@Column
	private double EmpSal;

	public double getEmpSal() {
		return EmpSal;
	}

	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}
	
}
