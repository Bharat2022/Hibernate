package com.maven.OnetoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DealerAnO2M")
public class DealerAn {
	@Id
	private int dealerId;
	@Column
	private String dealerName;
	@OneToMany(fetch = FetchType.LAZY,targetEntity = ProductAn.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "dealerId", referencedColumnName = "dealerId")
	private List <ProductAn> products;
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public List<ProductAn> getProducts() {
		return products;
	}
	public void setProducts(List<ProductAn> products) {
		this.products = products;
	}
	
}
