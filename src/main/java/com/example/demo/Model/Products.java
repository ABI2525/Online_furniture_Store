package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productsDetails")
public class Products {
  @Id
  private int productId;
  private String name;
  private String description;
  private long price;
  private int stockQuantity;
public Products() {
	super();
	// TODO Auto-generated constructor stub
}
public Products(int productId, String name, String description, long price, int stockQuantity) {
	super();
	this.productId = productId;
	this.name = name;
	this.description = description;
	this.price = price;
	this.stockQuantity = stockQuantity;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public int getStockQuantity() {
	return stockQuantity;
}
public void setStockQuantity(int stockQuantity) {
	this.stockQuantity = stockQuantity;
}
  
}
