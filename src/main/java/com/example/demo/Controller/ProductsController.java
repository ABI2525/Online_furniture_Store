package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Products;
import com.example.demo.Service.ProductsService;

@RestController
public class ProductsController {
  
	@Autowired 
	ProductsService s;
	@PostMapping("addnew3")
	public List<Products> add(@RequestBody List<Products> ss)
	{
		return s.saveinfo(ss);
	}
	
	@GetMapping("show3")
	public List<Products> show(@RequestBody List<Products> ss)
	{
		return s.showinfo();
	}
	
	@GetMapping("show3/{id}")
	public Optional<Products> Show(@PathVariable int id)
	{
		return s.showbyid(id);
	}
	
	@PutMapping("update3")
	public Products Update(@RequestBody Products ss){
		return s.changeinfo(ss);
	}
	
	@PutMapping("update3/{id}")
	public String  Updatebyid(@PathVariable int id,Products ss)
	{
		return s.changebyid(id, ss);
	}
	
	@DeleteMapping("delete3")
	public String Delete(@RequestBody Products ss)
	{
		return s.deleteinfo(ss);
	}
	@DeleteMapping("delete3/{id}")
	
	public String Deletebyid(@PathVariable int id)
	{
		s.deleteId(id);
		return "Deleted Sucessfully";
	}
}
