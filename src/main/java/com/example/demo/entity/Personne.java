package com.example.demo.entity;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "personne")
@Inheritance(
    strategy = InheritanceType.JOINED
)
public class Personne {

	
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   
	    private Integer id;
	 
	    private String nom;

	    private String prenom;
	    
	    
	    
	public Personne() {
			
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Personne(Integer id, String nom, String prenom) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	
	
	
	

	
	
}
