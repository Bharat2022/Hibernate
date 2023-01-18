package com.maven.OnetoOne;
import java.util.Date;
public class License {
	private int licenseId;
	private Date issuseDate;
	private Date expireDate;
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
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
}
