package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employe;


public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
