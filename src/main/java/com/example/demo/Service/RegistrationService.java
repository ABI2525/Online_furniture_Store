package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Registration;
import com.example.demo.Repositories.RegistrationRepo;

@Service
public class RegistrationService {
  
	@Autowired
	RegistrationRepo r;
	
	public List<Registration> saveinfo(List<Registration> ss)
	{
		return (List<Registration>)r.saveAll(ss);
	}
	
	public List<Registration> showinfo()
	{
		return r.findAll();
	}
	
	public Optional<Registration> showbyid(int id)
	{
		return r.findById(id);
	}
	public Registration changeinfo(Registration ss)
	{
		return r.saveAndFlush(ss);
	}
	public String changebyid(int id,Registration ss)
	{
	    r.saveAndFlush(ss);
		if(r.existsById(id))
		{
		  return "updated Suscessfully";
		}
		return "Invalid id";
	}
	public String deleteinfo(Registration ss)
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
