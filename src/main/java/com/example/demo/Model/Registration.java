package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerTable")
public class Registration {
    @Id
    private int id;
    
    private String firstName;
    
    private String lastName;
    
	private long contact;
    
    private String mailId;
     
    private String password;
    
    private String state;
    
    private String address;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddresss() {
		return address;
	}

	public void setAddresss(String address) {
		this.address = address;
	}

	public Registration(int id, String firstName, String lastName, long contact, String mailId, String password,
			String state, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.mailId = mailId;
		this.password = password;
		this.state = state;
		this.address = address;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
