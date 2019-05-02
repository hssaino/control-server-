package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Idao;
import com.example.demo.entity.Employe;
import com.example.demo.repository.EmployeRepository;


@Service
@Primary
public class EmployeService implements Idao<Employe>{
	
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public List<Employe> getGetAll() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

	@Override
	public void add(Employe t) {
		// TODO Auto-generated method stub
		employeRepository.save(t);
	}

	@Override
	public void update(Employe t) {
		// TODO Auto-generated method stub
		employeRepository.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employe s=new Employe();
		s.setId(id);
		
		employeRepository.delete(s);
	}

	@Override
	public Employe findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	


}
