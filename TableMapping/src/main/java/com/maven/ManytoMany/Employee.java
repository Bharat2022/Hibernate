package com.maven.ManytoMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EmpM2M")
public class Employee {
	@Id
	private int eid;
	@Column
	private String ename;
	@ManyToMany
	@JoinTable(name = "Emp_Project",joinColumns = {@JoinColumn(name="eid")},inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project> projects;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Employee(int eid, String ename, List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
}
