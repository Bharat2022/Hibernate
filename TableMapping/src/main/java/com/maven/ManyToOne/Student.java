package com.maven.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "studentM2O")
public class Student {
	@Id
	@GeneratedValue
	private int sid;
	@Column
	private String sname;
	@ManyToOne(cascade = CascadeType.ALL)
	private StudentAddress studentaddress;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public StudentAddress getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(StudentAddress studentaddress) {
		this.studentaddress = studentaddress;
	}
}
