package com.example.demo.dao;

import java.util.List;



public interface Idao<T> {
	List<T> getGetAll();
	void add(T t);
	void update (T t);
	void delete (int id);
	T findById(long id);

}
