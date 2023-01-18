package com.maven.OnetoOne;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table
public class LicenseAn {
	@Id
	@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen",strategy = "foreign", parameters = @Parameter(name="property",value = "person"))
	private int licenseId;
	@Column
	private Date issuseDate;
	@Column
	private Date expireDate;
	@OneToOne
	@PrimaryKeyJoinColumn
	private PersonAn person;
	public int getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}
	public Date getIssuseDate() {
		return issuseDate;
	}
	public void setIssuseDate(Date issuseDate) {
		this.issuseDate = issuseDate;
	}
	public PersonAn getPerson() {
		return person;
	}
	public void setPerson(PersonAn person) {
		this.person = person;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
}
