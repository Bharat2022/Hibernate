package com.maven.OnetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmpAadhar")
public class Employee {
	@Id
	@Column
	private int pid;
	@Column
	private String pname;
	@Column
	private double psal;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private Aadhar aadhar;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPsal() {
		return psal;
	}
	public void setPsal(double psal) {
		this.psal = psal;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
}
