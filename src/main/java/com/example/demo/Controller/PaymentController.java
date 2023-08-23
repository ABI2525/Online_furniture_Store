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

import com.example.demo.Model.Payment;
import com.example.demo.Service.PaymentService;

@RestController
public class PaymentController {
   @Autowired
   PaymentService s;
   @PostMapping("addnew2")
	public List<Payment> add(@RequestBody List<Payment> ss)
	{
		return s.saveinfo(ss);
	}
	
	@GetMapping("show2")
	public List<Payment> show(@RequestBody List<Payment> ss)
	{
		return s.showinfo();
	}
	
	@GetMapping("show2/{id}")
	public Optional<Payment> Show(@PathVariable int id)
	{
		return s.showbyid(id);
	}
	
	@PutMapping("update2")
	public Payment Update(@RequestBody Payment ss){
		return s.changeinfo(ss);
	}
	
	@PutMapping("update2/{id}")
	public String  Updatebyid(@PathVariable int id,Payment ss)
	{
		return s.changebyid(id, ss);
	}
	
	@DeleteMapping("delete2")
	public String Delete(@RequestBody Payment ss)
	{
		return s.deleteinfo(ss);
	}
	@DeleteMapping("delete2/{id}")
	
	public String Deletebyid(@PathVariable int id)
	{
		s.deleteId(id);
		return "Deleted Sucessfully";
	}
}
