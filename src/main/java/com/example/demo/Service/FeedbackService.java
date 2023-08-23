package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Feedback;
import com.example.demo.Repositories.FeedbackRepo;


@Service
public class FeedbackService {

	 @Autowired
	 FeedbackRepo r;
		public List<Feedback> saveinfo(List<Feedback> ss)
		{
			return (List<Feedback>)r.saveAll(ss);
		}
		
		public List<Feedback> showinfo()
		{
			return r.findAll();
		}
		
		public Optional<Feedback> showbyid(int id)
		{
			return r.findById(id);
		}
		public Feedback changeinfo(Feedback ss)
		{
			return r.saveAndFlush(ss);
		}
		public String changebyid(int id,Feedback ss)
		{
		    r.saveAndFlush(ss);
			if(r.existsById(id))
			{
			  return "updated Suscessfully";
			}
			return "Invalid id";
		}
		public String deleteinfo(Feedback ss)
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
