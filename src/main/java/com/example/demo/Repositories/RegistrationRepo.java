package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer>{

}
