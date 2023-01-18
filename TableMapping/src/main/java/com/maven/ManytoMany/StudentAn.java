package com.maven.ManytoMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "StudentAnM2M")
public class StudentAn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "students")
	private Set<CourseAn> courses;
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
	public Set<CourseAn> getCourses() {
		return courses;
	}
	public void setCourses(Set<CourseAn> courses) {
		this.courses = courses;
	}
		
	
	
}
