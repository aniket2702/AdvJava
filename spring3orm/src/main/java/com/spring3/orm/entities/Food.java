package com.spring3.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity (name="food_details")
public class Food {
	@Id
	private int productId;
	private String productName;
	private int productQuantity;
	private int productPrice;
	public Food(int productId, String productName, int productQuantity, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	
	}
	
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}
