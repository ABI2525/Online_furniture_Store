	package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
  @Id
  private int orderId;
  
  private int customerId;
  
  private int productId;
  
  private long totalAmount;
  
  private String orderStatus;

public Orders() {
	super();
	// TODO Auto-generated constructor stub
}

public Orders(int orderId, int customerId, int productId, long totalAmount, String orderStatus) {
	super();
	this.orderId = orderId;
	this.customerId = customerId;
	this.productId = productId;
	this.totalAmount = totalAmount;
	this.orderStatus = orderStatus;
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public long getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(long totalAmount) {
	this.totalAmount = totalAmount;
}

public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
 
  
  
  
}
