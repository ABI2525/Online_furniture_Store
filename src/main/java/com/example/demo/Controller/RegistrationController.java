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

import com.example.demo.Model.Registration;
import com.example.demo.Service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationService s;
	
	@PostMapping("addnew4")
	public List<Registration> add(@RequestBody List<Registration> ss)
	{
		return s.saveinfo(ss);
	}
	
	@GetMapping("show4")
	public List<Registration> show(@RequestBody List<Registration> ss)
	{
		return s.showinfo();
	}
	
	@GetMapping("show4/{id}")
	public Optional<Registration> Show(@PathVariable int id)
	{
		return s.showbyid(id);
	}
	
	@PutMapping("update4")
	public Registration Update(@RequestBody Registration ss){
		return s.changeinfo(ss);
	}
	
	@PutMapping("update4/{id}")
	public String  Updatebyid(@PathVariable int id,Registration ss)
	{
		return s.changebyid(id, ss);
	}
	
	@DeleteMapping("delete4")
	public String Delete(@RequestBody Registration ss)
	{
		return s.deleteinfo(ss);
	}
	@DeleteMapping("delete4/{id}")
	
	public String Deletebyid(@PathVariable int id)
	{
		s.deleteId(id);
		return "Delete SuccessFully";
	}
}
