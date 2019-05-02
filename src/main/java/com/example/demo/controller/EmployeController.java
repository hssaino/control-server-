package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Idao;
import com.example.demo.entity.Employe;

import com.example.demo.entity.Service;
import com.example.demo.repository.ServiceRepository;



@RestController
@RequestMapping("/api/employe")
@CrossOrigin
public class EmployeController {
    @Autowired
	private Idao<Employe> employeService;
    ServiceRepository serviceRepository;
    
//    @GetMapping
//    public List<Employe> getEmpnoParServices( int idS){
//    	
//    	List<Employe> l=new ArrayList<>();
//    for(int i=0;i<employeService.getGetAll().size();i++) {
//    	
//    		if(employeService.getGetAll().get(i).getIdService().getId()==idS)
//    			l.add(employeService.getGetAll().get(i));
//			
//		}
//    	return l;
//    	
//    }
    
    @GetMapping
    public List<Employe> getEmployes(){
    return employeService.getGetAll();
  	
   }
    
    @PostMapping
    public void addEmploye (@RequestBody Employe produit) {
    	employeService.add(produit);
    }
    
    @PutMapping
    public void updateEmploye(@RequestBody Employe produit) {
    	employeService.update(produit);
    }
    
    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable int id) {
    	employeService.delete(id);
    }
    
    
    
    
}
