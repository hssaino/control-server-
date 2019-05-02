package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;


import com.example.demo.dao.Idao;
import com.example.demo.entity.Service;
import com.example.demo.repository.ChartRepository;
import com.example.demo.repository.ServiceRepository;

@org.springframework.stereotype.Service
@Primary
public class ServiceService implements Idao<com.example.demo.entity.Service>{
	
	@Autowired
	private ServiceRepository serviceRepository;

	@Autowired
	private ChartRepository chartRepository;
	

	@Override
	public List<com.example.demo.entity.Service> getGetAll() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}

	@Override
	public void add(com.example.demo.entity.Service t) {
		// TODO Auto-generated method stub
		serviceRepository.save(t);
	}

	@Override
	public void update(com.example.demo.entity.Service t) {
		// TODO Auto-generated method stub
		serviceRepository.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		com.example.demo.entity.Service s=new com.example.demo.entity.Service();
		s.setId(id);
		
		serviceRepository.delete(s);
	}

		

		@Override
		public Service findById(long id) {
			// TODO Auto-generated method stub
			return  serviceRepository.findById(id).get();
		}
	
		
		public List<Object> list()
	{
			return chartRepository.findByTitle();
		}


}
