package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employe;
import com.example.demo.entity.Service;
import com.example.demo.repository.ChartRepository;
import com.example.demo.repository.EmployeRepository;
import com.example.demo.repository.ServiceRepository;
import com.example.demo.service.ServiceService;

@SpringBootApplication
public class GestProdApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext ctx = SpringApplication.run(GestProdApplication.class, args);
		
		ServiceRepository serviceRepository = ctx.getBean(ServiceRepository.class);
		
		EmployeRepository employeRepository = ctx.getBean(EmployeRepository.class);
		
//			Service s=new Service(1,"s1");
//		
//			serviceRepository.save(s);
//			
//			employeRepository.save(new Employe(1, "abd", "hss", "email2", "tel2",s));
//			
//			Service s1=new Service(2,"s2");
//			
//			serviceRepository.save(s1);
//			
//			employeRepository.save(new Employe(1, "aaa", "sss", "email2", "tel2",s));
	
	}
}
