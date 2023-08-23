package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Cart;
import com.example.demo.Repositories.CartRepo;

@Service
public class CartService {

	@Autowired
	CartRepo r;
	
	   
	   public List<Cart> saveinfo(List<Cart> ss)
	 	{
	 		return (List<Cart>)r.saveAll(ss);
	 	}
	 	
	 	public List<Cart> showinfo()
	 	{
	 		return r.findAll();
	 	}
	 	
	 	public Optional<Cart> showbyid(int id)
	 	{
	 		return r.findById(id);
	 	}
	 	public Cart changeinfo(Cart ss)
	 	{
	 		return r.saveAndFlush(ss);
	 	}
	 	public String changebyid(int id,Cart ss)
	 	{
	 	    r.saveAndFlush(ss);
	 		if(r.existsById(id))
	 		{
	 		  return "updated Suscessfully";
	 		}
	 		return "Invalid id";
	 	}
	 	public String deleteinfo(Cart ss)
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
