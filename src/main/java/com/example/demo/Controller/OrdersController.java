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

import com.example.demo.Model.Orders;
import com.example.demo.Service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
    OrdersService s;
	@PostMapping("addnew1")
	public List<Orders> add(@RequestBody List<Orders> ss)
	{
		return s.saveinfo(ss);
	}
	
	@GetMapping("show1")
	public List<Orders> show(@RequestBody List<Orders> ss)
	{
		return s.showinfo();
	}
	
	@GetMapping("show1/{id}")
	public Optional<Orders> Show(@PathVariable int id)
	{
		return s.showbyid(id);
	}
	
	@PutMapping("update1")
	public Orders Update(@RequestBody Orders ss){
		return s.changeinfo(ss);
	}
	
	@PutMapping("update1/{id}")
	public String  Updatebyid(@PathVariable int id,Orders ss)
	{
		return s.changebyid(id, ss);
	}
	
	@DeleteMapping("delete1")
	public String Delete(@RequestBody Orders ss)
	{
		return s.deleteinfo(ss);
	}
	@DeleteMapping("delete1/{id}")
	
	public String Deletebyid(@PathVariable int id)
	{
		s.deleteId(id);
		return "Deleted Sucessfully";
	}
}
