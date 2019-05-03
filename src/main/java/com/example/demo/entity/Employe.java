/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Employe  extends Personne{

	private String  email;
    private String Telephone;
    
    @ManyToOne
    private Service service;

 
   
   
    public Employe(Integer id, String nom, String prenom,String eml,String tel,Service serv) {
		super(id, nom, prenom);
		
		this.email=eml;
		this.Telephone=tel;
		this.service=serv;
	}

	
    
	public Employe() {
		super();
	}




	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}



	public Service getService() {
		return service;
	}



	public void setService(Service service) {
		this.service = service;
	}

	
    
    
}