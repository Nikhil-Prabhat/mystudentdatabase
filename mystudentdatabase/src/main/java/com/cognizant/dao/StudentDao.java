package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDao {
	public int insert(int id, String name);

	public int delete(int id);

	public int update(int id,String name);
	
	public List<Student> getall();
}
