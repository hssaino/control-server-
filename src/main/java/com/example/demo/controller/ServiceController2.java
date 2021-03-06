package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Idao;
import com.example.demo.entity.Employe;
import com.example.demo.entity.Service;
import com.example.demo.repository.ServiceRepository;
import com.example.demo.service.ServiceService;



@RestController
@RequestMapping("/api/serviceById")
@CrossOrigin
public class ServiceController2 {
    @Autowired
	private Idao<Service> serviceService;
    
    
    
    
    @GetMapping
    public Service findServiceById(int id ){
    	
   
    	return serviceService.findById(id);
    	
    }
    
 
 
    
    
    
    
}
