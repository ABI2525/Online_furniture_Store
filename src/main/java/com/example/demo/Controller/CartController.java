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

import com.example.demo.Model.Cart;
import com.example.demo.Service.CartService;

@RestController
public class CartController {
   @Autowired
   CartService s;
   
   @PostMapping("addnew")
	public List<Cart> add(@RequestBody List<Cart> ss)
	{
		return s.saveinfo(ss);
	}
	
	@GetMapping("show")
	public List<Cart> show(@RequestBody List<Cart> ss)
	{
		return s.showinfo();
	}
	
	@GetMapping("show/{id}")
	public Optional<Cart> Show(@PathVariable int id)
	{
		return s.showbyid(id);
	}
	
	@PutMapping("update")
	public Cart Update(@RequestBody Cart ss){
		return s.changeinfo(ss);
	}
	
	@PutMapping("update/{id}")
	public String  Updatebyid(@PathVariable int id,Cart ss)
	{
		return s.changebyid(id, ss);
	}
	
	@DeleteMapping("delete")
	public String Delete(@RequestBody Cart ss)
	{
		return s.deleteinfo(ss);
	}
	@DeleteMapping("delete/{id}")
	
	public String Deletebyid(@PathVariable int id)
	{
		s.deleteId(id);
		return "Deleted Sucessfully";
	}
}
