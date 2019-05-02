package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demo.entity.Service;

public interface ChartRepository extends Repository<Service, Long>{

	
	@Query(value = "select s.nom,COUNT(e.id) FROM employe e INNER JOIN service s on s.id=e.id_service GROUP by s.nom ",
            nativeQuery=true
    )
    public List<Object> findByTitle();
}
