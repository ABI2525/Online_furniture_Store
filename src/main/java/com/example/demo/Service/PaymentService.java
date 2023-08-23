package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Payment;
import com.example.demo.Repositories.PaymentRepo;

@Service
public class PaymentService {

	@Autowired
	PaymentRepo r;
	
	public List<Payment> saveinfo(List<Payment> ss)
	{
		return (List<Payment>)r.saveAll(ss);
	}
	
	public List<Payment> showinfo()
	{
		return r.findAll();
	}
	
	public Optional<Payment> showbyid(int id)
	{
		return r.findById(id);
	}
	public Payment changeinfo(Payment ss)
	{
		return r.saveAndFlush(ss);
	}
	public String changebyid(int id,Payment ss)
	{
	    r.saveAndFlush(ss);
		if(r.existsById(id))
		{
		  return "updated Suscessfully";
		}
		return "Invalid id";
	}
	public String deleteinfo(Payment ss)
	{
	   r.delete(ss);
	   return "Deleted Sucessfully";
	}
	
	public String deleteId(int id)
	{
	   r.deleteById(id);
	   return "Deleted Sucessfully";
	}
}
