package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {
   @Id
   private int cartid;
   private int customerId;
   private int productId;
   private int quantity;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartid, int customerId, int productId, int quantity) {
		super();
		this.cartid = cartid;
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
