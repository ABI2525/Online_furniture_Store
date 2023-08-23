package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Feedback")
public class Feedback {
   @Id
   private int ratingId;
   
   private int customerId;
   
   private int ProductId;
   
   private String feedback;

public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}

public Feedback(int ratingId, int customerId, int productId, String feedback) {
	super();
	this.ratingId = ratingId;
	this.customerId = customerId;
	ProductId = productId;
	this.feedback = feedback;
}

public int getRatingId() {
	return ratingId;
}

public void setRatingId(int ratingId) {
	this.ratingId = ratingId;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public int getProductId() {
	return ProductId;
}

public void setProductId(int productId) {
	ProductId = productId;
}

public String getFeedback() {
	return feedback;
}

public void setFeedback(String feedback) {
	this.feedback = feedback;
}
   
   
}
