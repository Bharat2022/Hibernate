package com.maven.TablePerConcreteClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CEmp1")
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
