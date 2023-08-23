package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Products;
import com.example.demo.Repositories.ProductsRepo;

@Service
public class ProductsService {
  @Autowired
  ProductsRepo r;
  
  public List<Products> saveinfo(List<Products> ss)
	{
		return (List<Products>)r.saveAll(ss);
	}
	
	public List<Products> showinfo()
	{
		return r.findAll();
	}
	
	public Optional<Products> showbyid(int id)
	{
		return r.findById(id);
	}
	public Products changeinfo(Products ss)
	{
		return r.saveAndFlush(ss);
	}
	public String changebyid(int id,Products ss)
	{
	    r.saveAndFlush(ss);
		if(r.existsById(id))
		{
		  return "updated Suscessfully";
		}
		return "Invalid id";
	}
	public String deleteinfo(Products ss)
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
