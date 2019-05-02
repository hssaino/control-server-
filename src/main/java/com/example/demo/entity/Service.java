/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;


import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Service  {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private long id;
   
    private String nom;
    
    

    public Service() {
    }

    public Service(long id) {
        this.id = id;
    }

    public Service(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   

  
    


    @Override
    public String toString() {
        return "entity.Service[ id=" + id + " ]";
    }
    
}
