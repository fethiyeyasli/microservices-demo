package com.fy.orderservice.dto;

import java.io.Serializable;

public class OrderDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private long productId;
	private String customer;
	private String address;
	private int count;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	

}
