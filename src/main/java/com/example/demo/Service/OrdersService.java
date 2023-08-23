package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Orders;
import com.example.demo.Repositories.OrdersRepo;

@Service
public class OrdersService {
   @Autowired
   OrdersRepo r;
   
   
   public List<Orders> saveinfo(List<Orders> ss)
 	{
 		return (List<Orders>)r.saveAll(ss);
 	}
 	
 	public List<Orders> showinfo()
 	{
 		return r.findAll();
 	}
 	
 	public Optional<Orders> showbyid(int id)
 	{
 		return r.findById(id);
 	}
 	public Orders changeinfo(Orders ss)
 	{
 		return r.saveAndFlush(ss);
 	}
 	public String changebyid(int id,Orders ss)
 	{
 	    r.saveAndFlush(ss);
 		if(r.existsById(id))
 		{
 		  return "updated Suscessfully";
 		}
 		return "Invalid id";
 	}
 	public String deleteinfo(Orders ss)
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
