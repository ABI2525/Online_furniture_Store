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

import com.example.demo.Model.Feedback;
import com.example.demo.Service.FeedbackService;

@RestController
public class FeedbackController {
  @Autowired
  FeedbackService s;
  
  @PostMapping("addnew5")
	public List<Feedback> add(@RequestBody List<Feedback> ss)
	{
		return s.saveinfo(ss);
	}
	
	@GetMapping("show5")
	public List<Feedback> show(@RequestBody List<Feedback> ss)
	{
		return s.showinfo();
	}
	
	@GetMapping("show5/{id}")
	public Optional<Feedback> Show(@PathVariable int id)
	{
		return s.showbyid(id);
	}
	
	@PutMapping("update5")
	public Feedback Update(@RequestBody Feedback ss){
		return s.changeinfo(ss);
	}
	
	@PutMapping("update5/{id}")
	public String  Updatebyid(@PathVariable int id,Feedback ss)
	{
		return s.changebyid(id, ss);
	}
	
	@DeleteMapping("delete5")
	public String Delete(@RequestBody Feedback ss)
	{
		return s.deleteinfo(ss);
	}
	@DeleteMapping("delete5/{id}")
	public String Deletebyid(@PathVariable int id)
	{
		s.deleteId(id);
		return "Deleted Sucessfully";
	}
}
