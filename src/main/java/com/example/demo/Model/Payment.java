package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {
 
	@Id
	private int PaymentMethodID;
	
	private int CustomerID;
	
	private String PaymentType;
	
	private long CardNumber;
	
	private String ExpiryDate;
	
	private String BillingAddress;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentMethodID, int customerID, String paymentType, long cardNumber, String expiryDate,
			String billingAddress) {
		super();
		PaymentMethodID = paymentMethodID;
		CustomerID = customerID;
		PaymentType = paymentType;
		CardNumber = cardNumber;
		ExpiryDate = expiryDate;
		BillingAddress = billingAddress;
	}

	public int getPaymentMethodID() {
		return PaymentMethodID;
	}

	public void setPaymentMethodID(int paymentMethodID) {
		PaymentMethodID = paymentMethodID;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getPaymentType() {
		return PaymentType;
	}

	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}

	public long getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

	public String getBillingAddress() {
		return BillingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		BillingAddress = billingAddress;
	}
	
	
}
