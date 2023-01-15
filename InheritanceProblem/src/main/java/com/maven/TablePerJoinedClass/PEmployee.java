package com.maven.TablePerJoinedClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PEmpJoin")
@PrimaryKeyJoinColumn(name = "eid")
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
