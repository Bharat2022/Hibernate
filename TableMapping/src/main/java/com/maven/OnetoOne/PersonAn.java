package com.maven.OnetoOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class PersonAn {
	@Id
	private int personId;
	@Column
	private String personName;
	@OneToOne(mappedBy = "person" , cascade = CascadeType.ALL)
	private LicenseAn license;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public LicenseAn getLicense() {
		return license;
	}
	public void setLicense(LicenseAn license) {
		this.license = license;
	}
}
